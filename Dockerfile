# Partimos de imagen base muy ligera: Linux Alpine con jre 8
FROM openjdk:8-jre-alpine
# carpeta /tmp la requiere Spring Boot
VOLUME /tmp
ADD target/seguro-experiencia-1.0.0.jar app.jar
EXPOSE 8080
# 'Tocamos' jar aplicativo para asegurar actualizacion cambios
RUN sh -c 'touch /app.jar'
# Iniciamos app pasando endpoint de MongoDB
#ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongodb/demomicroservicios", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]