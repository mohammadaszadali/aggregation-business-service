FROM openjdk:8
RUN mkdir -v apps
COPY target/bmp-aggregation-bs-1.0-SNAPSHOT.jar apps/
ENTRYPOINT ["java","-jar", "apps/bmp-aggregation-bs-1.0-SNAPSHOT.jar"]
