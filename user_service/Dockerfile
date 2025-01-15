FROM openjdk:17-jdk-alpine

# Đặt thư mục làm việc
WORKDIR /app

# Copy file .jar vào container
ARG JAR_FILE=target/user_service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} user-service-0.0.1.jar

# Copy file .env vào container
COPY .env .env

EXPOSE 8082

# Chạy ứng dụng
ENTRYPOINT ["java", "-jar", "user-service-0.0.1.jar"]
