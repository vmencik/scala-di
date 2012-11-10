name := "scala-spring"

version := "1.0-SNAPSHOT"

scalaVersion := "2.9.2"

resolvers += "SpringSource Repository" at "http://repo.springsource.org/release"


libraryDependencies ++= Seq (
	"org.springframework" % "spring-web" % "3.1.3.RELEASE",
	"org.eclipse.jetty" % "jetty-webapp" % "8.1.7.v20120910" % "container,compile",
	"org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "container,compile" artifacts Artifact("javax.servlet", "jar", "jar")
)

seq(webSettings :_*)
