This is a simple Guestbook example. It demonstrates...

 - How to write a completely XML-free Spring application
 - A few of Spring 3.1's Java configuration enhancements, such as
   @EnableTransactionManagement, @EnableWebMvc, and @ComponentScan
 - Very basic Spring MVC
 - Testing Spring MVC using the spring-test-mvc mock support.

With regard to being XML-free, note the following:

 - All Spring configuration is done with Spring's Java-based configuration
 - WEB-INF/web.xml has been replaced with GuestbookWebAppInitializer.java
 - log4j.properties is used instead of log4j.xml
 - Instead of using an XML-based Ant or Maven build, this project uses
   a Groovy-based Gradle build

Even though this project is Gradle-built, you shouldn't need to install
Gradle to build it. It includes the Gradle Wrapper, so building a WAR
file from it should be as simple as 'gradlew build'. 

To import the project into Eclipse/STS, do 'gradlew eclipse' to generate the
Eclipse project metadata and then import it as an existing Eclipse project.

Because the application takes advantage of Servlet 3.0 features, it must
be deployed in a Servlet 3.0-compatible container, such as Tomcat 7.
