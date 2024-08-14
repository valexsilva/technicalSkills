# Usar una imagen base de Java
FROM openjdk:23-jdk-nanoserver

# Copiar el archivo JAR de la aplicación al contenedor y renombrarla app en el contenedor
COPY target/technicalSkills.jar java_app.jar

RUN apt-get install -y tzdata
ENV TZ America/Mexico

# Establecer el directorio de trabajo
#WORKDIR /app
# Exponer el puerto en el que la aplicación se ejecutará
#EXPOSE 8080
#VOLUME ["/target"]

# Comando para ejecutar la aplicación clonada
ENTRYPOINT ["java", "-jar", "java_app.jar -Dspring.profiles.active=develop"]