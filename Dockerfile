FROM java:8
VOLUME /tmp
ADD target/unicid-0.0.1-SNAPSHOT.jar unicid-docker-app.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /unicid-docker-app.jar" ]

