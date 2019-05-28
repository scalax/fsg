package org.scalax.asuna.mapper.append.debug

import io.circe._
import org.scalax.asuna.ii.item.{TypeParam2, XyyItem0}
import org.scalax.asuna.implements.ByNameImplicit
import org.scalax.asuna.mapper.append.macroImpl.AsunaGeneric
import org.scalax.asuna.mapper.item._

object MacroTest {

  class MapperKou[H] {

    def kou11[M <: org.scalax.asuna.mapper.item.ItemTag, S](implicit ll: AsunaGeneric.Aux[H, M, S]): AsunaGeneric.Aux[H, M, S] = ll

    def kou2[R <: org.scalax.asuna.mapper.item.ItemTag, I <: TypeParam, U](implicit ll: AsunaGeneric.Aux[H, R, U]): ll.II = throw new Exception("pp")

    def kou1[R <: org.scalax.asuna.mapper.item.ItemTag, I <: TypeParam, U](
        implicit ll: AsunaGeneric.Aux[H, R, U]
      , app: Application[KM, R, I]
      , cv1: U <:< I#H
      , cv2: R#XyyItemType <:< I#T#H
      , cv3: I#T#H <:< R#XyyItemType
    ): IIII[H] = {
      app
        .application(ii)
        .compose[H](u = { mm: H =>
          cv2(ll.getter(mm))
        }, p1 = { p: I#T#H =>
          ll.setter(cv3(p))
        })
        .to(cv1(ll.names))
    }

  }

  def kou[T] = new MapperKou[T]

  class KM extends KindContext {
    override type M[P <: TypeParam] = JsonPro[P#T#H, P#H]
  }

  object KM {
    implicit def im[T](implicit t: ByNameImplicit[Encoder[T]], dd: ByNameImplicit[Decoder[T]]): Application[KM, T, TypeParam2[String, T]] =
      new Application[KM, T, TypeParam2[String, T]] {
        override def application(context: Context[KM]): JsonPro[T, String] = {
          new JsonPro[T, String] {
            override def p(name: String, tt: T, m: List[(String, Json)]): List[(String, Json)] = {
              ((name, t.value(tt))) :: m
            }
            override def reverseP(name: String, tt: T, m: List[(String, Json)]): List[(String, Json)] = {
              ((name, t.value(tt))) :: m
            }
            override def d(j: JsonObject, name: String): Either[String, T] = {
              j(name).map(jj => dd.value.decodeJson(jj).left.map(_.message)).getOrElse(Left(s"找不到属性:${name}"))
            }
          }
        }
      }
  }

  trait IIII[I] {
    def encoder: ObjectEncoder[I]
    def reverseEncoder: ObjectEncoder[I]
    def decoder: Decoder[I]
  }

  trait JsonPro[T, II] {
    self =>

    def p(name: II, obj: T, m: List[(String, Json)]): List[(String, Json)]
    def reverseP(name: II, obj: T, m: List[(String, Json)]): List[(String, Json)]
    def d(j: JsonObject, name: II): Either[String, T]

    def compose[P](u: P => T, p1: T => P): JsonPro[P, II] = new JsonPro[P, II] {
      override def p(name: II, t: P, m: List[(String, Json)]): List[(String, Json)]        = self.p(name, u(t), m)
      override def reverseP(name: II, t: P, m: List[(String, Json)]): List[(String, Json)] = self.reverseP(name, u(t), m)
      override def d(jj: JsonObject, name: II): Either[String, P]                          = self.d(jj, name).right.map(p1)
    }

    def to(name: II): IIII[T] = new IIII[T] {
      override val encoder: ObjectEncoder[T] = new ObjectEncoder[T] {
        override def encodeObject(a: T): JsonObject = {
          JsonObject.fromIterable(self.p(name, a, List.empty))
        }
      }
      override def reverseEncoder: ObjectEncoder[T] = new ObjectEncoder[T] {
        override def encodeObject(a: T): JsonObject = {
          JsonObject.fromIterable(self.reverseP(name, a, List.empty))
        }
      }
      override val decoder: Decoder[T] = Decoder.decodeJsonObject.emap(j => d(j, name))
    }

  }

  object ii extends Context[KM] {
    override def isReverse: Boolean = false
    override def useHList: Boolean  = true

    override def append[X <: TypeParam, Y <: TypeParam, Z <: TypeParam](x: JsonPro[X#T#H, X#H], y: JsonPro[Y#T#H, Y#H], plus: Plus[X, Y, Z]): JsonPro[Z#T#H, Z#H] = {
      new JsonPro[Z#T#H, Z#H] {
        override def p(name: Z#H, t: Z#T#H, m: List[(String, Json)]): List[(String, Json)] = {
          val namex = plus.takeHead(name)
          val namey = plus.takeTail(name)

          val itemx = plus.sub.takeHead(t)
          val itemy = plus.sub.takeTail(t)

          y.p(namex, itemx, x.p(namey, itemy, m))
        }

        override def reverseP(name: Z#H, t: Z#T#H, m: List[(String, Json)]): List[(String, Json)] = {
          val namex = plus.takeHead(name)
          val namey = plus.takeTail(name)

          val itemx = plus.sub.takeHead(t)
          val itemy = plus.sub.takeTail(t)

          x.reverseP(namey, itemy, y.reverseP(namex, itemx, m))
        }

        override def d(j: JsonObject, name: Z#H): Either[String, Z#T#H] = {
          val (xx1, yy1) = (plus.takeHead(name), plus.takeTail(name))
          x.d(j, yy1).right.flatMap { x1 =>
            y.d(j, xx1).right.map { y1 =>
              plus.sub.plus(x1, y1)
            }
          }
        }
      }
    }

    override def start: JsonPro[XyyItem0, XyyItem0] = {
      new JsonPro[XyyItem0, XyyItem0] {
        override def reverseP(name: XyyItem0, t: XyyItem0, m: List[(String, Json)]): List[(String, Json)] = m
        override def p(name: XyyItem0, t: XyyItem0, m: List[(String, Json)]): List[(String, Json)]        = m
        override def d(j: JsonObject, name: XyyItem0): Either[String, XyyItem0]                           = Right(new XyyItem0 {})
      }
    }
  }

  class ItemPP[T2] extends TypeParam {
    override type H = String
    override type T = ItemP1

    class ItemP1 extends TypeParam {
      override type H = T2
      override type T = EndParam
    }
  }

}
