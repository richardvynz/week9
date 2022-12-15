FROM openjdk:17
ADD ./target/week9-0.0.1-SNAPSHOT.jar week9_task.jar
ENTRYPOINT ["java", "-jar","week9_task.jar"]
EXPOSE 8080