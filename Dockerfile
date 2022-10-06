# syntax=docker/dockerfile:1

FROM gradle:7.5.1-jdk18-alpine AS builder

WORKDIR /src
COPY --link . .
ENTRYPOINT ["gradle", "run", "--no-daemon"]
