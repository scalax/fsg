package org.scalax.asuna.mapper
trait ItemTypeParameterPlus8 {
def plus8[ T1 <: TypeParameter  ,   T2 <: TypeParameter  ,   T3 <: TypeParameter  ,   T4 <: TypeParameter  ,   T5 <: TypeParameter  ,   T6 <: TypeParameter  ,   T7 <: TypeParameter  ,   T8 <: TypeParameter  ]
: Plus[ItemTypeParameter7[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ], T8, ItemTypeParameter8[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ,   T8  ]] =
new Plus[ItemTypeParameter7[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ], T8, ItemTypeParameter8[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ,   T8  ]] {
override def plus(p: Item7[ T1#H  ,   T2#H  ,   T3#H  ,   T4#H  ,   T5#H  ,   T6#H  ,   T7#H  ], item: T8#H): Item8[ T1#H  ,   T2#H  ,   T3#H  ,   T4#H  ,   T5#H  ,   T6#H  ,   T7#H  ,   T8#H  ] = p.add(item)
override def takeTail(t: Item8[ T1#H  ,   T2#H  ,   T3#H  ,   T4#H  ,   T5#H  ,   T6#H  ,   T7#H  ,   T8#H  ]): T8#H = t.rightHead
override def takeHead(t: Item8[ T1#H  ,   T2#H  ,   T3#H  ,   T4#H  ,   T5#H  ,   T6#H  ,   T7#H  ,   T8#H  ]): Item7[ T1#H  ,   T2#H  ,   T3#H  ,   T4#H  ,   T5#H  ,   T6#H  ,   T7#H  ] = t.rightTail
override def sub: Plus[ItemTypeParameter7[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ]#T, T8#T, ItemTypeParameter8[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ,   T8  ]#T] = plus8[ T1#T  ,   T2#T  ,   T3#T  ,   T4#T  ,   T5#T  ,   T6#T  ,   T7#T  ,   T8#T  ]
}
def put8[ T1 <: TypeParameter  ,   T2 <: TypeParameter  ,   T3 <: TypeParameter  ,   T4 <: TypeParameter  ,   T5 <: TypeParameter  ,   T6 <: TypeParameter  ,   T7 <: TypeParameter  ,   T8 <: TypeParameter  ]
: Plus[ItemTypeParameter7[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ], T8, ItemTypeParameter8[T8  , T1  , T2  , T3  , T4  , T5  , T6  , T7 ]] =
new Plus[ItemTypeParameter7[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ], T8, ItemTypeParameter8[T8  , T1  , T2  , T3  , T4  , T5  , T6  , T7 ]] {
override def plus(p: Item7[ T1#H  ,   T2#H  ,   T3#H  ,   T4#H  ,   T5#H  ,   T6#H  ,   T7#H  ], item: T8#H): Item8[T8#H  , T1#H  , T2#H  , T3#H  , T4#H  , T5#H  , T6#H  , T7#H ] = p.pull(item)
override def takeTail(t: Item8[T8#H  , T1#H  , T2#H  , T3#H  , T4#H  , T5#H  , T6#H  , T7#H ]): T8#H = t.leftHead
override def takeHead(t: Item8[T8#H  , T1#H  , T2#H  , T3#H  , T4#H  , T5#H  , T6#H  , T7#H ]): Item7[ T1#H  ,   T2#H  ,   T3#H  ,   T4#H  ,   T5#H  ,   T6#H  ,   T7#H  ] = t.leftTail
override def sub: Plus[ItemTypeParameter7[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ]#T, T8#T, ItemTypeParameter8[T8  , T1  , T2  , T3  , T4  , T5  , T6  , T7 ]#T] = put8[ T1#T  ,   T2#T  ,   T3#T  ,   T4#T  ,   T5#T  ,   T6#T  ,   T7#T  ,   T8#T  ]
}
}
object ItemTypeParameterPlus8 extends ItemTypeParameterPlus8