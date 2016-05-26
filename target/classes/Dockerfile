FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD fondomon-ws-1.3.5.RELEASE.jar  app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]