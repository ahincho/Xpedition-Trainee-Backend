# Xpedition Trainee - Backend Developer Challenge

## 1. Descripción del Reto para Backend

En mi empresa, se ha establecido un estándar de colores para su uso en diversos productos, como sitios web, nuevos diseños, materiales impresos y redes sociales. Con el objetivo de facilitar el acceso a estos colores para otros departamentos y diseñadores, se me ha asignado la tarea de desarrollar una API que proporcionará acceso a esta paleta de colores. Mi compañera se encargará de crear el Frontend para interactuar con esta API.

## 2. Breve Introducción a la Aplicación

He desarrollado una API Rest utilizando tecnologías como el Lenguaje de Programación Java y su Framework Spring Boot 	

## 3. Listado de Tecnologías y Frameworks Utilizados

- Java 17: Lenguaje de Programación Java en su versión 17. Disponible en https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html

- Spring Boot: Framework Backend de Java muy conocido. La única dependencia que acarrea es un gestor de paquetes y constructor de artefactos de software como Maven o Gradle, en mi caso use Maven.

- Maven: Gestor de paquetes y artefactos de software resultantes de un proyecto en Java. Disponible en https://maven.apache.org/download.cgi

- MySQL: Base de Datos Relacional.

- Swagger y Open API: Documentación de la API Rest desarrollada.

- Docker: Máquinas Virtuales.

- Docker Desktop: Orquestación de Contenedores y Máquinas Virtuales.

- Git Hub: Repositorio de Código Fuente gratuito y en la nube. También nos permite hacer integraciones con Clever Cloud y Render para desplegar Servicios Web en la Nube.

- Docker Hub: Creación, subida y alojamiento de imágenes para máquinas virtuales.

- Postman: Testeo de la Api.

- Clever Cloud: Servicio de Base de Datos Gratuito.

- Render: Servicio de Hosting de Aplicaciones y Servicios Web en general. Nos permite trabajar con artefactos de software o imágenes de Docker.

## 4. Instalación de las Dependencias y Ejecución del Proyecto

- A

## 5. Enlace (URL) al Ambiente del Producción

Estoy utilizando servicios de hosting gratuitos como Clever Cloud y Render para poder desplegar mi aplicación o API Rest en la nube.

Algo que tengo que dejar en claro es que estos servicios al ser gratuitos tienen un control sobre la actividad de los usuarios, es decir, si nadie realizar peticiones el servidor se apagará automaticamente.

Para volver a reiniciar o encender el servicio debemos realizar algunas peticiones desde Postman o un Navegador Web. Lo que recomiendo es utilizar Postman y enviar una solicitud GET al endpoint de listado de colores.

Sin ningún otro alcance, comparto las URLs de mi Ambiente de Producción en Render y Base de Datos MySQL en Clever Cloud.

### **Servidor en Render**

https://xpedition-trainee-backend.onrender.com

A veces está caído o inoperativo ya que es un servidor gratuito que se apaga cuando nadie lo utiliza y vuelve a iniciarse cuando recibe algunas solicitudes desde Postman o Navegador

### **Puerto o Path de la API Rest**

https://xpedition-trainee-backend.onrender.com/api/colors

Usarlo desde Postman, por defecto devuelve el listado de colores paginado. Se puede acceder a los demás métodos o funcionalidades agregando IDs de los colores o cambiando el tipo de método HTTP

### **Documentación la API Rest**

https://xpedition-trainee-backend.onrender.com/v3/api-docs

Recomiendo abrirlo desde Mozilla Firefox u Opera. En su defecto, instalar una extensión que formatee el archivo JSON con la documentación de mi API Rest

### **Swagger y Open API de la API Rest**

https://xpedition-trainee-backend.onrender.com/swagger-ui/index.html

Interfaz de Aplicación para las personas interesadas en mi API Rest, aquí expongo todos mis métodos, formatos y retornos de mi API Rest usando el estándar Open API

## 6. Instrucciones de Como Poblar la Base de Datos del Ambiente de Desarrollo

## 7. Revisión Rápida de los Requerimientos

## 8. Especificaciones y Documentación

## 9. Revisión Rápida de los Puntos a Evaluar

## 10. Revisión Rápida de los Puntos Extras del Reto

- Pruebas Unitarias o Alguna Herramienta: Postman (Archivos en repo github)

- Código HTTP Correctos. (Capa controller y errorHandler)

- Dockerización del Proyecto: Archivo Dockerfile (https://hub.docker.com/r/ahincho/springboot-colors)

- URL del Ambiente de Producción:

	- https://xpedition-trainee-backend.onrender.com/
	- https://xpedition-trainee-backend.onrender.com/swagger-ui/index.html
	- https://xpedition-trainee-backend.onrender.com/v3/api-docs

- Respuesta en XML: Agregar Header "Accept application/xml" en el REQUEST (Test en los archivos Postman)

- Colección de Endpoints en Postman o Insomnia.
