package asuna.scala_tuple.tuple_support
import asuna.Application1
import asuna.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_5_1 {
         given  tupleTagApplicationImplicit_tagNum5_typeParamNum1[
            F[_],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5
        ]( using 
        t1: Application1[F, Plus1_X1] , t2: Application1[F, Plus1_X2] , t3: Application1[F, Plus1_X3] , t4: Application1[F, Plus1_X4] , t5: Application1[F, Plus1_X5])  as  Application1[
            F,
            Tuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5]
        ] = new Application1[
            F,
            Tuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5]
        ] {
            override def application(context: Context1[F]): F[
                Tuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5]
            ] = {
                val implicitApplication = implicitly[Application1[F, asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus1_X1 , Plus1_X2] , asuna.AsunaTuple2[Plus1_X3 , Plus1_X4]] , asuna.AsunaTuple1[asuna.AsunaTuple1[Plus1_X5]]]
                ]]
                context.append(implicitApplication.application(context), context.start)(PlusToTuple1.plus1WithTypeParameter5)
            }
        }
}
object ScalaTupleImplicits_5_1 extends ScalaTupleImplicits_5_1
