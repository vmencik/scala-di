name := "scala-spring-functional"

version := "1.0-SNAPSHOT"

scalaVersion := "2.9.2"

resolvers += "SpringSource Milestones Repository" at "https://repo.springsource.org/libs-milestone"


libraryDependencies ++= Seq (
	"org.springframework.scala" % "spring-scala" % "1.0.0.M1",
	"org.eclipse.jetty" % "jetty-webapp" % "8.1.7.v20120910" % "container,compile",
	"org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "container,compile" artifacts Artifact("javax.servlet", "jar", "jar")
)

seq(webSettings :_*)
