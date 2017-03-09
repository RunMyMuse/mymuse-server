# AlpineLinux with a glibc-2.21 and Oracle Java 8

FROM anapsix/alpine-java

# Set up server jar
ADD server.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
