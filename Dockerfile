FROM openjdk:17-jdk-slim AS build
WORKDIR /app
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app/gitops.jar
ENTRYPOINT ["java","-jar","gitops.jar"]