import sbt._
import sbt.Keys._

object Dependencies {

  def circeDependencies(scalaVersion: String): Seq[ModuleID] = CrossVersion.partialVersion(scalaVersion) match {
    case Some((2, 11)) =>
      ("io.circe" %% "circe-derivation" % "0.11.0-M3") :: List(
        "io.circe" %% "circe-core",
        "io.circe" %% "circe-generic",
        "io.circe" %% "circe-parser"
      ).map(_ % "0.11.2")
    case Some((2, x)) if x >= 12 =>
      ("io.circe" %% "circe-derivation" % "0.13.0-M4") :: List(
        "io.circe" %% "circe-core",
        "io.circe" %% "circe-generic",
        "io.circe" %% "circe-parser"
      ).map(_ % "0.13.0")
    case _ =>
      List.empty
  }

  val zioVersion = "1.0.1"
  val zioTest = List(
    "dev.zio" %% "zio-test"          % zioVersion % "test",
    "dev.zio" %% "zio-test-sbt"      % zioVersion % "test",
    "dev.zio" %% "zio-test-magnolia" % zioVersion % "test" // optional
  )

  val slickVersion = "3.3.3"
  val slick = List(
    "com.typesafe.slick" %% "slick"         % slickVersion,
    "com.typesafe.slick" %% "slick-codegen" % slickVersion
  )

  def testDependencies(scalaVersion: String) = if (scalaVersion startsWith "0.") junit else List("org.scalatest" %% "scalatest" % "3.1.1") ::: junit

  def upickleDependencies(scalaVersion: String) = if (scalaVersion startsWith "0.") List.empty else List("com.lihaoyi" %% "upickle" % "0.9.5")

  def scalaReflect(scalaVersion: String) =
    if ((scalaVersion startsWith "2.11") || (scalaVersion startsWith "2.12") || (scalaVersion startsWith "2.13")) {
      List("org.scala-lang" % "scala-reflect" % scalaVersion)
    } else {
      List.empty
    }

  val slf4j = List("org.slf4j" % "slf4j-simple" % "1.7.25")

  val scalaCollectionCompat = "org.scala-lang.modules" %% "scala-collection-compat" % "2.1.4"

  val commonsCodec = "commons-codec" % "commons-codec" % "1.14"

  val commonsIo = "commons-io" % "commons-io" % "2.6"

  val junit = List("com.novocode" % "junit-interface" % "0.11")

}
