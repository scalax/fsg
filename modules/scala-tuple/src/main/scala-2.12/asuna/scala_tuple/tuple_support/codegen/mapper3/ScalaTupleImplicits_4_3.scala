package asuna.scala_tuple.tuple_support
import asuna.Application3
import asuna.Context3
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_4_3 {
implicit def tupleTagApplicationImplicit_tagNum4_typeParamNum3[
F[_  , _  , _ ]
, H1  , H2  , H3  , H4
, X1_C1  , X1_C2  , X1_C3
, X2_C1  , X2_C2  , X2_C3
, X3_C1  , X3_C2  , X3_C3
, X4_C1  , X4_C2  , X4_C3
](implicit t1: Application3[F, H1  , X1_C1  , X1_C2  , X1_C3 ]
, t2: Application3[F, H2  , X2_C1  , X2_C2  , X2_C3 ]  , t3: Application3[F, H3  , X3_C1  , X3_C2  , X3_C3 ]  , t4: Application3[F, H4  , X4_C1  , X4_C2  , X4_C3 ] )
: Application3[
F,
(H1  , H2  , H3  , H4 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1 )  , (X1_C2  , X2_C2  , X3_C2  , X4_C2 )  , (X1_C3  , X2_C3  , X3_C3  , X4_C3 ) ] =
new Application3[
F,
(H1  , H2  , H3  , H4 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1 )  , (X1_C2  , X2_C2  , X3_C2  , X4_C2 )  , (X1_C3  , X2_C3  , X3_C3  , X4_C3 ) ] {
override def application(context: Context3[F]) = {
context.append(
ScalaTupleImplicits_3_3.tupleTagApplicationImplicit_tagNum3_typeParamNum3[
F
, H2  , H3  , H4
, X2_C1  , X2_C2  , X2_C3
, X3_C1  , X3_C2  , X3_C3
, X4_C1  , X4_C2  , X4_C3
].application(context),
t1.application(context)
)(PlusToTuple3.plusWithTypeParameter3)
}
}
}
object ScalaTupleImplicits_4_3 extends ScalaTupleImplicits_4_3