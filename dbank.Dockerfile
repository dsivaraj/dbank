FROM openjdk:8-jdk-alpine as app
#RUN addgroup -S spring && adduser -S spring -G spring
#USER spring:spring
#RUN mkdir -p app/gradle/
COPY ["gradlew", "build.gradle","settings.gradle", "/"]
COPY ["gradle/wrapper","/gradle/wrapper"]
COPY ["app/src", "/app/src"]
#ARG DEPENDENCY=build
#COPY ${DEPENDENCY}/libs /app/libs
RUN ./gradlew --version
RUN ./gradlew clean build
#CMD ./gradlew clean build
CMD java -jar /build/libs/dbank-1.0-SNAPSHOT.jar
EXPOSE 8080
#ENTRYPOINT ["java","-cp","app:app/libs/*","com.dbank.MainApp"]

##The stages are built "from top to bottom"
#######################################################
## Stage: base | shared by both dev and prod containers
#######################################################
#
#RUN apt-get update && \
#    apt-get -y install \
#    vim \
#    curl \
#    jq
#
## Add user and group for global pay
#RUN groupadd -g 1000 db && \
#    useradd -m -g db -u 1000 db
#
#ENV SRC_HOME /dbank
#WORKDIR $SRC_HOME
#
#
#EXPOSE 8080
#
#
## Build args used to open up access to alpine packages on buildhub.
## These are only used during build and NOT used by the final image.
#ARG HTTP_PROXY
#ARG HTTPS_PROXY
#
## Copy in app's gradle files and download dependencies before
## adding source in order to best utilize docker cache
#RUN mkdir -p app/gradle/
#COPY --chown=db:db app/gradle/ app/gradle/
#COPY ["app/gradlew", "app/build.gradle", "app/"]
#RUN cd app && ./gradlew --version
#RUN cd app && ./gradlew clean downloadDependencies
#
## Add all source code into container
#COPY --chown=db:db ./ ./
#
#WORKDIR $SRC_HOME
#RUN cd app && ./gradlew clean build
#
#RUN mkdir -p /build/libs
#
## Copy db-public-ca-truststore.jks to /dist/keys directory for FLYWAY Migration
#RUN cp -r app/build/resources/main/* /build/libs/
#
## Move resulting war to another location so it doesn't get mounted over during development
#RUN mv app/build/libs/payment-manager.war /payment-manager.war
#
#COPY --chown=db:db --from=build /build/libs  build/libs
#COPY --chown=db:db --from=build /payment-manager.war /payment-manager.war