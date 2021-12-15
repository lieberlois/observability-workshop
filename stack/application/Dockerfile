FROM busybox AS elastic-apm

# apm
ARG ELASTIC_APM_AGENT_VERSION=1.28.1
RUN wget https://search.maven.org/remotecontent?filepath=co/elastic/apm/elastic-apm-agent/${ELASTIC_APM_AGENT_VERSION}/elastic-apm-agent-${ELASTIC_APM_AGENT_VERSION}.jar -O /elastic-apm-agent.jar


FROM gradle:7.3-jdk11 AS builder

WORKDIR /build

# gradle cache
COPY build.gradle build.gradle
COPY settings.gradle settings.gradle
RUN gradle resolveDependencies

# libs
COPY springevents springevents
RUN gradle springevents:build

# service build
ARG SERVICE
COPY $SERVICE $SERVICE

RUN gradle $SERVICE:build

FROM openjdk:11-jre AS final
ARG SERVICE

COPY --from=elastic-apm /elastic-apm-agent.jar /
COPY --from=builder /build/$SERVICE/build/libs/$SERVICE.jar /
COPY entrypoint.sh /

RUN chmod +x /entrypoint.sh

ENV SERVICE=$SERVICE

EXPOSE 8080 5005
ENTRYPOINT /entrypoint.sh $SERVICE
