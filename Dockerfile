FROM openjdk:17.0.2-jdk-slim-buster
COPY target/*.jar helm-homework.jar
COPY liquibase/changelog/*.xml /liquibase/changelog/changelog.xml
ENTRYPOINT ["java","-jar","/helm-homework.jar"]