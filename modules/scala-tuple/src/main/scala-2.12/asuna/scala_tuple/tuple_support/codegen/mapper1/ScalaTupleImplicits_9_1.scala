package asuna.scala_tuple.tuple_support
import asuna.Application1
import asuna.Context1
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_9_1 {
implicit def tupleTagApplicationImplicit_tagNum9_typeParamNum1[
F[_ ]
, H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9
, X1_C1
, X2_C1
, X3_C1
, X4_C1
, X5_C1
, X6_C1
, X7_C1
, X8_C1
, X9_C1
](implicit t1: Application1[F, H1  , X1_C1 ]
, t2: Application1[F, H2  , X2_C1 ]  , t3: Application1[F, H3  , X3_C1 ]  , t4: Application1[F, H4  , X4_C1 ]  , t5: Application1[F, H5  , X5_C1 ]  , t6: Application1[F, H6  , X6_C1 ]  , t7: Application1[F, H7  , X7_C1 ]  , t8: Application1[F, H8  , X8_C1 ]  , t9: Application1[F, H9  , X9_C1 ] )
: Application1[
F,
(H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1  , X9_C1 ) ] =
new Application1[
F,
(H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1  , X9_C1 ) ] {
override def application(context: Context1[F]) = {
context.append(
ScalaTupleImplicits_8_1.tupleTagApplicationImplicit_tagNum8_typeParamNum1[
F
, H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9
, X2_C1
, X3_C1
, X4_C1
, X5_C1
, X6_C1
, X7_C1
, X8_C1
, X9_C1
].application(context),
t1.application(context)
)(PlusToTuple1.plusWithTypeParameter8)
}
}
}
object ScalaTupleImplicits_9_1 extends ScalaTupleImplicits_9_1