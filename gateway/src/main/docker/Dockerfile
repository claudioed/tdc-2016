# Dockerfile for gateway microservice
FROM java:8
MAINTAINER Claudio de Oliveira<claudioed.oliveira@gmail.com>
VOLUME /tmp
COPY gateway-1.0-SNAPSHOT.jar gateway.jar
RUN bash -c 'touch /gateway.jar'
ENTRYPOINT ["java","-Dspring.profiles.active=docker","-jar","/gateway.jar"]