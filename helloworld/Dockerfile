FROM openjdk:11.0.5-jre-slim-buster

ARG JAR_FILE=build/libs/helloworld-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} /app/helloworld.jar
COPY ./entrypoint.sh /entrypoint.sh

RUN chmod +x /entrypoint.sh

WORKDIR /app

EXPOSE 7001

ENTRYPOINT ["/entrypoint.sh"]