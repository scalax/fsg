package asuna.scala_tuple.tuple_support
import asuna.Plus3
import asuna.support.heterogeneous._
trait HListPlus_12_3 {
  final def plusWithTypeParameter12[
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4,
    X1_C5,
    X1_C6,
    X1_C7,
    X1_C8,
    X1_C9,
    X1_C10,
    X1_C11,
    X1_C12,
    X2_C1,
    X2_C2,
    X2_C3,
    X2_C4,
    X2_C5,
    X2_C6,
    X2_C7,
    X2_C8,
    X2_C9,
    X2_C10,
    X2_C11,
    X2_C12,
    X3_C1,
    X3_C2,
    X3_C3,
    X3_C4,
    X3_C5,
    X3_C6,
    X3_C7,
    X3_C8,
    X3_C9,
    X3_C10,
    X3_C11,
    X3_C12,
    Y1,
    Y2,
    Y3
  ]: Plus3[
    X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: X1_C9 :: X1_C10 :: X1_C11 :: X1_C12 :: HNil,
    X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: X2_C9 :: X2_C10 :: X2_C11 :: X2_C12 :: HNil,
    X3_C1 :: X3_C2 :: X3_C3 :: X3_C4 :: X3_C5 :: X3_C6 :: X3_C7 :: X3_C8 :: X3_C9 :: X3_C10 :: X3_C11 :: X3_C12 :: HNil,
    Y1,
    Y2,
    Y3,
    Y1 :: X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: X1_C9 :: X1_C10 :: X1_C11 :: X1_C12 :: HNil,
    Y2 :: X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: X2_C9 :: X2_C10 :: X2_C11 :: X2_C12 :: HNil,
    Y3 :: X3_C1 :: X3_C2 :: X3_C3 :: X3_C4 :: X3_C5 :: X3_C6 :: X3_C7 :: X3_C8 :: X3_C9 :: X3_C10 :: X3_C11 :: X3_C12 :: HNil
  ] =
    new Plus3[
      X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: X1_C9 :: X1_C10 :: X1_C11 :: X1_C12 :: HNil,
      X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: X2_C9 :: X2_C10 :: X2_C11 :: X2_C12 :: HNil,
      X3_C1 :: X3_C2 :: X3_C3 :: X3_C4 :: X3_C5 :: X3_C6 :: X3_C7 :: X3_C8 :: X3_C9 :: X3_C10 :: X3_C11 :: X3_C12 :: HNil,
      Y1,
      Y2,
      Y3,
      Y1 :: X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: X1_C9 :: X1_C10 :: X1_C11 :: X1_C12 :: HNil,
      Y2 :: X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: X2_C9 :: X2_C10 :: X2_C11 :: X2_C12 :: HNil,
      Y3 :: X3_C1 :: X3_C2 :: X3_C3 :: X3_C4 :: X3_C5 :: X3_C6 :: X3_C7 :: X3_C8 :: X3_C9 :: X3_C10 :: X3_C11 :: X3_C12 :: HNil
    ] {
      final override def takeHead1(
        z: Y1 :: X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: X1_C9 :: X1_C10 :: X1_C11 :: X1_C12 :: HNil
      ): X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: X1_C9 :: X1_C10 :: X1_C11 :: X1_C12 :: HNil = z.tail
      final override def takeTail1(z: Y1 :: X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: X1_C9 :: X1_C10 :: X1_C11 :: X1_C12 :: HNil): Y1 =
        z.head
      final override def plus1(
        x: X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: X1_C9 :: X1_C10 :: X1_C11 :: X1_C12 :: HNil,
        y: Y1
      ): Y1 :: X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: X1_C9 :: X1_C10 :: X1_C11 :: X1_C12 :: HNil = x.::(y)
      final override def takeHead2(
        z: Y2 :: X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: X2_C9 :: X2_C10 :: X2_C11 :: X2_C12 :: HNil
      ): X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: X2_C9 :: X2_C10 :: X2_C11 :: X2_C12 :: HNil = z.tail
      final override def takeTail2(z: Y2 :: X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: X2_C9 :: X2_C10 :: X2_C11 :: X2_C12 :: HNil): Y2 =
        z.head
      final override def plus2(
        x: X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: X2_C9 :: X2_C10 :: X2_C11 :: X2_C12 :: HNil,
        y: Y2
      ): Y2 :: X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: X2_C9 :: X2_C10 :: X2_C11 :: X2_C12 :: HNil = x.::(y)
      final override def takeHead3(
        z: Y3 :: X3_C1 :: X3_C2 :: X3_C3 :: X3_C4 :: X3_C5 :: X3_C6 :: X3_C7 :: X3_C8 :: X3_C9 :: X3_C10 :: X3_C11 :: X3_C12 :: HNil
      ): X3_C1 :: X3_C2 :: X3_C3 :: X3_C4 :: X3_C5 :: X3_C6 :: X3_C7 :: X3_C8 :: X3_C9 :: X3_C10 :: X3_C11 :: X3_C12 :: HNil = z.tail
      final override def takeTail3(z: Y3 :: X3_C1 :: X3_C2 :: X3_C3 :: X3_C4 :: X3_C5 :: X3_C6 :: X3_C7 :: X3_C8 :: X3_C9 :: X3_C10 :: X3_C11 :: X3_C12 :: HNil): Y3 =
        z.head
      final override def plus3(
        x: X3_C1 :: X3_C2 :: X3_C3 :: X3_C4 :: X3_C5 :: X3_C6 :: X3_C7 :: X3_C8 :: X3_C9 :: X3_C10 :: X3_C11 :: X3_C12 :: HNil,
        y: Y3
      ): Y3 :: X3_C1 :: X3_C2 :: X3_C3 :: X3_C4 :: X3_C5 :: X3_C6 :: X3_C7 :: X3_C8 :: X3_C9 :: X3_C10 :: X3_C11 :: X3_C12 :: HNil = x.::(y)
    }
}