# syntax=docker/dockerfile:1

FROM gradle:7.5.1-jdk18 AS builder

WORKDIR /src
COPY --link . .
RUN gradle build --no-daemon

# Final image
FROM openjdk:18-slim

RUN mkdir /app
COPY --from=builder /src/build/libs/*.jar /app/aperture-java.jar
ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-Djava.security.egd=file:/dev/./urandom","-jar","/app/aperture-java.jar"]
