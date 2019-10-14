package asuna.macros

import asuna.ContextContent

import scala.language.experimental.macros

trait AsunaLabelledGeneric[H] {
  type NameType
  def names: ContextContent[NameType]
}

object AsunaLabelledGeneric {

  def init[M]: AsunaNameGenericApply[M] = new AsunaNameGenericApply[M] {}

  trait AsunaNameGenericApply[M] {
    def name[N](names1: ContextContent[N]): Aux[M, N] = new AsunaLabelledGeneric[M] {
      override type NameType = N
      override def names: ContextContent[N] = names1
    }
  }

  type Aux[H, WW] = AsunaLabelledGeneric[H] { type NameType = WW }

  implicit def appendMacroImpl[H, II]: AsunaLabelledGeneric.Aux[H, II] = macro AsunaLabelledGenericMacroApply.AppendMacroImpl1.generic[H, II]

}

object AsunaLabelledGenericMacroApply {

  class AppendMacroImpl1(val c: scala.reflect.macros.blackbox.Context) {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaLabelledGeneric.Aux[H, M]] = {
      try {
        val h     = c.weakTypeOf[H]
        val hType = h.resultType

        val props = hType.members.toList
          .filter { s =>
            s.isTerm && s.asTerm.isVal && s.asTerm.isCaseAccessor
          }
          .map(s => (s.name, s))
          .collect {
            case (TermName(n), s) =>
              val proName = n.trim
              proName
          }
          .reverse

        val nameTag = props
          .map { name =>
            q"""${Literal(Constant(name))}"""
          }
          .grouped(8)
          .toList
          .map(s => q"""asuna.BuildContent.${TermName("item" + s.length)}(..${s})""")
        def nameTagGen(tree: List[Tree]): Tree =
          if (tree.length == 1) {
            q"""..${tree}"""
          } else if (tree.length < 8) {
            q"""asuna.BuildContent.${TermName("nodeItem" + tree.length)}(..${tree})"""
          } else {
            val groupedTree = tree.grouped(8).toList
            nameTagGen(groupedTree.map(s => q"""asuna.BuildContent.${TermName("nodeItem" + s.length)}(..${s})"""))
          }

        c.Expr[AsunaLabelledGeneric.Aux[H, M]] {
          q"""asuna.macros.AsunaLabelledGeneric.init[${hType}].name(${nameTagGen(nameTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}