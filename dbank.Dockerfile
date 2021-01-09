FROM openjdk:8-jdk-alpine as app
COPY ["gradlew", "build.gradle","settings.gradle", "/"]
COPY ["gradle/wrapper","/gradle/wrapper"]
COPY ["app/src", "/app/src"]
RUN ./gradlew --version
RUN ./gradlew clean build
CMD java -jar build/libs/dbank-1.0-SNAPSHOT.jar --spring.config.additional-location=file:app/src/main/resources/application.properties
EXPOSE 8443
