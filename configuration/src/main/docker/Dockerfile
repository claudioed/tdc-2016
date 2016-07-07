# Dockerfile for configuration microservice
FROM java:8
MAINTAINER Claudio de Oliveira<claudioed.oliveira@gmail.com>
VOLUME /tmp
COPY configuration-1.0-SNAPSHOT.jar configuration.jar
RUN bash -c 'touch /configuration.jar'
ENTRYPOINT ["java","-Dspring.profiles.active=docker","-jar","/configuration.jar"]