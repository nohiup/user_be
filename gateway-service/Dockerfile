FROM openjdk:17-jdk-alpine

# Đặt thư mục làm việc
WORKDIR /app

# Copy file .jar vào container
ARG JAR_FILE=target/gateway_service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} gateway-service-0.0.1.jar

EXPOSE 8080

# Chạy ứng dụng
ENTRYPOINT ["java", "-jar", "gateway-service-0.0.1.jar"]
