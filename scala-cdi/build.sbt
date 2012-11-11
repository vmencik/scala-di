name := "scala-cdi"

version := "1.0-SNAPSHOT"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq (
	"javax.enterprise" % "cdi-api" % "1.0-SP4" % "provided",
	"javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided"
)
