FROM openjdk:17-jdk-alpine

# Đặt thư mục làm việc
WORKDIR /app

# Copy file .jar vào container
ARG JAR_FILE=target/auth_service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} auth-service-0.0.1.jar

# Copy file .env vào container
COPY .env .env

EXPOSE 8088

# Chạy ứng dụng
ENTRYPOINT ["java", "-jar", "auth-service-0.0.1.jar"]
