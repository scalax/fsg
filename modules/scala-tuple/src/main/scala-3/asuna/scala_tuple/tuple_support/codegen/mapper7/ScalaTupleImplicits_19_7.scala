package asuna.scala_tuple.tuple_support
import asuna.Application7
import asuna.Context7
import scala.language.higherKinds
trait ScalaTupleImplicits_19_7 {
         given  tupleTagApplicationImplicit_tagNum19_typeParamNum7[
            F[_ , _ , _ , _ , _ , _ , _],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18 , Plus2_X19,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17 , Plus3_X18 , Plus3_X19,
            Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11 , Plus4_X12 , Plus4_X13 , Plus4_X14 , Plus4_X15 , Plus4_X16 , Plus4_X17 , Plus4_X18 , Plus4_X19,
            Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5 , Plus5_X6 , Plus5_X7 , Plus5_X8 , Plus5_X9 , Plus5_X10 , Plus5_X11 , Plus5_X12 , Plus5_X13 , Plus5_X14 , Plus5_X15 , Plus5_X16 , Plus5_X17 , Plus5_X18 , Plus5_X19,
            Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4 , Plus6_X5 , Plus6_X6 , Plus6_X7 , Plus6_X8 , Plus6_X9 , Plus6_X10 , Plus6_X11 , Plus6_X12 , Plus6_X13 , Plus6_X14 , Plus6_X15 , Plus6_X16 , Plus6_X17 , Plus6_X18 , Plus6_X19,
            Plus7_X1 , Plus7_X2 , Plus7_X3 , Plus7_X4 , Plus7_X5 , Plus7_X6 , Plus7_X7 , Plus7_X8 , Plus7_X9 , Plus7_X10 , Plus7_X11 , Plus7_X12 , Plus7_X13 , Plus7_X14 , Plus7_X15 , Plus7_X16 , Plus7_X17 , Plus7_X18 , Plus7_X19
        ]( using 
        t1: Application7[F, Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1 , Plus5_X1 , Plus6_X1 , Plus7_X1] , t2: Application7[F, Plus1_X2 , Plus2_X2 , Plus3_X2 , Plus4_X2 , Plus5_X2 , Plus6_X2 , Plus7_X2] , t3: Application7[F, Plus1_X3 , Plus2_X3 , Plus3_X3 , Plus4_X3 , Plus5_X3 , Plus6_X3 , Plus7_X3] , t4: Application7[F, Plus1_X4 , Plus2_X4 , Plus3_X4 , Plus4_X4 , Plus5_X4 , Plus6_X4 , Plus7_X4] , t5: Application7[F, Plus1_X5 , Plus2_X5 , Plus3_X5 , Plus4_X5 , Plus5_X5 , Plus6_X5 , Plus7_X5] , t6: Application7[F, Plus1_X6 , Plus2_X6 , Plus3_X6 , Plus4_X6 , Plus5_X6 , Plus6_X6 , Plus7_X6] , t7: Application7[F, Plus1_X7 , Plus2_X7 , Plus3_X7 , Plus4_X7 , Plus5_X7 , Plus6_X7 , Plus7_X7] , t8: Application7[F, Plus1_X8 , Plus2_X8 , Plus3_X8 , Plus4_X8 , Plus5_X8 , Plus6_X8 , Plus7_X8] , t9: Application7[F, Plus1_X9 , Plus2_X9 , Plus3_X9 , Plus4_X9 , Plus5_X9 , Plus6_X9 , Plus7_X9] , t10: Application7[F, Plus1_X10 , Plus2_X10 , Plus3_X10 , Plus4_X10 , Plus5_X10 , Plus6_X10 , Plus7_X10] , t11: Application7[F, Plus1_X11 , Plus2_X11 , Plus3_X11 , Plus4_X11 , Plus5_X11 , Plus6_X11 , Plus7_X11] , t12: Application7[F, Plus1_X12 , Plus2_X12 , Plus3_X12 , Plus4_X12 , Plus5_X12 , Plus6_X12 , Plus7_X12] , t13: Application7[F, Plus1_X13 , Plus2_X13 , Plus3_X13 , Plus4_X13 , Plus5_X13 , Plus6_X13 , Plus7_X13] , t14: Application7[F, Plus1_X14 , Plus2_X14 , Plus3_X14 , Plus4_X14 , Plus5_X14 , Plus6_X14 , Plus7_X14] , t15: Application7[F, Plus1_X15 , Plus2_X15 , Plus3_X15 , Plus4_X15 , Plus5_X15 , Plus6_X15 , Plus7_X15] , t16: Application7[F, Plus1_X16 , Plus2_X16 , Plus3_X16 , Plus4_X16 , Plus5_X16 , Plus6_X16 , Plus7_X16] , t17: Application7[F, Plus1_X17 , Plus2_X17 , Plus3_X17 , Plus4_X17 , Plus5_X17 , Plus6_X17 , Plus7_X17] , t18: Application7[F, Plus1_X18 , Plus2_X18 , Plus3_X18 , Plus4_X18 , Plus5_X18 , Plus6_X18 , Plus7_X18] , t19: Application7[F, Plus1_X19 , Plus2_X19 , Plus3_X19 , Plus4_X19 , Plus5_X19 , Plus6_X19 , Plus7_X19])  as  Application7[
            F,
            Tuple19[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19],
            Tuple19[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18 , Plus2_X19],
            Tuple19[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17 , Plus3_X18 , Plus3_X19],
            Tuple19[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11 , Plus4_X12 , Plus4_X13 , Plus4_X14 , Plus4_X15 , Plus4_X16 , Plus4_X17 , Plus4_X18 , Plus4_X19],
            Tuple19[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5 , Plus5_X6 , Plus5_X7 , Plus5_X8 , Plus5_X9 , Plus5_X10 , Plus5_X11 , Plus5_X12 , Plus5_X13 , Plus5_X14 , Plus5_X15 , Plus5_X16 , Plus5_X17 , Plus5_X18 , Plus5_X19],
            Tuple19[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4 , Plus6_X5 , Plus6_X6 , Plus6_X7 , Plus6_X8 , Plus6_X9 , Plus6_X10 , Plus6_X11 , Plus6_X12 , Plus6_X13 , Plus6_X14 , Plus6_X15 , Plus6_X16 , Plus6_X17 , Plus6_X18 , Plus6_X19],
            Tuple19[Plus7_X1 , Plus7_X2 , Plus7_X3 , Plus7_X4 , Plus7_X5 , Plus7_X6 , Plus7_X7 , Plus7_X8 , Plus7_X9 , Plus7_X10 , Plus7_X11 , Plus7_X12 , Plus7_X13 , Plus7_X14 , Plus7_X15 , Plus7_X16 , Plus7_X17 , Plus7_X18 , Plus7_X19]
        ] = new Application7[
            F,
            Tuple19[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19],
            Tuple19[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18 , Plus2_X19],
            Tuple19[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17 , Plus3_X18 , Plus3_X19],
            Tuple19[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11 , Plus4_X12 , Plus4_X13 , Plus4_X14 , Plus4_X15 , Plus4_X16 , Plus4_X17 , Plus4_X18 , Plus4_X19],
            Tuple19[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5 , Plus5_X6 , Plus5_X7 , Plus5_X8 , Plus5_X9 , Plus5_X10 , Plus5_X11 , Plus5_X12 , Plus5_X13 , Plus5_X14 , Plus5_X15 , Plus5_X16 , Plus5_X17 , Plus5_X18 , Plus5_X19],
            Tuple19[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4 , Plus6_X5 , Plus6_X6 , Plus6_X7 , Plus6_X8 , Plus6_X9 , Plus6_X10 , Plus6_X11 , Plus6_X12 , Plus6_X13 , Plus6_X14 , Plus6_X15 , Plus6_X16 , Plus6_X17 , Plus6_X18 , Plus6_X19],
            Tuple19[Plus7_X1 , Plus7_X2 , Plus7_X3 , Plus7_X4 , Plus7_X5 , Plus7_X6 , Plus7_X7 , Plus7_X8 , Plus7_X9 , Plus7_X10 , Plus7_X11 , Plus7_X12 , Plus7_X13 , Plus7_X14 , Plus7_X15 , Plus7_X16 , Plus7_X17 , Plus7_X18 , Plus7_X19]
        ] {
            override def application(context: Context7[F]): F[
                Tuple19[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19],
                Tuple19[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18 , Plus2_X19],
                Tuple19[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17 , Plus3_X18 , Plus3_X19],
                Tuple19[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11 , Plus4_X12 , Plus4_X13 , Plus4_X14 , Plus4_X15 , Plus4_X16 , Plus4_X17 , Plus4_X18 , Plus4_X19],
                Tuple19[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5 , Plus5_X6 , Plus5_X7 , Plus5_X8 , Plus5_X9 , Plus5_X10 , Plus5_X11 , Plus5_X12 , Plus5_X13 , Plus5_X14 , Plus5_X15 , Plus5_X16 , Plus5_X17 , Plus5_X18 , Plus5_X19],
                Tuple19[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4 , Plus6_X5 , Plus6_X6 , Plus6_X7 , Plus6_X8 , Plus6_X9 , Plus6_X10 , Plus6_X11 , Plus6_X12 , Plus6_X13 , Plus6_X14 , Plus6_X15 , Plus6_X16 , Plus6_X17 , Plus6_X18 , Plus6_X19],
                Tuple19[Plus7_X1 , Plus7_X2 , Plus7_X3 , Plus7_X4 , Plus7_X5 , Plus7_X6 , Plus7_X7 , Plus7_X8 , Plus7_X9 , Plus7_X10 , Plus7_X11 , Plus7_X12 , Plus7_X13 , Plus7_X14 , Plus7_X15 , Plus7_X16 , Plus7_X17 , Plus7_X18 , Plus7_X19]
            ] = {
                val implicitApplication = implicitly[Application7[F, asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus1_X1 , Plus1_X2] , asuna.AsunaTuple2[Plus1_X3 , Plus1_X4]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus1_X5 , Plus1_X6] , asuna.AsunaTuple2[Plus1_X7 , Plus1_X8]]] , asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus1_X9 , Plus1_X10] , asuna.AsunaTuple2[Plus1_X11 , Plus1_X12]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus1_X13 , Plus1_X14] , asuna.AsunaTuple2[Plus1_X15 , Plus1_X16]]]] , asuna.AsunaTuple1[asuna.AsunaTuple1[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus1_X17 , Plus1_X18] , asuna.AsunaTuple1[Plus1_X19]]]]] , asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus2_X1 , Plus2_X2] , asuna.AsunaTuple2[Plus2_X3 , Plus2_X4]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus2_X5 , Plus2_X6] , asuna.AsunaTuple2[Plus2_X7 , Plus2_X8]]] , asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus2_X9 , Plus2_X10] , asuna.AsunaTuple2[Plus2_X11 , Plus2_X12]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus2_X13 , Plus2_X14] , asuna.AsunaTuple2[Plus2_X15 , Plus2_X16]]]] , asuna.AsunaTuple1[asuna.AsunaTuple1[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus2_X17 , Plus2_X18] , asuna.AsunaTuple1[Plus2_X19]]]]] , asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus3_X1 , Plus3_X2] , asuna.AsunaTuple2[Plus3_X3 , Plus3_X4]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus3_X5 , Plus3_X6] , asuna.AsunaTuple2[Plus3_X7 , Plus3_X8]]] , asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus3_X9 , Plus3_X10] , asuna.AsunaTuple2[Plus3_X11 , Plus3_X12]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus3_X13 , Plus3_X14] , asuna.AsunaTuple2[Plus3_X15 , Plus3_X16]]]] , asuna.AsunaTuple1[asuna.AsunaTuple1[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus3_X17 , Plus3_X18] , asuna.AsunaTuple1[Plus3_X19]]]]] , asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus4_X1 , Plus4_X2] , asuna.AsunaTuple2[Plus4_X3 , Plus4_X4]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus4_X5 , Plus4_X6] , asuna.AsunaTuple2[Plus4_X7 , Plus4_X8]]] , asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus4_X9 , Plus4_X10] , asuna.AsunaTuple2[Plus4_X11 , Plus4_X12]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus4_X13 , Plus4_X14] , asuna.AsunaTuple2[Plus4_X15 , Plus4_X16]]]] , asuna.AsunaTuple1[asuna.AsunaTuple1[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus4_X17 , Plus4_X18] , asuna.AsunaTuple1[Plus4_X19]]]]] , asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus5_X1 , Plus5_X2] , asuna.AsunaTuple2[Plus5_X3 , Plus5_X4]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus5_X5 , Plus5_X6] , asuna.AsunaTuple2[Plus5_X7 , Plus5_X8]]] , asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus5_X9 , Plus5_X10] , asuna.AsunaTuple2[Plus5_X11 , Plus5_X12]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus5_X13 , Plus5_X14] , asuna.AsunaTuple2[Plus5_X15 , Plus5_X16]]]] , asuna.AsunaTuple1[asuna.AsunaTuple1[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus5_X17 , Plus5_X18] , asuna.AsunaTuple1[Plus5_X19]]]]] , asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus6_X1 , Plus6_X2] , asuna.AsunaTuple2[Plus6_X3 , Plus6_X4]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus6_X5 , Plus6_X6] , asuna.AsunaTuple2[Plus6_X7 , Plus6_X8]]] , asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus6_X9 , Plus6_X10] , asuna.AsunaTuple2[Plus6_X11 , Plus6_X12]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus6_X13 , Plus6_X14] , asuna.AsunaTuple2[Plus6_X15 , Plus6_X16]]]] , asuna.AsunaTuple1[asuna.AsunaTuple1[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus6_X17 , Plus6_X18] , asuna.AsunaTuple1[Plus6_X19]]]]] , asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus7_X1 , Plus7_X2] , asuna.AsunaTuple2[Plus7_X3 , Plus7_X4]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus7_X5 , Plus7_X6] , asuna.AsunaTuple2[Plus7_X7 , Plus7_X8]]] , asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus7_X9 , Plus7_X10] , asuna.AsunaTuple2[Plus7_X11 , Plus7_X12]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus7_X13 , Plus7_X14] , asuna.AsunaTuple2[Plus7_X15 , Plus7_X16]]]] , asuna.AsunaTuple1[asuna.AsunaTuple1[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus7_X17 , Plus7_X18] , asuna.AsunaTuple1[Plus7_X19]]]]]
                ]]
                context.append(implicitApplication.application(context), context.start)(PlusToTuple7.plus7WithTypeParameter19)
            }
        }
}
object ScalaTupleImplicits_19_7 extends ScalaTupleImplicits_19_7
