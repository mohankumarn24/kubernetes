# Use official OpenJDK as a parent image
FROM openjdk:17-jdk-slim

# Set working directory inside container
WORKDIR /app

# Copy jar built by Maven/Gradle into the container
COPY target/springboot-k8s-demo.jar app.jar

# Expose port 8080 (matches your K8s containerPort)
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java","-jar","app.jar"]

######### Instructions to build and run the Docker image #########
## Build jar first
# mvn clean package

## Build Docker image
# docker build -t spring-boot-k8s-app:1.0 .

## Test locally
# docker run -p 8080:8080 spring-boot-k8s-app:1.0
####################################################################