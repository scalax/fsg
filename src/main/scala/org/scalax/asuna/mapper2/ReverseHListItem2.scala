package org.scalax.asuna.mapper.item
import shapeless._
class ReverseHListItem2[E1, E2](val head: E1 :: E2 :: HNil) extends AnyVal with XyyItem2[E1, E2] {
  override def pudao[T](xyy: T): ReverseHListItem3[T, E1, E2] = new ReverseHListItem3[T, E1, E2](xyy :: head)
  override def leftHead: E1                                   = head.head
  override def leftTail: ReverseHListItem1[E2]                = new ReverseHListItem1(head.tail)
  override def i1: E1                                         = head.head
  override def i2: E2                                         = head.tail.head
}
