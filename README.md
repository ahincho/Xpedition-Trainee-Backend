# Xpedition Trainee - Backend Developer Challenge

## 1. Descripción del Reto para Backend

En mi empresa, se ha establecido un estándar de colores para su uso en diversos productos, como sitios web, nuevos diseños, materiales impresos y redes sociales. Con el objetivo de facilitar el acceso a estos colores para otros departamentos y diseñadores, se me ha asignado la tarea de desarrollar una API que proporcionará acceso a esta paleta de colores. Mi compañera se encargará de crear el Frontend para interactuar con esta API.

## 2. Breve Introducción a la Aplicación

He desarrollado una API Rest utilizando tecnologías como el Lenguaje de Programación Java y su Framework Spring Boot 	

## 3. Listado de Tecnologías y Frameworks Utilizados

### **a. Java 17**

Lenguaje de Programación Java en su versión 17. Uno de mis favoritos debido a su robustez al momento de desarrollar servicios web e incluso aplicaciones de escritorio

Disponible en: https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html

### **b. Spring Boot**

Framework para Backend de Java muy conocido, robusto y activo tanto en desarrollo y comunidad.

La única dependencia que acarrea es un gestor de paquetes y constructor de artefactos de software como Maven o Gradle, en mi caso use Maven.

Disponible en: https://spring.io/projects/spring-boot

### **c. Maven**

Gestor de paquetes y artefactos de software resultantes de un proyecto en Java. Nos permite configurar las dependencias, ciclo de vida del software y artefactos resultantes. Tiene un 'primo' llamado Gradle.

Disponible en: https://maven.apache.org/download.cgi

### **d. MySQL**

Base de Datos Relacional muy conocida en el mercado y con una buena historia de transfondo. Lo principal que puedo mencionar es que está en constante soporte y prioriza la consistencia y disponibilida de los datos (Teorema CAP de Base de Datos)

Disponible en: https://www.mysql.com/downloads

### **e. Swagger y Open API**

Ayuda en la documentación de la API Rest desarrollada. Es un estándar adoptado por Google en el cual exponemos nuestros servicios web a través de un página centralizada que reune tanto endpoints como implementaciones.

En lo personal la encuentra muy amigable para los usuarios y programadores cuando necesiten interactuar con nuestro servicio web.

Disponible en: https://springdoc.org/

### **f. Docker**

Plataforma diseñada para ayudar a los programadores a compartir y subir sus aplicaciones en diferentes ambientes ya sean de producción o desarrollo usando máquinas virtuales

Podría haber utilizando otro servicio de virtualización como lo sería Virtual Box pero Docker ofrece una facilidad de desarrollo y creación de imágenes a traves de los archivos o recetas Dockerfile que no pude ignorarlo

Disponible en: https://www.docker.com/

### **g. Docker Desktop**

De la mano con Docker, es otra plataforma nos ayuda a gestionar nuestras imágenes y contenedores de una manera transparente y muy agradable a través de una interfaz de usuario. Como si se tratara del explorador de archivos de Windows

Aquí utilicé Docker para poder levantar una instancia de mi aplicación en Spring Boot ya dockerizada utilizando la base de datos tanto local como remota con Clever Cloud que ya explicaré más adelante

Disponible en: https://www.docker.com/products/docker-desktop/

### **h. Git Hub**

Muy conocido repositorio de código fuente gratuito en la nube. También nos permite hacer integraciones con Clever Cloud y Render para desplegar servicios web en la nube (CI/CD)

Lo utilice tanto para llevar registro de todo mi proceso de desarrollo del reto así como el código fuente. Me ayudo muchisimo a subir a producción mi servicio web utilizando Render y Clever Cloud (CI/CD)

Disponible en: https://github.com/

### **i. Docker Hub**

Al igual que Git Hub. Es una plataforma donde creamos, subimos y alojamos nuestras imágenes para máquinas virtuales. En este caso me ayudo mucho para poder exponer de manera sencilla y cómoda mi archivo Dockerfile y la imagen que genera para ustedes, señores evaluadores.

Disponible en: https://hub.docker.com/

### **j. Postman**

Aplicación que simula el comportamiento de un cliente web. Su principal uso se encuentra en el testeo de la API Rest que he desarrollado. Tiene una versión en la nube que ayuda muchisimo para el proceso de testing.

Disponible en: https://www.postman.com/downloads/

### **k. Clever Cloud**

Servicio de base de datos gratuito donde alojo todos los datos de mi API Rest para su versión en la nube o ambiente de producción. Nos permite crear algunas bases de datos en su nivel gratuito y de diferentes tipos como MySQL, PostgreSQL, MongoDB, etc. (SQL y NoSQL).

