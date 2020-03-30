FROM maven:3-jdk-11 as build

COPY pom.xml /app/pom.xml
WORKDIR /app/
RUN mvn dependency:go-offline

COPY . /app/
RUN mvn clean package

FROM openjdk:11 as deploy
COPY --from=build /app/target/**.jar /app/app.jar
CMD java -jar /app/app.jar