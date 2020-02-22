FROM azul/zulu-openjdk-alpine:11-jre
EXPOSE 5000
ADD target/SpringSQLDemo.jar SpringSQLDemo.jar
CMD [ "/usr/bin/java", "-jar", "/SpringSQLDemo.jar" ]