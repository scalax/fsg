package asuna
import asuna.support.HListTypeHListPlus1
import asuna.support.HListTypeHListPlus2
import asuna.support.HListTypeHListPlus3
import asuna.support.HListTypeHListPlus4
import impl._
class TupleTag4[T1, M1 <: Message, T2, M2 <: Message, T3, M3 <: Message, T4, M4 <: Message] extends TupleTag {
  override type AsunaTupleType  = AsunaTuple4[T1, T2, T3, T4]
  override type M[M <: Message] = TupleTag4[T1, M :-<>-: M1, T2, M :-<>-: M2, T3, M :-<>-: M3, T4, M :-<>-: M4]
  def debug[K <: KindContext, I1 <: TypeHList, I2 <: TypeHList, I3 <: TypeHList, I4 <: TypeHList](c: Context[K])(
    implicit
    dapp1: DebugItemApplication[K, T1, I1, M1],
    dapp2: DebugItemApplication[K, T2, I2, M2],
    dapp3: DebugItemApplication[K, T3, I3, M3],
    dapp4: DebugItemApplication[K, T4, I4, M4]
  ): Application[K, TupleTag4[T1, M1, T2, M2, T3, M3, T4, M4], TupleTypeHList4[I1, I2, I3, I4]] =
    TupleTag4.tupleTagApplicationImplicit4(dapp1, dapp2, dapp3, dapp4)
}
object TupleTag4 {
  implicit def tupleTagApplicationImplicit4[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
    M4 <: Message
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4]
  ): Application[K, TupleTag4[H1, M1, H2, M2, H3, M3, H4, M4], TupleTypeHList4[T1, T2, T3, T4]] =
    new Application[K, TupleTag4[H1, M1, H2, M2, H3, M3, H4, M4], TupleTypeHList4[T1, T2, T3, T4]] {
      override def application(context: Context[K]): K#M[TupleTypeHList4[T1, T2, T3, T4]] = {
        context.append[TupleTypeHList3[T2, T3, T4], T1, TupleTypeHList4[T1, T2, T3, T4]](
          context.append[TupleTypeHList2[T3, T4], T2, TupleTypeHList3[T2, T3, T4]](
            context.append[TupleTypeHList1[T4], T3, TupleTypeHList2[T3, T4]](
              context.append[TupleTypeHList0, T4, TupleTypeHList1[T4]](context.start, t4.application(context), HListTypeHListPlus1.plus1),
              t3.application(context),
              HListTypeHListPlus2.plus2
            ),
            t2.application(context),
            HListTypeHListPlus3.plus3
          ),
          t1.application(context),
          HListTypeHListPlus4.plus4
        )
      }
    }
}
