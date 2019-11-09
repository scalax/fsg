package asuna
import scala.language.higherKinds
trait ScalaTupleImplicits_6_7 {
  final implicit def tupleTagApplicationImplicit_tagNum6_typeParamNum7[
    F[_, _, _, _, _, _, _],
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4,
    X1_C5,
    X1_C6,
    X1_C7,
    X2_C1,
    X2_C2,
    X2_C3,
    X2_C4,
    X2_C5,
    X2_C6,
    X2_C7,
    X3_C1,
    X3_C2,
    X3_C3,
    X3_C4,
    X3_C5,
    X3_C6,
    X3_C7,
    X4_C1,
    X4_C2,
    X4_C3,
    X4_C4,
    X4_C5,
    X4_C6,
    X4_C7,
    X5_C1,
    X5_C2,
    X5_C3,
    X5_C4,
    X5_C5,
    X5_C6,
    X5_C7,
    X6_C1,
    X6_C2,
    X6_C3,
    X6_C4,
    X6_C5,
    X6_C6,
    X6_C7
  ](
    implicit
    t1: Application7[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7],
    t2: Application7[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7],
    t3: Application7[F, H3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6, X3_C7],
    t4: Application7[F, H4, X4_C1, X4_C2, X4_C3, X4_C4, X4_C5, X4_C6, X4_C7],
    t5: Application7[F, H5, X5_C1, X5_C2, X5_C3, X5_C4, X5_C5, X5_C6, X5_C7],
    t6: Application7[F, H6, X6_C1, X6_C2, X6_C3, X6_C4, X6_C5, X6_C6, X6_C7]
  ): Application7[
    F,
    (H1, H2, H3, H4, H5, H6),
    (X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1),
    (X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X6_C2),
    (X1_C3, X2_C3, X3_C3, X4_C3, X5_C3, X6_C3),
    (X1_C4, X2_C4, X3_C4, X4_C4, X5_C4, X6_C4),
    (X1_C5, X2_C5, X3_C5, X4_C5, X5_C5, X6_C5),
    (X1_C6, X2_C6, X3_C6, X4_C6, X5_C6, X6_C6),
    (X1_C7, X2_C7, X3_C7, X4_C7, X5_C7, X6_C7)
  ] = { context: Context7[F] =>
    context.append(
      context.append(
        context.append(
          context.append(context.append(t6.application(context), t5.application(context))(HListPlus7.plusWithTypeParameter1), t4.application(context))(
            HListPlus7.plusWithTypeParameter2
          ),
          t3.application(context)
        )(HListPlus7.plusWithTypeParameter3),
        t2.application(context)
      )(HListPlus7.plusWithTypeParameter4),
      t1.application(context)
    )(PlusToTuple7.plusWithTypeParameter5)
  }
}