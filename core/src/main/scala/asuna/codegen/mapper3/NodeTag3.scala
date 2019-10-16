package asuna
import impl._
class NodeTag3[T1 <: ItemTag, M1 <: Message, T2 <: ItemTag, M2 <: Message, T3 <: ItemTag, M3 <: Message] extends ItemTag {
  override type ItemType        = Item3[T1#ItemType, T2#ItemType, T3#ItemType]
  override type M[M <: Message] = NodeTag3[T1, M :-<>-: M1, T2, M :-<>-: M2, T3, M :-<>-: M3]
  def find0: T1#M[`Number： 0`] = throw new Exception("debugging...")
  def find1: T2#M[`Number： 1`] = throw new Exception("debugging...")
  def find2: T3#M[`Number： 2`] = throw new Exception("debugging...")
  def debug[K <: KindContext, I1 <: TypeParameter, I2 <: TypeParameter, I3 <: TypeParameter](c: Context[K])(
    implicit
    dapp1: DebugApplication[K, T1, I1, `Message： Please change .debug(context) to .find0.debug(context).`],
    dapp2: DebugApplication[K, T2, I2, `Message： Please change .debug(context) to .find1.debug(context).`],
    dapp3: DebugApplication[K, T3, I3, `Message： Please change .debug(context) to .find2.debug(context).`]
  ): Application[K, NodeTag3[T1, M1, T2, M2, T3, M3], ItemTypeParameter3[I1, I2, I3]] =
    NodeTag3.noteTagApplicationImplicit3(dapp1, dapp2, dapp3)
}
object NodeTag3 {
  implicit def noteTagApplicationImplicit3[
    K <: KindContext,
    H1 <: ItemTag,
    H2 <: ItemTag,
    H3 <: ItemTag,
    T1 <: TypeParameter,
    M1 <: Message,
    T2 <: TypeParameter,
    M2 <: Message,
    T3 <: TypeParameter,
    M3 <: Message
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3]
  ): Application[K, NodeTag3[H1, M1, H2, M2, H3, M3], ItemTypeParameter3[T1, T2, T3]] =
    new Application[K, NodeTag3[H1, M1, H2, M2, H3, M3], ItemTypeParameter3[T1, T2, T3]] {
      override def application(context: Context[K]): K#M[ItemTypeParameter3[T1, T2, T3]] = {
        if (context.isReverse) {
          context.append[ItemTypeParameter2[T2, T3], T1, ItemTypeParameter3[T1, T2, T3]](
            context.append[ItemTypeParameter1[T3], T2, ItemTypeParameter2[T2, T3]](
              context.append[ItemTypeParameter0, T3, ItemTypeParameter1[T3]](context.start, t3.application(context), ItemTypeParameterPlus1.hlistPlus1),
              t2.application(context),
              ItemTypeParameterPlus2.put2
            ),
            t1.application(context),
            ItemTypeParameterPlus3.put3
          )
//context.append(NodeTag2.noteTagApplicationImplicit2( t2  ,   t3  ).application(context), t1.application(context), ItemTypeParameterPlus3.put3)
        } else {
          context.append[ItemTypeParameter2[T1, T2], T3, ItemTypeParameter3[T1, T2, T3]](
            context.append[ItemTypeParameter1[T1], T2, ItemTypeParameter2[T1, T2]](
              context.append[ItemTypeParameter0, T1, ItemTypeParameter1[T1]](context.start, t1.application(context), ItemTypeParameterPlus1.hlistPlus1),
              t2.application(context),
              ItemTypeParameterPlus2.plus2
            ),
            t3.application(context),
            ItemTypeParameterPlus3.plus3
          )
//context.append(NodeTag2.noteTagApplicationImplicit2( t1  ,   t2  ).application(context), t3.application(context), ItemTypeParameterPlus3.plus3)
        }
      }
    }
}