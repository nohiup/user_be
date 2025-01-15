FROM openjdk:17-jdk-alpine

# Đặt thư mục làm việc
WORKDIR /app

# Copy file .jar vào container
ARG JAR_FILE=target/event_service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} event-service-0.0.1.jar

# Copy file .env vào container
COPY .env .env

EXPOSE 8083

# Chạy ứng dụng
ENTRYPOINT ["java", "-jar", "event-service-0.0.1.jar"]
