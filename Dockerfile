FROM eclipse-temurin:17-jdk-alpine

EXPOSE 8080

WORKDIR /usr/app

COPY ./build/libs/personal-ci-cd.jar /usr/app/app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
