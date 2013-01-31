Examples of dependency injection in Scala
=======
All of the example projects are build using [SBT](http://www.scala-sbt.org/).

cake
----
An example of the [Cake Pattern](http://jonasboner.com/2008/10/06/real-world-scala-dependency-injection-di/).

scala-cdi
---------
This project shows the use of [Contexts and Dependency Injection](http://jcp.org/en/jsr/detail?id=299) in Scala.
It is not set up to be run directly from SBT and needs to be deployed to a Java EE 6 compliant container like
[JBoss 7](http://www.jboss.org/jbossas) or a servlet container with CDI implementation like Tomcat + Weld.

After deploying you can see it in action by accessing the `CoffeeServlet` at `http://host:port/scala-cdi/coffee`.

scala-guice
-----------
This project shows the use of [Google Guice](http://code.google.com/p/google-guice/) in Scala. Both in its pure
form and with a thin [Scala wrapper](https://github.com/codingwell/scala-guice).

The functionality is demonstrated in the test suite `ExampleSuite` that you can run by invoking `sbt test`.

scala-spring
------------
This project shows the use of the [Spring Framework](http://www.springsource.org/spring-framework) in Scala.

The it is quite similar to the `scala-cdi` project but it can be run directly from SBT using the Jetty plugin by
running sbt console and invoking `container:start`. The `CoffeeServlet` then can be accessed at
[localhost:8080/coffee](http://localhost:8080/coffee). You stop the embedded Jetty container by invoking `container:stop`.

scala-spring-functional
-----------------------
This (perhaps poorly named) project shows the use of [Spring Scala](https://github.com/SpringSource/spring-scala).

It is almost exactly the same as `scala-spring` but it uses the functional configuration from the
[Spring Scala](https://github.com/SpringSource/spring-scala) project.

It can be run directly from SBT using the Jetty plugin by running sbt console and invoking `container:start`.
The `CoffeeServlet` then can be accessed at [localhost:8080/coffee](http://localhost:8080/coffee).
You stop the embedded Jetty container by invoking `container:stop`.

subcut
------
This project demonstrates the use of [SubCut](https://github.com/dickwall/subcut).

You can run it by invoking `sbt run`.
