name := "Akka Dining Philosophers"

organization := "42ways"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.7"

scalacOptions ++= Seq("-feature", "-deprecation")

resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases"

 libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-actor" % "2.3.11",
    "org.scalatest" %% "scalatest" % "2.2.1" % "test", 
    "com.typesafe.akka" %% "akka-testkit" % "2.3.11",
    "com.typesafe.akka" %% "akka-actor" % "2.3.11"
  )

