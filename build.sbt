

name := "Using Spray"

version := "1.0"

scalaVersion := "2.10.0"


resolvers ++= Seq(
"Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
"spray repo" at "http://repo.spray.io")

libraryDependencies ++= Seq(
"io.spray" % "spray-can" % "1.1-M8",
"com.typesafe.akka" %% "akka-actor" % "2.1.4",
"org.scalatest" % "scalatest_2.10" % "1.9.1" % "test",
"ch.qos.logback" % "logback-classic" % "1.0.3",
"ch.qos.logback" % "logback-core" % "1.0.3",
"org.scalamock" %% "scalamock-scalatest-support" % "3.0.1" % "test",
"org.scalaj" %% "scalaj-http" % "0.3.9" exclude("junit", "junit") )

