package asuna
import impl._
class TupleTag3[T1, M1 <: Message, T2, M2 <: Message, T3, M3 <: Message] extends TupleTag {
  override type AsunaTupleType  = AsunaTuple3[T1, T2, T3]
  override type M[M <: Message] = TupleTag3[T1, M :-<>-: M1, T2, M :-<>-: M2, T3, M :-<>-: M3]
  def debug[K <: KindContext, I1 <: TypeHList, I2 <: TypeHList, I3 <: TypeHList](c: Context[K])(
    implicit
    dapp1: DebugItemApplication[K, T1, I1, M1],
    dapp2: DebugItemApplication[K, T2, I2, M2],
    dapp3: DebugItemApplication[K, T3, I3, M3]
  ): Application[K, TupleTag3[T1, M1, T2, M2, T3, M3], TupleTypeHList3[I1, I2, I3]] =
    TupleTag3.tupleTagApplicationImplicit3(dapp1, dapp2, dapp3)
}
object TupleTag3 {
  implicit def tupleTagApplicationImplicit3[K <: KindContext, H1, H2, H3, T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, M1 <: Message, M2 <: Message, M3 <: Message](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3]
  ): Application[K, TupleTag3[H1, M1, H2, M2, H3, M3], TupleTypeHList3[T1, T2, T3]] =
    new Application[K, TupleTag3[H1, M1, H2, M2, H3, M3], TupleTypeHList3[T1, T2, T3]] {
      override def application(context: Context[K]): K#M[TupleTypeHList3[T1, T2, T3]] = {
        if (context.isReverse) {
          context.append[HListTypeHList2[T3, T2], T1, TupleTypeHList3[T1, T2, T3]](
            context.append[HListTypeHList1[T3], T2, HListTypeHList2[T3, T2]](
              context.append[TupleTypeHList0, T3, HListTypeHList1[T3]](context.start, t3.application(context), AnyHListTypeHListPlus.hlistPlus1),
              t2.application(context),
              HListTypeHListPlus2.plus2
            ),
            t1.application(context),
            HListToTupleTypeHListPlus3.put3
          )
        } else {
          context.append[HListTypeHList2[T1, T2], T3, TupleTypeHList3[T1, T2, T3]](
            context.append[HListTypeHList1[T1], T2, HListTypeHList2[T1, T2]](
              context.append[TupleTypeHList0, T1, HListTypeHList1[T1]](context.start, t1.application(context), AnyHListTypeHListPlus.hlistPlus1),
              t2.application(context),
              HListTypeHListPlus2.plus2
            ),
            t3.application(context),
            HListToTupleTypeHListPlus3.plus3
          )
        }
      }
    }
}