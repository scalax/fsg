package org.scalax.asuna.mapper
trait Item6[ E1  ,   E2  ,   E3  ,   E4  ,   E5  ,   E6  ] extends Any {
self =>
def i1: E1
def i2: E2
def i3: E3
def i4: E4
def i5: E5
def i6: E6
def leftHead: E1 = throw new Exception("Can not use this method.")
def leftTail: Item5[ E2  ,   E3  ,   E4  ,   E5  ,   E6  ] = throw new Exception("Can not use this method.")
def rightHead: E6 = throw new Exception("Can not use this method.")
def rightTail: Item5[ E1  ,   E2  ,   E3  ,   E4  ,   E5  ] = throw new Exception("Can not use this method.")
def add[T](xyy: T): Item7[ E1,  E2,  E3,  E4,  E5,  E6,  T] = throw new Exception("Can not use this method.")
def pull[T](xyy: T): Item7[T  , E1  , E2  , E3  , E4  , E5  , E6 ] = throw new Exception("Can not use this method.")
def addToTuple[T](xyy: T): ( E1,  E2,  E3,  E4,  E5,  E6,  T) = ( self.i1,  self.i2,  self.i3,  self.i4,  self.i5,  self.i6,  xyy)
def pullToTuple[T](xyy: T): (T  , E1  , E2  , E3  , E4  , E5  , E6 ) = (xyy  , self.i1  , self.i2  , self.i3  , self.i4  , self.i5  , self.i6 )
def leftTuple: ( E2  ,   E3  ,   E4  ,   E5  ,   E6  ) = ( self.i2  ,   self.i3  ,   self.i4  ,   self.i5  ,   self.i6  )
def rightTuple: ( E1  ,   E2  ,   E3  ,   E4  ,   E5  ) = ( self.i1  ,   self.i2  ,   self.i3  ,   self.i4  ,   self.i5  )
}