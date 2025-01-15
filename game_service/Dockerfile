FROM openjdk:17-jdk-alpine

# Đặt thư mục làm việc
WORKDIR /app

# Copy file .jar vào container
ARG JAR_FILE=target/game_service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} game-service-0.0.1.jar

COPY .env .env

EXPOSE 8094

# Chạy ứng dụng
ENTRYPOINT ["java", "-jar", "game-service-0.0.1.jar"]
