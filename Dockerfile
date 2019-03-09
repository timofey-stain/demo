FROM  openjdk:8-jre-alpine3.9

COPY target/demo-0.0.1-SNAPSHOT.jar /app/application.jar

WORKDIR /app

CMD java -jar application.jar