# Usar una imagen base de Java
FROM openjdk:23-jdk-nanoserver

# Copiar el archivo JAR de la aplicación al contenedor y renombrarla app en el contenedor
COPY target/technicalSkills-0.0.1-SNAPSHOT.jar java_app.jar

# Usa la hora local en el contenedor
RUN apt-get install -y tzdata
ENV TZ America/Mexico

# Comando para ejecutar la aplicación clonada
ENTRYPOINT ["java", "-jar", "java_app.jar -Dspring.profiles.active=develop"]