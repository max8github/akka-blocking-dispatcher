scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % "2.6.0",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
)

enablePlugins(ParadoxRevealPlugin)
