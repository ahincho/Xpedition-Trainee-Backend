# **Xpedition Trainee - Backend Developer Challenge**

## **1. Descripción del Reto para Backend**

En mi empresa, se ha establecido un estándar de colores para su uso en diversos productos, como sitios web, nuevos diseños, materiales impresos y redes sociales. Con el objetivo de facilitar el acceso a estos colores para otros departamentos y diseñadores, se me ha asignado la tarea de desarrollar una API que proporcionará acceso a esta paleta de colores. Mi compañera se encargará de crear el Frontend para interactuar con esta API.

## **2. Breve Introducción a la Aplicación**

Spring Boot Colors API Rest proporciona acceso a una paleta de colores estandarizada para diversos propósitos, desde diseño web hasta materiales impresos. Está construida en Java 17 y Spring Boot, respaldada por una base de datos MySQL. La documentación utiliza Swagger y Open API, y la aplicación se ejecuta en Docker. El código fuente y las imágenes de Docker se alojan en GitHub y Docker Hub.

Para probar y consumir la API, se recomienda Postman. La aplicación también se despliega en Clever Cloud y Render para su uso en la nube o producción. Cumple con requisitos esenciales, incluyendo operaciones CRUD, paginación, validación de campos y ofrece una amplia documentación.

En resumen, esta aplicación ofrece una solución completa y versátil para la gestión de una paleta de colores, respaldada por tecnologías modernas y opciones de despliegue en la nube.

## **3. Listado de Tecnologías y Frameworks Utilizados**

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

## **4. Instalación de Dependencias y Ejecución del Proyecto: Enfoque en la Nube o Cloud**

Esto dependenderá mucho del tipo de instalación que se quiera hacer por ejemplo Local, Dockerizado o en Nube (Cloud).

### **a. Instalación Local del Proyecto**

Para una instalación local necesitaremos copiar el código fuente que brindo en el repositorio que he creado en Git Hub para el Reto Backend Developer. Disponible en: https://github.com/ahincho/Xpedition-Trainee-Backend.git

