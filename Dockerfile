FROM openjdk:17
EXPOSE 8082
ADD target/hello11-0.0.1-SNAPSHOT.jar springboothelloworld.jar
ENTRYPOINT ["java","-jar","/springboothelloworld.jarr"]