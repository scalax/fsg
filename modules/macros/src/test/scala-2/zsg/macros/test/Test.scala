package zsg.macros.test

import zsg.BuildContent
import zsg.macros.single.{PropertyApply, ZsgGetterGeneric, ZsgLabelledGeneric}
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class Test extends AnyFunSpec with Matchers {

  case class Foo(i1: String, i2: String, i3: Int, i4: Int, i5: Long, i6: String, i7: String, i8: String, i9: Int, i10: Int)

  val fooValue = Foo(i1 = "i1", i2 = "i2", i3 = 3, i4 = 4, i5 = 5L, i6 = "i6", i7 = "i7", i8 = "i8", i9 = 9, i10 = 10)

  val ap = PropertyApply[Foo]

  val fooPropertyTag = BuildContent.nodeTuple2(
    BuildContent.nodeTuple2(
      BuildContent.nodeTuple2(BuildContent.tuple2(ap.to(_.i1), ap.to(_.i2)), BuildContent.tuple2(ap.to(_.i3), ap.to(_.i4))),
      BuildContent.nodeTuple2(BuildContent.tuple2(ap.to(_.i5), ap.to(_.i6)), BuildContent.tuple2(ap.to(_.i7), ap.to(_.i8)))
    ),
    BuildContent.nodeTuple1(BuildContent.tuple2(ap.to(_.i9), ap.to(_.i10)))
  )


  val fooGetter = { foo: Foo =>
    BuildContent.nodeTuple2(
      BuildContent.nodeTuple2(
        BuildContent.nodeTuple2(BuildContent.tuple2(foo.i1, foo.i2), BuildContent.tuple2(foo.i3, foo.i4)),
        BuildContent.nodeTuple2(BuildContent.tuple2(foo.i5, foo.i6), BuildContent.tuple2(foo.i7, foo.i8))
      ),
      BuildContent.nodeTuple1(
        BuildContent.tuple2(foo.i9, foo.i10)
      )
    )
  }

  val fooLabelled = BuildContent.nodeTuple2(
    BuildContent.nodeTuple2(
      BuildContent.nodeTuple2(BuildContent.tuple2("i1", "i2"), BuildContent.tuple2("i3", "i4")),
      BuildContent.nodeTuple2(BuildContent.tuple2("i5", "i6"), BuildContent.tuple2("i7", "i8"))
    ),
    BuildContent.nodeTuple1(BuildContent.tuple2("i9", "i10"))
  )

  import in._

  val fooEncoder: ListEncoder[Foo] = init1(forType[Foo].value(fooPropertyTag)).init2.encode(ZsgGetterGeneric.value(fooGetter), ZsgLabelledGeneric.value(fooLabelled))
  val fooEncoder2: ListEncoder[Foo] = encoder

  val prepareResult =
    s"(String(${fooValue.i1}),i1)|(String(${fooValue.i2}),i2)|(Int(${fooValue.i3}),i3)|" +
      s"(Int(${fooValue.i4}),i4)|(Long(${fooValue.i5}),i5)|(String(${fooValue.i6}),i6)|" +
      s"(String(${fooValue.i7}),i7)|(String(${fooValue.i8}),i8)|(Int(${fooValue.i9}),i9)|" +
      s"(Int(${fooValue.i10}),i10)"

  describe("A case class info") {
    it("generic to a encoder") {
      val str1 = fooEncoder.encode(fooValue).mkString("|")
      val str2 = fooEncoder2.encode(fooValue).mkString("|")
      str1 shouldBe prepareResult
      str2 shouldBe prepareResult
      str1 shouldBe str2
    }
  }

}