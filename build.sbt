name := "design-patterns"

version := "0.1"

scalaVersion := "2.12.8"

scalacOptions ++= Seq(
  "-language:higherKinds"
)

libraryDependencies ++= Seq(
  "commons-codec" % "commons-codec" % "1.10",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
  "org.slf4j" % "slf4j-log4j12" % "1.7.25" % Compile // scope Compile. not a Test.
)
