package asuna.scala_tuple.tuple_support
import asuna.Application8
import asuna.Context8
import scala.language.higherKinds
trait ScalaTupleImplicits_3_8 {
         implicit def  tupleTagApplicationImplicit_tagNum3_typeParamNum8[
            F[_ , _ , _ , _ , _ , _ , _ , _],
            Plus1_X1 , Plus1_X2 , Plus1_X3,
            Plus2_X1 , Plus2_X2 , Plus2_X3,
            Plus3_X1 , Plus3_X2 , Plus3_X3,
            Plus4_X1 , Plus4_X2 , Plus4_X3,
            Plus5_X1 , Plus5_X2 , Plus5_X3,
            Plus6_X1 , Plus6_X2 , Plus6_X3,
            Plus7_X1 , Plus7_X2 , Plus7_X3,
            Plus8_X1 , Plus8_X2 , Plus8_X3
        ]( implicit 
        t1: Application8[F, Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1 , Plus5_X1 , Plus6_X1 , Plus7_X1 , Plus8_X1] , t2: Application8[F, Plus1_X2 , Plus2_X2 , Plus3_X2 , Plus4_X2 , Plus5_X2 , Plus6_X2 , Plus7_X2 , Plus8_X2] , t3: Application8[F, Plus1_X3 , Plus2_X3 , Plus3_X3 , Plus4_X3 , Plus5_X3 , Plus6_X3 , Plus7_X3 , Plus8_X3])  :  Application8[
            F,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3],
            Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3],
            Tuple3[Plus5_X1 , Plus5_X2 , Plus5_X3],
            Tuple3[Plus6_X1 , Plus6_X2 , Plus6_X3],
            Tuple3[Plus7_X1 , Plus7_X2 , Plus7_X3],
            Tuple3[Plus8_X1 , Plus8_X2 , Plus8_X3]
        ] = new Application8[
            F,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3],
            Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3],
            Tuple3[Plus5_X1 , Plus5_X2 , Plus5_X3],
            Tuple3[Plus6_X1 , Plus6_X2 , Plus6_X3],
            Tuple3[Plus7_X1 , Plus7_X2 , Plus7_X3],
            Tuple3[Plus8_X1 , Plus8_X2 , Plus8_X3]
        ] {
            override def application(context: Context8[F]): F[
                Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
                Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
                Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3],
                Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3],
                Tuple3[Plus5_X1 , Plus5_X2 , Plus5_X3],
                Tuple3[Plus6_X1 , Plus6_X2 , Plus6_X3],
                Tuple3[Plus7_X1 , Plus7_X2 , Plus7_X3],
                Tuple3[Plus8_X1 , Plus8_X2 , Plus8_X3]
            ] = {
                val implicitApplication = implicitly[Application8[F, asuna.AsunaTuple2[asuna.AsunaTuple2[Plus1_X1 , Plus1_X2] , asuna.AsunaTuple1[Plus1_X3]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus2_X1 , Plus2_X2] , asuna.AsunaTuple1[Plus2_X3]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus3_X1 , Plus3_X2] , asuna.AsunaTuple1[Plus3_X3]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus4_X1 , Plus4_X2] , asuna.AsunaTuple1[Plus4_X3]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus5_X1 , Plus5_X2] , asuna.AsunaTuple1[Plus5_X3]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus6_X1 , Plus6_X2] , asuna.AsunaTuple1[Plus6_X3]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus7_X1 , Plus7_X2] , asuna.AsunaTuple1[Plus7_X3]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus8_X1 , Plus8_X2] , asuna.AsunaTuple1[Plus8_X3]]
                ]]
                context.append(implicitApplication.application(context), context.start)(PlusToTuple8.plus8WithTypeParameter3)
            }
        }
}
object ScalaTupleImplicits_3_8 extends ScalaTupleImplicits_3_8
