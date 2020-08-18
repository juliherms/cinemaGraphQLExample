#mvn clean install -DskipTests=true
FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ADD target/cinema-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]