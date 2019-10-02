package org.scalax.asuna.mapper.item
object ArticleXyyPlus3 {
  def plus3[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[EatXyyType2[T1, T2], T3, EatXyyType3[T1, T2, T3]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[T1, T2], T3, EatXyyType3[T1, T2, T3]] {
      override def plus(p: Item2[T1#H, T2#H], item: T3#H): Item3[T1#H, T2#H, T3#H]                           = p.eat(item)
      override def takeHead(t: Item3[T1#H, T2#H, T3#H]): T3#H                                                = t.rightHead
      override def takeTail(t: Item3[T1#H, T2#H, T3#H]): Item2[T1#H, T2#H]                                   = t.rightTail
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType2[T1, T2]#T, T3#T, EatXyyType3[T1, T2, T3]#T] = plus3[T1#T, T2#T, T3#T]
    }
  def put3[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[EatXyyType2[T1, T2], T3, EatXyyType3[T3, T1, T2]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[T1, T2], T3, EatXyyType3[T3, T1, T2]] {
      override def plus(p: Item2[T1#H, T2#H], item: T3#H): Item3[T3#H, T1#H, T2#H]                           = p.pudao(item)
      override def takeHead(t: Item3[T3#H, T1#H, T2#H]): T3#H                                                = t.leftHead
      override def takeTail(t: Item3[T3#H, T1#H, T2#H]): Item2[T1#H, T2#H]                                   = t.leftTail
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType2[T1, T2]#T, T3#T, EatXyyType3[T3, T1, T2]#T] = put3[T1#T, T2#T, T3#T]
    }
}
class TypeParam3[T1, T2, T3] extends org.scalax.asuna.mapper.TypeParam {
  override type H = T1
  override type T = TypeParam2[T2, T3]
}