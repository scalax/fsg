package asuna.scala_tuple.tuple_support
import asuna.Application3
import asuna.Context3
import scala.language.higherKinds
trait ScalaTupleImplicits_18_3 {
         given  tupleTagApplicationImplicit_tagNum18_typeParamNum3[
            F[_ , _ , _],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17 , Plus3_X18
        ]( using 
        t1: Application3[F, Plus1_X1 , Plus2_X1 , Plus3_X1] , t2: Application3[F, Plus1_X2 , Plus2_X2 , Plus3_X2] , t3: Application3[F, Plus1_X3 , Plus2_X3 , Plus3_X3] , t4: Application3[F, Plus1_X4 , Plus2_X4 , Plus3_X4] , t5: Application3[F, Plus1_X5 , Plus2_X5 , Plus3_X5] , t6: Application3[F, Plus1_X6 , Plus2_X6 , Plus3_X6] , t7: Application3[F, Plus1_X7 , Plus2_X7 , Plus3_X7] , t8: Application3[F, Plus1_X8 , Plus2_X8 , Plus3_X8] , t9: Application3[F, Plus1_X9 , Plus2_X9 , Plus3_X9] , t10: Application3[F, Plus1_X10 , Plus2_X10 , Plus3_X10] , t11: Application3[F, Plus1_X11 , Plus2_X11 , Plus3_X11] , t12: Application3[F, Plus1_X12 , Plus2_X12 , Plus3_X12] , t13: Application3[F, Plus1_X13 , Plus2_X13 , Plus3_X13] , t14: Application3[F, Plus1_X14 , Plus2_X14 , Plus3_X14] , t15: Application3[F, Plus1_X15 , Plus2_X15 , Plus3_X15] , t16: Application3[F, Plus1_X16 , Plus2_X16 , Plus3_X16] , t17: Application3[F, Plus1_X17 , Plus2_X17 , Plus3_X17] , t18: Application3[F, Plus1_X18 , Plus2_X18 , Plus3_X18])  as  Application3[
            F,
            Tuple18[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18],
            Tuple18[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18],
            Tuple18[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17 , Plus3_X18]
        ] = new Application3[
            F,
            Tuple18[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18],
            Tuple18[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18],
            Tuple18[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17 , Plus3_X18]
        ] {
            override def application(context: Context3[F]): F[
                Tuple18[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18],
                Tuple18[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18],
                Tuple18[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17 , Plus3_X18]
            ] = {
                //val asunaTuple2F = AppendTag.liftTag(context)(AppendTag.lift(AppendTag.nodeTag(AppendTag.nodeTag(AppendTag.nodeTag(AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag1] , AppendTag[Tag2]) , AppendTag.tag(AppendTag[Tag3] , AppendTag[Tag4])) , AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag5] , AppendTag[Tag6]) , AppendTag.tag(AppendTag[Tag7] , AppendTag[Tag8]))) , AppendTag.nodeTag(AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag9] , AppendTag[Tag10]) , AppendTag.tag(AppendTag[Tag11] , AppendTag[Tag12])) , AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag13] , AppendTag[Tag14]) , AppendTag.tag(AppendTag[Tag15] , AppendTag[Tag16])))) , AppendTag.nodeTag(AppendTag.nodeTag(AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag17] , AppendTag[Tag18])))))))
                //context.append(asunaTuple2F, context.start)(PlusToTuple3.plus3WithTypeParameter18)
                throw new Exception
            }
        }
}
object ScalaTupleImplicits_18_3 extends ScalaTupleImplicits_18_3