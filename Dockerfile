FROM adoptopenjdk/openjdk8:latest
ADD target/bmp-aggregation-bs-1.0.jar bmp-aggregation-bs.jar
RUN sh -c 'touch /bmp-aggregation-bs.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/bmp-aggregation-bs.jar"]