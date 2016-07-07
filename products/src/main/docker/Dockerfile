# Dockerfile for products microservice
FROM java:8
MAINTAINER Claudio de Oliveira<claudioed.oliveira@gmail.com>
VOLUME /tmp
COPY products-1.0-SNAPSHOT.jar products.jar
RUN bash -c 'touch /products.jar'
ENTRYPOINT ["java","-Dspring.profiles.active=docker","-jar","/products.jar"]