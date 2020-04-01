package asuna
class Merge3[X1 , X2 , X3, Target]
object Merge3 {
        inline given  nodetag1_merge3_implicit[
            X1_C1 <: TupleTag , X2_C1 <: TupleTag , X3_C1 <: TupleTag,
            Target1 <: TupleTag
        ]( given 
            nodeTagImplicit1: Merge3[X1_C1 , X2_C1 , X3_C1 , Target1]
        ): Merge3[NodeTag1[X1_C1] , NodeTag1[X2_C1] , NodeTag1[X3_C1] , NodeTag1[Target1]] = {
            new Merge3[NodeTag1[X1_C1] , NodeTag1[X2_C1] , NodeTag1[X3_C1] , NodeTag1[Target1]]
        }
        inline given  tupletag1_merge3_implicit[
            X1_C1 , X2_C1 , X3_C1,
            Target1
        ]( given 
            tupleTagImplicit1: Merge3[X1_C1 , X2_C1 , X3_C1 , Target1]
        ): Merge3[TupleTag1[X1_C1] , TupleTag1[X2_C1] , TupleTag1[X3_C1] , TupleTag1[Target1]] = {
            new Merge3[TupleTag1[X1_C1] , TupleTag1[X2_C1] , TupleTag1[X3_C1] , TupleTag1[Target1]]
        }
        inline given  nodetag2_merge3_implicit[
            X1_C1 <: TupleTag , X1_C2 <: TupleTag , X2_C1 <: TupleTag , X2_C2 <: TupleTag , X3_C1 <: TupleTag , X3_C2 <: TupleTag,
            Target1 <: TupleTag , Target2 <: TupleTag
        ]( given 
            nodeTagImplicit1: Merge3[X1_C1 , X2_C1 , X3_C1 , Target1] , nodeTagImplicit2: Merge3[X1_C2 , X2_C2 , X3_C2 , Target2]
        ): Merge3[NodeTag2[X1_C1 , X1_C2] , NodeTag2[X2_C1 , X2_C2] , NodeTag2[X3_C1 , X3_C2] , NodeTag2[Target1 , Target2]] = {
            new Merge3[NodeTag2[X1_C1 , X1_C2] , NodeTag2[X2_C1 , X2_C2] , NodeTag2[X3_C1 , X3_C2] , NodeTag2[Target1 , Target2]]
        }
        inline given  tupletag2_merge3_implicit[
            X1_C1 , X1_C2 , X2_C1 , X2_C2 , X3_C1 , X3_C2,
            Target1 , Target2
        ]( given 
            tupleTagImplicit1: Merge3[X1_C1 , X2_C1 , X3_C1 , Target1] , tupleTagImplicit2: Merge3[X1_C2 , X2_C2 , X3_C2 , Target2]
        ): Merge3[TupleTag2[X1_C1 , X1_C2] , TupleTag2[X2_C1 , X2_C2] , TupleTag2[X3_C1 , X3_C2] , TupleTag2[Target1 , Target2]] = {
            new Merge3[TupleTag2[X1_C1 , X1_C2] , TupleTag2[X2_C1 , X2_C2] , TupleTag2[X3_C1 , X3_C2] , TupleTag2[Target1 , Target2]]
        }
        inline given  property_tag_merge3_implicit[
        X1 , X2 , X3, Data
    ]: Merge3[PropertyTag1[X1, Data] , PropertyTag1[X2, Data] , PropertyTag1[X3, Data] , PropertyTag3[X1 , X2 , X3, Data]] = {
        new Merge3[PropertyTag1[X1, Data] , PropertyTag1[X2, Data] , PropertyTag1[X3, Data] , PropertyTag3[X1 , X2 , X3, Data]]
    }
        inline given  entirety_tag_merge3_implicit[
        X1 , X2 , X3, Data
    ]: Merge3[EntiretyTag1[X1, Data] , EntiretyTag1[X2, Data] , EntiretyTag1[X3, Data] , EntiretyTag3[X1 , X2 , X3, Data]] = {
        new Merge3[EntiretyTag1[X1, Data] , EntiretyTag1[X2, Data] , EntiretyTag1[X3, Data] , EntiretyTag3[X1 , X2 , X3, Data]]
    }
}