FROM openjdk:17
EXPOSE 9000
ADD target/jenkins-spring-project.jar jenkins-spring-project.jar
ENTRYPOINT ["java","-jar", "/jenkins-spring-project.jar"]