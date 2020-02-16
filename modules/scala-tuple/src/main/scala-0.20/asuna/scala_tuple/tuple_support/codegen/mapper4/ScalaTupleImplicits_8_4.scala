package asuna.scala_tuple.tuple_support
import asuna.Application4
import asuna.Context4
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_8_4 {
given tupleTagApplicationImplicit_tagNum8_typeParamNum4[
F[_  , _  , _  , _ ]
, H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8
, X1_C1  , X1_C2  , X1_C3  , X1_C4
, X2_C1  , X2_C2  , X2_C3  , X2_C4
, X3_C1  , X3_C2  , X3_C3  , X3_C4
, X4_C1  , X4_C2  , X4_C3  , X4_C4
, X5_C1  , X5_C2  , X5_C3  , X5_C4
, X6_C1  , X6_C2  , X6_C3  , X6_C4
, X7_C1  , X7_C2  , X7_C3  , X7_C4
, X8_C1  , X8_C2  , X8_C3  , X8_C4
](given t1: Application4[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4 ]
, t2: Application4[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4 ]  , t3: Application4[F, H3  , X3_C1  , X3_C2  , X3_C3  , X3_C4 ]  , t4: Application4[F, H4  , X4_C1  , X4_C2  , X4_C3  , X4_C4 ]  , t5: Application4[F, H5  , X5_C1  , X5_C2  , X5_C3  , X5_C4 ]  , t6: Application4[F, H6  , X6_C1  , X6_C2  , X6_C3  , X6_C4 ]  , t7: Application4[F, H7  , X7_C1  , X7_C2  , X7_C3  , X7_C4 ]  , t8: Application4[F, H8  , X8_C1  , X8_C2  , X8_C3  , X8_C4 ] )
: Application4[
F,
(H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1 )  , (X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2  , X8_C2 )  , (X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3  , X8_C3 )  , (X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4  , X7_C4  , X8_C4 ) ] =
new Application4[
F,
(H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1 )  , (X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2  , X8_C2 )  , (X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3  , X8_C3 )  , (X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4  , X7_C4  , X8_C4 ) ] {
override def application(context: Context4[F]) = {
context.append(
ScalaTupleImplicits_7_4.tupleTagApplicationImplicit_tagNum7_typeParamNum4[
F
, H2  , H3  , H4  , H5  , H6  , H7  , H8
, X2_C1  , X2_C2  , X2_C3  , X2_C4
, X3_C1  , X3_C2  , X3_C3  , X3_C4
, X4_C1  , X4_C2  , X4_C3  , X4_C4
, X5_C1  , X5_C2  , X5_C3  , X5_C4
, X6_C1  , X6_C2  , X6_C3  , X6_C4
, X7_C1  , X7_C2  , X7_C3  , X7_C4
, X8_C1  , X8_C2  , X8_C3  , X8_C4
].application(context),
t1.application(context)
)(PlusToTuple4.plusWithTypeParameter7)
}
}
}
object ScalaTupleImplicits_8_4 extends ScalaTupleImplicits_8_4