FROM openjdk:19
COPY target/server-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
