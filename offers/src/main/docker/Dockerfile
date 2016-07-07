# Dockerfile for offers microservice
FROM java:8
MAINTAINER Claudio de Oliveira<claudioed.oliveira@gmail.com>
VOLUME /tmp
COPY offers-1.0-SNAPSHOT.jar offers.jar
RUN bash -c 'touch /offers.jar'
ENTRYPOINT ["java","-Dspring.profiles.active=docker","-jar","/offers.jar"]