
FROM openjdk:10
VOLUME /tmp
EXPOSE 8080    
ADD target/spring-docker-demo.jar spring-docker-demo.jar
ENTRYPOINT ["java","-jar","spring-docker-demo.jar"]
