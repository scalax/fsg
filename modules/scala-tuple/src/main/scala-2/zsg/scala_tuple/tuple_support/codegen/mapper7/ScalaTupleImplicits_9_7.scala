package zsg.scala_tuple.tuple_support
import zsg.ApplicationX7
import zsg.Context7
import scala.language.higherKinds
trait ScalaTupleImplicits_9_7 {
  implicit def tupleTagApplicationImplicit_tagNum9_typeParamNum7[
    F[_, _, _, _, _, _, _],
    T <: Context7[F],
    Plus1_X1,
    Plus1_X2,
    Plus1_X3,
    Plus1_X4,
    Plus1_X5,
    Plus1_X6,
    Plus1_X7,
    Plus1_X8,
    Plus1_X9,
    Plus2_X1,
    Plus2_X2,
    Plus2_X3,
    Plus2_X4,
    Plus2_X5,
    Plus2_X6,
    Plus2_X7,
    Plus2_X8,
    Plus2_X9,
    Plus3_X1,
    Plus3_X2,
    Plus3_X3,
    Plus3_X4,
    Plus3_X5,
    Plus3_X6,
    Plus3_X7,
    Plus3_X8,
    Plus3_X9,
    Plus4_X1,
    Plus4_X2,
    Plus4_X3,
    Plus4_X4,
    Plus4_X5,
    Plus4_X6,
    Plus4_X7,
    Plus4_X8,
    Plus4_X9,
    Plus5_X1,
    Plus5_X2,
    Plus5_X3,
    Plus5_X4,
    Plus5_X5,
    Plus5_X6,
    Plus5_X7,
    Plus5_X8,
    Plus5_X9,
    Plus6_X1,
    Plus6_X2,
    Plus6_X3,
    Plus6_X4,
    Plus6_X5,
    Plus6_X6,
    Plus6_X7,
    Plus6_X8,
    Plus6_X9,
    Plus7_X1,
    Plus7_X2,
    Plus7_X3,
    Plus7_X4,
    Plus7_X5,
    Plus7_X6,
    Plus7_X7,
    Plus7_X8,
    Plus7_X9
  ](implicit
    t1: F[Plus1_X1, Plus2_X1, Plus3_X1, Plus4_X1, Plus5_X1, Plus6_X1, Plus7_X1],
    t2: F[Plus1_X2, Plus2_X2, Plus3_X2, Plus4_X2, Plus5_X2, Plus6_X2, Plus7_X2],
    t3: F[Plus1_X3, Plus2_X3, Plus3_X3, Plus4_X3, Plus5_X3, Plus6_X3, Plus7_X3],
    t4: F[Plus1_X4, Plus2_X4, Plus3_X4, Plus4_X4, Plus5_X4, Plus6_X4, Plus7_X4],
    t5: F[Plus1_X5, Plus2_X5, Plus3_X5, Plus4_X5, Plus5_X5, Plus6_X5, Plus7_X5],
    t6: F[Plus1_X6, Plus2_X6, Plus3_X6, Plus4_X6, Plus5_X6, Plus6_X6, Plus7_X6],
    t7: F[Plus1_X7, Plus2_X7, Plus3_X7, Plus4_X7, Plus5_X7, Plus6_X7, Plus7_X7],
    t8: F[Plus1_X8, Plus2_X8, Plus3_X8, Plus4_X8, Plus5_X8, Plus6_X8, Plus7_X8],
    t9: F[Plus1_X9, Plus2_X9, Plus3_X9, Plus4_X9, Plus5_X9, Plus6_X9, Plus7_X9]
  ): ApplicationX7[
    F,
    T,
    Tuple9[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7, Plus1_X8, Plus1_X9],
    Tuple9[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7, Plus2_X8, Plus2_X9],
    Tuple9[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6, Plus3_X7, Plus3_X8, Plus3_X9],
    Tuple9[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5, Plus4_X6, Plus4_X7, Plus4_X8, Plus4_X9],
    Tuple9[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4, Plus5_X5, Plus5_X6, Plus5_X7, Plus5_X8, Plus5_X9],
    Tuple9[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4, Plus6_X5, Plus6_X6, Plus6_X7, Plus6_X8, Plus6_X9],
    Tuple9[Plus7_X1, Plus7_X2, Plus7_X3, Plus7_X4, Plus7_X5, Plus7_X6, Plus7_X7, Plus7_X8, Plus7_X9]
  ] = new ApplicationX7[
    F,
    T,
    Tuple9[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7, Plus1_X8, Plus1_X9],
    Tuple9[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7, Plus2_X8, Plus2_X9],
    Tuple9[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6, Plus3_X7, Plus3_X8, Plus3_X9],
    Tuple9[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5, Plus4_X6, Plus4_X7, Plus4_X8, Plus4_X9],
    Tuple9[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4, Plus5_X5, Plus5_X6, Plus5_X7, Plus5_X8, Plus5_X9],
    Tuple9[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4, Plus6_X5, Plus6_X6, Plus6_X7, Plus6_X8, Plus6_X9],
    Tuple9[Plus7_X1, Plus7_X2, Plus7_X3, Plus7_X4, Plus7_X5, Plus7_X6, Plus7_X7, Plus7_X8, Plus7_X9]
  ] {
    override def application(context: T) = {
      context.append(
        ApplicationFetchContent
          .app7[
            F,
            T,
            zsg.ZTuple9[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7, Plus1_X8, Plus1_X9],
            zsg.ZTuple9[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7, Plus2_X8, Plus2_X9],
            zsg.ZTuple9[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6, Plus3_X7, Plus3_X8, Plus3_X9],
            zsg.ZTuple9[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5, Plus4_X6, Plus4_X7, Plus4_X8, Plus4_X9],
            zsg.ZTuple9[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4, Plus5_X5, Plus5_X6, Plus5_X7, Plus5_X8, Plus5_X9],
            zsg.ZTuple9[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4, Plus6_X5, Plus6_X6, Plus6_X7, Plus6_X8, Plus6_X9],
            zsg.ZTuple9[Plus7_X1, Plus7_X2, Plus7_X3, Plus7_X4, Plus7_X5, Plus7_X6, Plus7_X7, Plus7_X8, Plus7_X9]
          ]
          .application(context),
        context.start
      )(PlusToTuple7.plus7WithTypeParameter9)
    }
  }
}
object ScalaTupleImplicits_9_7 extends ScalaTupleImplicits_9_7
