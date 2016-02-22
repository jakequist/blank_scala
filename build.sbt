name := "blank"

version := "1.0-SNAPSHOT"

scalaVersion := "2.10.5"
 
resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq (
	"org.scalatest" %% "scalatest" % "2.2.4" % "test"
)
