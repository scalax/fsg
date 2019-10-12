package org.scalax.asuna.mapper.test

import io.circe.{Decoder, Encoder}
import io.circe.syntax._
import org.scalax.asuna.mapper.append.ShapelessTest

object LargeModelTest extends App {

  /*val a1 = {

    import CircePoly._

    implicit lazy val largeModel_1_en: Encoder.AsObject[CirceLargeModel.LargeModel_1] = EncoderTest.implicitEncoder
    implicit lazy val largeModel_2_en: Encoder.AsObject[CirceLargeModel.LargeModel_2] = EncoderTest.implicitEncoder
    val i1                                                                            = CirceLargeModel.largeModel_2.asJson
    println(i1.noSpaces)

    println("==================== line ====================")

    implicit lazy val largeModel_1_de: Decoder[CirceLargeModel.LargeModel_1] = DecoderTest.implicitDecoder
    implicit lazy val largeModel_2_de: Decoder[CirceLargeModel.LargeModel_2] = DecoderTest.implicitDecoder
    val i2                                                                   = i1.as[CirceLargeModel.LargeModel_2]
    println(i2)

  }*/

  val a2 = {

    import upickle.default._
    import upickle.default.{ReadWriter => RW, macroRW}

    implicit lazy val largeModel_1_en: RW[CirceLargeModel.LargeModel_1] = macroRW
    implicit lazy val largeModel_2_en: RW[CirceLargeModel.LargeModel_2] = macroRW
    println("==================== upickle line ====================")
    val i1 = write(CirceLargeModel.largeModel_1)
    println(i1)
    val i2 = read[CirceLargeModel.LargeModel_1](ujson.Readable.fromString(i1))
    println(i2)

  }

  /*val a3 = {

    import ShapelessTest.EncodeImplicit._
    implicit def largeModel_1_en: Encoder.AsObject[CirceLargeModel.LargeModel_1] = ShapelessTest.EncodeImplicit.encodeGeneric
    implicit def largeModel_2_en: Encoder.AsObject[CirceLargeModel.LargeModel_2] = ShapelessTest.EncodeImplicit.encodeGeneric

    println("==================== line ====================")

    val i1 = CirceLargeModel.largeModel_2.asJson
    println(i1.noSpaces)

  }*/

}
