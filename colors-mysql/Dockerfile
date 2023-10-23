# Package This Project Using Maven Running this Command on Terminal
# > mvn clean
# > mvn package
# Run this Command on Terminal to Create the Docker Image
# > docker build -t springboot-colors:1.0 .
FROM amazoncorretto:17.0.8-alpine
# VOLUME /tmp
# EXPOSE 8085
# ARG JAR_FILE=target/colors-mysql-1.0.jar
# ADD ${JAR_FILE} colors.jar
# LABEL name="springboot-colors"
# LABEL authors="Angel Hincho"
# LABEL mainteiner="ahincho"
COPY target/colors-mysql-1.0.jar colors.jar
ENTRYPOINT ["java","-jar","/colors.jar"]