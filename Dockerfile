FROM adoptopenjdk/openjdk11:ubi
RUN mkdir /usr/src/app
WORKDIR /usr/src/app

ARG JAR_FILE=*.jar
COPY ${JAR_FILE} /usr/src/app
ENTRYPOINT ["java", "-jar", "/opt/application/application.jar"]

