# Dockerfile for discovery microservice
FROM java:8
MAINTAINER Claudio de Oliveira<claudioed.oliveira@gmail.com>
VOLUME /tmp
COPY discovery-1.0-SNAPSHOT.jar discovery.jar
RUN bash -c 'touch /discovery.jar'
ENTRYPOINT ["java","-Dspring.profiles.active=docker","-jar","/discovery.jar"]