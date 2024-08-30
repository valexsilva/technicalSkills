#--------------------------------------------------------------------------------------
FROM postgres:latest AS build2
ENV POSTGRES_PASSWORD postgres
ENV POSTGRES_DB postgres
RUN localedef -i de_DE -c -f UTF-8 -A /usr/share/locale/locale.alias de_DE.UTF-8
ENV LANG de_DE.utf8
# Exponer el puerto en el que la aplicación se ejecutará
EXPOSE 5432
# Inicializar base de datos sql
# COPY world.sql /docker-entrypoint-initdb.d/

#ejecutar docker build -t valex-db .