Disponible en: https://www.clever-cloud.com/

### **l. Render**

Servicio en la web para el hosting de aplicaciones y servicios web en general de manera gratuita. Nos permite trabajar con artefactos de software (.jar) o imágenes de Docker. En este caso yo utilice una línea de producción (CI/CD) utilizando Docker y Dockerfile.

Lo único malo (entre comillas) de la plataforma de hosting Render es que para ahorrar recursos (en la capa gratuita) apaga el servidor automáticamente si ningún usuario está utilizando nuestro servicio web, por lo que pido realizar unas cuantas peticiones web o acceder desde el navegador web al ambiente de producción varias veces o contactarme para mayor apoyo.

Disponible en: https://render.com/

## 4. Instalación de las Dependencias y Ejecución del Proyecto

- A

## **5. Enlace (URL) al Ambiente del Producción**

Estoy utilizando servicios de hosting gratuitos como Clever Cloud y Render para poder desplegar mi aplicación o API Rest en la nube.

Algo que tengo que dejar en claro es que estos servicios al ser gratuitos tienen un control sobre la actividad de los usuarios, es decir, si nadie realizar peticiones el servidor se apagará automaticamente.

Para volver a reiniciar o encender el servicio debemos realizar algunas peticiones desde Postman o un Navegador Web. Lo que recomiendo es utilizar Postman y enviar una solicitud GET al endpoint de listado de colores.

Sin ningún otro alcance, comparto las URLs de mi Ambiente de Producción en Render y Base de Datos MySQL en Clever Cloud.

### **a. Servidor en Render**

https://xpedition-trainee-backend.onrender.com

A veces está caído o inoperativo ya que es un servidor gratuito que se apaga cuando nadie lo utiliza y vuelve a iniciarse cuando recibe algunas solicitudes desde Postman o Navegador

### **b. Puerto o Path de la API Rest**

https://xpedition-trainee-backend.onrender.com/api/colors

Usarlo desde Postman, por defecto devuelve el listado de colores paginado. Se puede acceder a los demás métodos o funcionalidades agregando IDs de los colores o cambiando el tipo de método HTTP

### **c. Documentación la API Rest**

https://xpedition-trainee-backend.onrender.com/v3/api-docs

Recomiendo abrirlo desde Mozilla Firefox u Opera. En su defecto, instalar una extensión que formatee el archivo JSON con la documentación de mi API Rest

### **d. Interfaz Swagger u Open API de la API Rest**

https://xpedition-trainee-backend.onrender.com/swagger-ui/index.html

Interfaz de Aplicación para las personas interesadas en mi API Rest, aquí expongo todos mis métodos, formatos y retornos de mi API Rest usando el estándar Open API

## 6. Instrucciones de Como Poblar la Base de Datos del Ambiente de Desarrollo

## 7. Revisión Rápida de los Requerimientos

## **8. Especificaciones y Documentación**

La documentación la genero utilizando el estándar de Open API y Swagger. También entrego como documentación algunos enlaces útiles sobre las tecnologías, frameworks y ambientes utilizados

### **a. Repositorio de Código Fuente en GitHub**

https://github.com/ahincho/Xpedition-Trainee-Backend

Inicialmente lo configuré como privado y trabajé los 3 días de plazo para la entrega del reto de modo privado. Sin embargo, una vez pasada la fecha de entrega habilitaré el modo público para que puedan revisarlo y tener acceso a él.

### **b. Repositorio de Imágenes en DockerHub**

https://hub.docker.com/r/ahincho/springboot-colors

Lo cree el 2do día del reto para empezar a dockerizar mi aplicación y que esta se pueda ejecutar de una manera más cómoda sin tener que realizar tantas configuraciones como normalmente se hace en proyectos stand alone

La imagen requiere que entreguemos ciertos parámetros como lo sería en enlace de conexión, el usuario y contraseña hacia la base de datos. En este caso he utilizado MySQL como base de datos y dejé algunos comentarios en Docker Hub de como descargar y correr el contenedor o imagen

### **c. Documentación la API Rest**

https://xpedition-trainee-backend.onrender.com/v3/api-docs

Recomiendo abrirlo desde Mozilla Firefox u Opera. En su defecto, instalar una extensión que formatee el archivo JSON con la documentación de mi API Rest

### **d. Interfaz Swagger u Open API de la API Rest**

https://xpedition-trainee-backend.onrender.com/swagger-ui/index.html

Interfaz de Aplicación para las personas interesadas en mi API Rest, aquí expongo todos mis métodos, formatos y retornos de mi API Rest usando el estándar Open API

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
