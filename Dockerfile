# Usar una imagen base de Java
#FROM openjdk:23-jdk-nanoserver

# Copiar el archivo JAR de la aplicación al contenedor y renombrarla app en el contenedor
#COPY target/technicalSkills-0.0.1-SNAPSHOT.jar java_app.jar
#docker build target/technicalSkills-0.0.1-SNAPSHOT.jar
# Usa la hora local en el contenedor
#RUN apt-get install -y tzdata
#ENV TZ America/Mexico

# Comando para ejecutar la aplicación clonada
#ENTRYPOINT ["java", "-jar", "java_app.jar -Dspring.profiles.active=develop"]
# -------------------------------------------------
#Usar una imagen base de Java
FROM openjdk:23

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo JAR de la aplicación al contenedor
COPY target/technicalSkills-0.0.1-SNAPSHOT.jar java_app.jar

# Exponer el puerto en el que la aplicación se ejecutará
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "java_app.jar"]

#--------------------------------------------------------------------------------------
	
# Copiar el archivo de credenciales al contenedor
COPY application_default_credentials.json /app/credenciales.json

# Establecer la variable de entorno para las credenciales
ENV GOOGLE_APPLICATION_CREDENTIALS="/app/credenciales.json"

#ejecutar docker build -t my-app .