Empecemos con lo más sencillo, necesitaremos instalar de manera local el JDK de Java 17 (https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) y la Base de Datos MySQL (la configuración es personalizada). Luego de ello necesitaremos un Entorno de Desarrollo Integrado (IDE) el cual se encargará de ejecutar el proyecto, aquí recomiendo utilizar Visual Studio Code (VS Code) (https://code.visualstudio.com) o Intellij IDEA (https://www.jetbrains.com/idea/download)

En mi caso, soy más familiar a Intellij IDEA. Además debemos instalar Maven en nuestra máquina virtual para poder ejecutar sus comandos de construcción y empaquetado (https://maven.apache.org/download.cgi). Finalmente con Java, MySQL, Intellij IDEA y Maven instalados debemos ejecutar desde Intellij IDEA la clase 'ColorsMysqlApplication' (src/main/java/com/trainee/colors/ColorsMysqlApplication.java) y con eso ya estaría levantando nuestra API Rest en el puerto 10000 de localhost.

Es importante mencionar que las propiedades como conexión a Base de Datos MySQL se deben configurar en el archivo centralizado 'application.properties' (src/main/resources/application.properties) cambiando la URL, usuario y contraseña. Como podemos ver, la instalación local es muy tediosa y agotadora. Sin embargo, esto se solucionará más adelante.

### **b. Instalación Dockerizada del Proyecto**

Debemos instalar Docker y Docker Desktop (https://www.docker.com/products/docker-desktop/), que en realidad vienen de la mano, para poder utilizar este tipo de instalación.

Finalmente debemos clonar la imagen de Docker que he subido a Docker Hub (https://hub.docker.com/r/ahincho/springboot-colors) y configurar nuevamente las variables de conexión hacia la Base de Datos MySQL.

Para configurar la conexión a Base de Datos del proyecto dockerizado debemos agregar las variables de entorno 'DATABASE_URL', 'DATABASE_USERNAME' y 'DATABASE_PASSWORD' que corresponden cada una la URL, usuario y contraseña la Base de Datos en MySQL.

Un ejemplo de dockerización de mi API Rest en Spring Boot se puede encontrar en el archivo 'docker-compose.yml' que está en mi repositorio en Git Hub. Se aconseja seguir de ejemplo ese archivo y luego ejecutar el comando 'docker compose up' para levantar el contenedor o aplicación dockerizada.

Aquí como podemos ver, ya no tenemos mucho trabajo que hacer. Sin embargo, aún tenemos muchas cosas que instalar de manera local que se podrían evitar.

### **c. Instalación en la Nube o Ambiente de Producción**

Aquí, ya no necesitamos hacer ninguna instalación, ya que 'yo' he realizado toda la parte de la configuración e instalación en los servidores de Clever Cloud (Base de Datos MySQL) y Render (Hosting de la API Rest) antes de enviar mi Reto de Backend Developer.

¿Es en serio? Sí, es en serio! Yo ya he 'sufrido' todo este proceso de instalación en la nube o cloud para que usted pueda utilizar mi API Rest de manera sencilla enviando solicitudes a través de un Frontend o usando Postman (https://www.postman.com/downloads).

Lo único malo de esta instalación es que está sobre servidores y una capa gratuita así que demoran un poco en iniciar y usualmente se apagan por lo cual es necesario que usted envien algunas o varias solicitudes HTTP para que Render pueda volver a lanzar o iniciar la aplicación. Pero ya no debe instalar nada en su computadora u ordenador :)

La API Rest se encuentra publicada en el servidor de Render 'https://xpedition-trainee-backend.onrender.com/' y usted puede acceder a los endpoints desde 'https://xpedition-trainee-backend.onrender.com/api/colors' o utizar la interfaz web Open API desde 'https://xpedition-trainee-backend.onrender.com/swagger-ui/index.html' (Lo más amigable y agradable a la vista)

- Para este apartado usted puede revisar los enlaces que he comparto en la sección de tecnologías y frameworks utilizados donde encontrará la mayoría de instaladores.

## **5. Enlace (URL) al Ambiente del Producción**

Estoy utilizando servicios de hosting gratuitos como Clever Cloud y Render para poder desplegar mi aplicación o API Rest en la nube.

Algo que tengo que dejar en claro es que estos servicios al ser gratuitos tienen un control sobre la actividad de los usuarios, es decir, si nadie realiza peticiones el servidor se apagará automaticamente.

Para volver a reiniciar o encender el servicio debemos realizar algunas peticiones desde Postman o un Navegador Web. Lo que recomiendo es utilizar Postman y enviar una solicitud GET al endpoint de listado de colores o acceder varias veces desde el navegador hacia las URLs del ambiente de producción que comparto.

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

## **6. Instrucciones de Como Poblar la Base de Datos del Proyecto**

Este apartado depende mucho de como vayamos a desplegar el proyecto. Suena complicado pero realmente no lo es. Ahora lo explicaré de manera sencilla y entendible.

### **a. Poblado de la Base de Datos del Ambiente de Desarrollo**

Este es el caso más sencillo de todo el proyecto. Debemos dirigirnos al archivo de configuración central 'application.properties' y descomentar la línea "spring.jpa.hibernate.ddl-auto = create" y luego comentar la línea 'spring.jpa.hibernate.ddl-auto = update'.

Lo que hará lo anterior es básicamente inicializar o poblar la base de datos de desarrollo con los datos que se encuentran en el archivo 'import.sql'.

Si existen dudas de dónde se encuentran estos archivos les comparto su ubicación aquí mismo.

- Archivo 'application.properties': src/main/resources/application.properties

- Archivo 'import.sql': src/main/resources/import.sql

### **b. Poblado de la Base de Datos en un Contenedor**

Podemos agregar otro contenedor con una imagen de MySQL en nuestro archivo 'docker-compose' y luego iniciar sus datos con el archivo 'init.sql'.

Si vamos a agregar dicho contendor con la imagen de MySQL entonces debemos agregar el parámetro 'volumen' y copiart el archivo 'init.sql' dentro de la máquina virtual o contenedor.

Quedaría algo como: './init.sql:/docker-entrypoint-initdb.d'. Esta sentencia lo que hace es copiar el archivo 'init.sql' hacia nuestra base de datos dockerizada y ejecutar dicho script para poblar la base de datos.

- Archivo 'docker-compose': docker-compose.yml (Ambos se encuentra en el directorio raiz)

- Archivo 'init.sql': init.sql (Ambos se encuentra en el directorio raiz)

### **c. Poblado de la Base de Datos en el Ambiente de Producción o Nube**

También este proceso es sencillo ya que he creado una colección en Postman 'ColorsCloudPopulation.Postman-Collection.json' (Se encuentra en el directorio raiz) que envía solicitudes de tipo HTTP Post para crear varios colores. Entonces solo debemos abrir esta colección en Postman y ejecutarla.

## **7. Requerimientos del Proyecto - Revisión Rápida**

### **a. Implementar un CRUD de Colores de acuerdo a las Especificaciones y Estándares**

He implementado el CRUD de Colores utilizando Java, Spring Boot y MySQL a través de una API Rest con métodos HTTP GET, POST, UPDATE y DELETE. Se puede utilizar desde un ambiente local pero la mejor opción es el servicio web en la nube que he creado con la ayuda de Clever Cloud y Render. Disponible en: 'https://xpedition-trainee-backend.onrender.com/api/colors'. En otras secciones explico otros tipos de instalación y como ejecutar las colecciones de prueba en Postman.

### **b. Implementar Paginación**

Al momento de llamar o enviar solicitudes al endpoint 'https://xpedition-trainee-backend.onrender.com/api/colors' utilizando el métood HTTP GET obtenemos una página con 9 colores (Requerimiento del Frontend) así como un enlace a la siguiente página y también a la previa (Si es que existen). En caso no exista contenido en una página entonces se devuelve el Status 204 No Content.

Puede revisar como he implementado la paginación de los datos que ofrece la API Rest (Pageable) revisando los archivos 'src/main/java/com/trainee/colors/application/services/ColorServiceMySql.java' y 'src/main/java/com/trainee/colors/infrastructure/controllers/ColorControllerRest.java' en mi repositorio de Git Hub

### **c. Validación de los Campos Color y Pantone**

Para esto me he apoyado mucho en el framework de Spring Boot y el patrón Data Transfer Object donde utilizo los Bean Validators y Expresiones Regulares (Regex) para recuperar el objeto que estoy recibiendo hacia mi API Rest.

Puede revisar como he implementado la Validación revisando en los siguientes archivos 'src/main/java/com/trainee/colors/domain', 'src/main/java/com/trainee/colors/domain/dtos/ColorRequest.java' y 'src/main/java/com/trainee/colors/infrastructure/controllers/ColorControllerRest.java'

### **d. Responder con los Colores más Recientes en Creación y Actualización**

Para ello me apoyo mucho, nuevamente, en el framework de Spring Boot. Donde utilizo las páginas o Pages y luego aplico un filtro de ordenación sobre los campos 'createdOn' y 'lastUpdateOn' (Creación y actualización) de forma descendente (Para ver las últimas modificaciones y agregaciones)

Puede revisar como lo he implementado en el archivo 'src/main/java/com/trainee/colors/application/services/ColorServiceMySql.java' exactamente en el método 'findAll()' usando 'Sort.by("lastUpdatedOn", "createdOn").descending()'

### **e. Archivo Semilla para Poblar los Datos en Desarrollo**

Ya explique como poblar la Base de Datos MySQL en otros apartados y cómo podemos utilizar tanto las colecciones en Postman como las sentencias SQL que se encuentran en 'src/main/resources/import.sql', 'init.sql' y 'ColorsCloudPopulation.Postman-Collection.json'

### **f. Devolver JSON o XML**

También ya lo expliqué en otro apartado del ReadMe, básicamente utilizo la librería Jackson para poder transformar los datos que envío de mi API Rest a los formatos JSON y XML. Para ello el usuario o cliente debe incluir en el request el header 'Accept: application/xml'.

Puede revisar como lo he implementado en el archivo 'src/main/java/com/trainee/colors/infrastructure/controllers/ColorControllerRest.java' utilizando el argumento 'produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }'

### **g. Diagrama Entidad Relación para Agregar Usuarios**

Lo estoy agregando tanto en formato PDF tanto en el repositorio de código fuente en Git Hub como en el envío del Backend Challenge. Básicamente tenemos una relación de 'uno a varios' entre la entidad Usuario y la entidad Color. Donde un Usuario puede tener varios Colores y varios Colores pertenecen a un solo Usuario (los colores pueden variar en nombres)

### **h. Archivo de Texto Describiendo el Enfoque de mi Solución**

En sí sería todo este archivo Read Me que estoy desarrollando y subiendo a mi repositorio de código fuente en Git Hub. Sin embargo, estoy generando otro archivo de texto más resumido y adjuntandolo en la entrega.

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

## **9. Puntos a Evaluar del Reto - Revisión Rápida**

### **a. Organización, Estructuración del Código y Algoritmia**

Tengo experiencia en arquitectura de software y siempre me ha gustado desarrollar mis proyectos utilizando la Arquitecura Hexagonal donde todos mis componentes del proyectos son abstraidos a tres capas principales: Dominio, Aplicación e Infraestructura.

A partir de estas capas empiezo a desarrollar mi código, donde la Capa de Dominio contiene todas las entidades que van a participar en mi casuistica. La Capa de Aplicaciones contiene tanto los servicios y otras utilidades de comunicación o recursos que necesite mi aplicación.

Finalmente la Capa de Infraestructura es donde expongo mis servicios a través de controladores rest y configuro el comportamiento en general y de alto nivel de mi aplicación o proyecto. Cabe mencionar que uso patrones como la Inversión de Independencias, Segregación de Interfaces, etc.

### **b. Implementación y Estándar API**

Para ello he utilizado Java y Spring Boot. De esta manera pude construir de manera rápida y robusta mi API Rest. Además que controlo tanto la validación de las entidades que recibo y envio usando patrones como Bean Validators y Data Transfer Objects (DTOs). Otro patrón más que uso es Open API que es apoyado por Google para exponer mis servicios web a las personas o usuarios.

### **c. Patrones de Diseño**

Como he mencionado ya anteriormente, principalmente he utilizado la Arquitectura Hexagonal y el estándar Open API para poder implementar mi API Rest. También he utilizado archivos centralizados de configuración para la parte de deployment (CI/CD) y de esta manera poder facilitar el mantenimiento y puesta en marcha.

### **d. Documentación**

La documentación que he generado en el proyecto va desde mis comentarios, commits en el repositorio de código fuente en Git Hub, imagenes en Docker Hub, colecciones en Postman para testear la API Rest y el estándar Open API.

### **e. Bases de Datos y SQL**

He utilizado la Base de Datos MySQL debido a su soporte de parte de Oracle y su robustez. También que cuenta con una comunidad activa y amplia. Utilice sentencias SQL para crear los esquemas (schemas), tablas (tables) y registros (records) en la base de datos en MySQL que se evidencia en los archivos 'init.sql' e 'import.sql'.

### **f. Uso del Framework**

Estoy utilizando el framework de Spring Boot el cual es la extensión de Spring Core (Spring) y utiliza patrones como la Inversión de Dependencias, Configuración Centralizada usando archivo .yml o .properties. Además utilizo anotaciones para crear componentes como controladores rest, repositorios de datos, servicios, handlers de errores, etc.

### **g. Programación Orientada a Objetos**

En la Capa de Dominio 'src/main/java/com/trainee/colors/domain' se puede evidenciar como utilizo la Programación Orientada a Objetos para poder identificar entidades y su comportamiento. Finalmente escalo dicho compartamiento a través de la inversión para poder tener un código escalable, mantenible y agradable a la vista.

### **h. Descripción del Proyecto**

Durante todo este archivo 'README.md' he tratado de documentar de la mejor manera todo mi trabajo y proyecto que he desarrollado durante estos 3 días del Reto Backend Developer. Esto se me hace agradable ya que de manera ligera utilizando un archivo de texto puedo llegar a generar un documento con títulos, encabezados, apartados, etc. Considero que he expuesto todos los puntos que se solicitaron para el Trainee Backend Challenge en su totalidad.

## 10. Puntos Extras del Reto - Revisión Rápida

### **a. Pruebas Unitarias o Alguna Herramienta**

He utilizado Postman para realizar pruebas, tanto en ambiente de producción como en ambiente de desarrollo, a mi API Rest. Para todos los métodos que he implemetado: GET, POST, PUT y DELETE.

Las pruebas o colecciones en Postman se encuentra en el directorio raíz de mi proyecto en Git Hub y son los archivos 'ColorsCloudDeployment.Postman-Collection.json' (Producción) y 'ColorsLocalhost.Postman-Collection.json' (Desarrollo).

### **b. Código HTTP Correctos**

Esto se puede ver implementado en código Java y con ayuda del framework Spring Boot. He seguido una arquitectura hexagonal y programación orientada a aspectos (AOP) donde controlo los estados, retornos y posibles errores de mi API Rest en las capas de aplicación e infraestructura.

Para poder ver los estados que retorno en cada tipo de retorno o llamada puede revisar los archivos:

- src/main/java/com/trainee/colors/application/services/ColorServiceMySql.java
- src/main/java/com/trainee/colors/infrastructure/controllers/ColorControllerRest.java
- src/main/java/com/trainee/colors/infrastructure/handlers/ErrorHandler.java

### **c. Dockerización del Proyecto**

Utilizando los servicios de Docker, Docker Desktop y Docker Hub he logrado dockerizar mi aplicación API Rest con Spring Boot y MySQL usando el archivo Dockerfile y Docker Compose (Directorio raíz del proyecto)

Luego de dockerizar mi aplicación o API Rest, subi la imagen al repositorio de Docker Hub que almacena varias imágenes de softwares y aplicaciones que podemos utilizar.

Disponible en: https://hub.docker.com/r/ahincho/springboot-colors

### **d. Links (URLs) del Ambiente de Producción**

Algo que tengo que dejar en claro es que estos servicios al ser gratuitos tienen un control sobre la actividad de los usuarios, es decir, si nadie realiza peticiones el servidor se apagará automaticamente.

Para volver a reiniciar o encender el servicio debemos realizar algunas peticiones desde Postman o un Navegador Web. Lo que recomiendo es utilizar Postman y enviar una solicitud GET al endpoint de listado de colores o acceder varias veces desde el navegador hacia las URLs del ambiente de producción que comparto.

- https://xpedition-trainee-backend.onrender.com (Servidor gratuito en Render)
- https://xpedition-trainee-backend.onrender.com/swagger-ui/index.html (Interfaz de Swagger y Open API de la API Rest desarrollada)
- https://xpedition-trainee-backend.onrender.com/v3/api-docs (Documentación de la API Rest desarrollada)

### **e. Respuesta en XML**

Para recibir una respuesta en formato XML de mi API Rest se debe agregar el header "Accept: application/xml" en el request o petición HTTP a cualquier endpoint

Para facilitar esto he creado casos y requests de pruebas utilizando Postman. Estos se encuentra en los archivos 'ColorsCloudDeployment.Postman-Collection.json' y 'ColorsLocalhost.Postman-Collection.json' (Directorio Raiz). Ambos tienen una subcarpeta llamada XML donde encontrarán ese tipo de retorno o respuesta.

### **f. Colección de Endpoints en Postman o Insomnia**

Como ya lo comente en el punto anterior, he documentado y testeado la API Rest utilizando Postman y creando las colecciones 'ColorsCloudDeployment.Postman-Collection.json' y 'ColorsLocalhost.Postman-Collection.json' (Directorio Raiz)
