package asuna.scala_tuple.tuple_support
import asuna.Application1
import asuna.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_2_1 {
         given  tupleTagApplicationImplicit_tagNum2_typeParamNum1[
            F[_],
            Plus1_X1 , Plus1_X2
        ]( using 
        t1: Application1[F, Plus1_X1] , t2: Application1[F, Plus1_X2])  as  Application1[
            F,
            Tuple2[Plus1_X1 , Plus1_X2]
        ] = new Application1[
            F,
            Tuple2[Plus1_X1 , Plus1_X2]
        ] {
            override def application(context: Context1[F]): F[
                Tuple2[Plus1_X1 , Plus1_X2]
            ] = {
                context.append(t2.application(context), t1.application(context))(PlusToTuple1.plus1WithTypeParameter2)
            }
        }
}
object ScalaTupleImplicits_2_1 extends ScalaTupleImplicits_2_1
