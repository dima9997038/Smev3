FROM maven:latest AS build

WORKDIR /app

COPY pom.xml ./
COPY src/main/resources/application.properties ./src/main/resources/application.properties

RUN mvn dependency:go-offline -B

COPY src ./src

RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim

WORKDIR /app

COPY --from=build /app/target/Smev3-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8087

ENTRYPOINT ["java", "-jar", "app.jar"]