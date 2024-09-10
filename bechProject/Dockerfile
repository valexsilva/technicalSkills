# Usa la hora local en el contenedor
#RUN apt-get install -y tzdata
#ENV TZ America/Mexico

# -------------------------------------------------
#Usar una imagen base de Java
FROM openjdk:23 AS build1

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo JAR de la aplicación al contenedor
COPY target/technicalSkills-0.0.1-SNAPSHOT.jar java_app.jar

# Exponer el puerto en el que la aplicación se ejecutará
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "java_app.jar"]

# Establecer la variable de entorno para la BD
ENV DATABASE_URL="postgres://postgres:docker@127.0.0.1:5431/postgres"
ENV DATABASE_USERNAME="postgres"
ENV DATABASE_PASSWORD="postgres"

#--------------------------------------------------------------------------------------
	
# Copiar el archivo de credenciales al contenedor
COPY application_default_credentials.json /app/credenciales.json

# Establecer la variable de entorno para las credenciales
ENV GOOGLE_APPLICATION_CREDENTIALS="/app/credenciales.json"

#ejecutar docker build -t my-app .