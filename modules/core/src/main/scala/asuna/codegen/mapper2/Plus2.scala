package asuna
abstract class Plus2[
    X1 , X2,
    Y1 , Y2,
    Z1 , Z2
] {
        def takeHead1(z: Z1): X1
        def takeTail1(z: Z1): Y1
        def plus1(x: X1, y: Y1): Z1
        def takeHead2(z: Z2): X2
        def takeTail2(z: Z2): Y2
        def plus2(x: X2, y: Y2): Z2
}
object Plus2 {
    final def cachePlusWithTypeParameter0Dynamic[Y1 , Y2]: Plus2[
        AsunaTuple0 , AsunaTuple0,
        Y1 , Y2,
        AsunaTuple1[Y1] , AsunaTuple1[Y2]
    ] = new Plus2[
        AsunaTuple0 , AsunaTuple0,
        Y1 , Y2,
        AsunaTuple1[Y1] , AsunaTuple1[Y2]
    ] {
            final override def takeHead1(z: AsunaTuple1[Y1]): AsunaTuple0 = AsunaTuple0.value
            final override def takeTail1(z: AsunaTuple1[Y1]): Y1 = z.i1
            final override def plus1(x: AsunaTuple0, y: Y1): AsunaTuple1[Y1] = new AsunaTuple1(y)
            final override def takeHead2(z: AsunaTuple1[Y2]): AsunaTuple0 = AsunaTuple0.value
            final override def takeTail2(z: AsunaTuple1[Y2]): Y2 = z.i1
            final override def plus2(x: AsunaTuple0, y: Y2): AsunaTuple1[Y2] = new AsunaTuple1(y)
    }
    final val cachePlusWithTypeParameter0Strict: Plus2[
        AsunaTuple0 , AsunaTuple0,
        Any , Any,
        AsunaTuple1[Any] , AsunaTuple1[Any]
    ] = new Plus2[
        AsunaTuple0 , AsunaTuple0,
        Any , Any,
        AsunaTuple1[Any] , AsunaTuple1[Any]
    ] {
            final override def takeHead1(z: AsunaTuple1[Any]): AsunaTuple0 = AsunaTuple0.value
            final override def takeTail1(z: AsunaTuple1[Any]): Any = z.i1
            final override def plus1(x: AsunaTuple0, y: Any): AsunaTuple1[Any] = new AsunaTuple1(y)
            final override def takeHead2(z: AsunaTuple1[Any]): AsunaTuple0 = AsunaTuple0.value
            final override def takeTail2(z: AsunaTuple1[Any]): Any = z.i1
            final override def plus2(x: AsunaTuple0, y: Any): AsunaTuple1[Any] = new AsunaTuple1(y)
    }
    final def cachePlusWithTypeParameter0[Y1 , Y2]: Plus2[
        AsunaTuple0 , AsunaTuple0,
        Y1 , Y2,
        AsunaTuple1[Y1] , AsunaTuple1[Y2]
    ] = cachePlusWithTypeParameter0Strict.asInstanceOf[Plus2[
        AsunaTuple0 , AsunaTuple0,
        Y1 , Y2,
        AsunaTuple1[Y1] , AsunaTuple1[Y2]
    ]]
    final def cachePlusWithTypeParameter1Dynamic[
        X1 , X2,
        Y1 , Y2
    ]: Plus2[
        X1 , X2,
        Y1 , Y2,
        AsunaTuple2[Y1, X1] , AsunaTuple2[Y2, X2]
    ] = new Plus2[
        X1 , X2,
        Y1 , Y2,
        AsunaTuple2[Y1, X1] , AsunaTuple2[Y2, X2]
    ] {
            final override def takeHead1(z: AsunaTuple2[Y1, X1]): X1 = z.i2
            final override def takeTail1(z: AsunaTuple2[Y1, X1]): Y1 = z.i1
            final override def plus1(x: X1, y: Y1): AsunaTuple2[Y1, X1] = new AsunaTuple2(y, x)
            final override def takeHead2(z: AsunaTuple2[Y2, X2]): X2 = z.i2
            final override def takeTail2(z: AsunaTuple2[Y2, X2]): Y2 = z.i1
            final override def plus2(x: X2, y: Y2): AsunaTuple2[Y2, X2] = new AsunaTuple2(y, x)
    }
    final val cachePlusWithTypeParameter1Strict: Plus2[
        Any , Any,
        Any , Any,
        AsunaTuple2[Any, Any] , AsunaTuple2[Any, Any]
    ] = new Plus2[
        Any , Any,
        Any , Any,
        AsunaTuple2[Any, Any] , AsunaTuple2[Any, Any]
    ] {
            final override def takeHead1(z: AsunaTuple2[Any, Any]): Any = z.i2
            final override def takeTail1(z: AsunaTuple2[Any, Any]): Any = z.i1
            final override def plus1(x: Any, y: Any): AsunaTuple2[Any, Any] = new AsunaTuple2(y, x)
            final override def takeHead2(z: AsunaTuple2[Any, Any]): Any = z.i2
            final override def takeTail2(z: AsunaTuple2[Any, Any]): Any = z.i1
            final override def plus2(x: Any, y: Any): AsunaTuple2[Any, Any] = new AsunaTuple2(y, x)
    }
    final def cachePlusWithTypeParameter1[
        X1 , X2,
        Y1 , Y2
    ]: Plus2[
        X1 , X2,
        Y1 , Y2,
        AsunaTuple2[Y1, X1] , AsunaTuple2[Y2, X2]
    ] = cachePlusWithTypeParameter1Strict.asInstanceOf[Plus2[
        X1 , X2,
        Y1 , Y2,
        AsunaTuple2[Y1, X1] , AsunaTuple2[Y2, X2]
    ]]
}
