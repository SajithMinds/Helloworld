FROM openjdk:17
EXPOSE 8082
ADD target/hello11-0.0.1-SNAPSHOT.jar sprg.jar
ENTRYPOINT ["java","-jar","/sprg.jar"]