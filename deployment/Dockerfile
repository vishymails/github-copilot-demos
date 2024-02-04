# create docker file to deploy jar file to docker container

# Use the official maven/Java 21 image to create a build artifact.

FROM openjdk:21-jdk

LABEL maintainer="DR.RAO"

EXPOSE 8080

COPY ecomm-demo-0.0.1-SNAPSHOT.jar .

# Run the jar file

CMD ["java", "-jar", "ecomm-demo-0.0.1-SNAPSHOT.jar"]


