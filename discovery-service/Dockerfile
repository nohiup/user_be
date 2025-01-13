FROM openjdk:17-jdk-alpine

# Đặt thư mục làm việc
WORKDIR /app

# Copy file .jar vào container
ARG JAR_FILE=target/discovery_service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} discovery-service-0.0.1.jar

EXPOSE 8761

# Chạy ứng dụng
ENTRYPOINT ["java", "-jar", "discovery-service-0.0.1.jar"]
