AsunaSettings.commonSettings

AsunaSettings.scala_2_12_And_2_13_Settings

libraryDependencies ++= Dependencies.circeDependencies(scalaVersion.value)
libraryDependencies ++= Dependencies.upickleDependencies(scalaVersion.value)

enablePlugins(JmhPlugin)
