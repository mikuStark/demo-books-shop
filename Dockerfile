FROM openjdk:11

ENV PORT 3000

EXPOSE $PORT

ADD ./target/spring.data-0.0.1-SNAPSHOT.jar .

#VOLUME ["./data"]

ENTRYPOINT ["java", "-jar", "spring.data-0.0.1-SNAPSHOT.jar"]