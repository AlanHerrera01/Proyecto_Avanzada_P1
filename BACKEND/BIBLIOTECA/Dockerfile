# Etapa 1: Build
FROM gradle:8.4-jdk17 as build
WORKDIR /app
COPY . .
WORKDIR /app
RUN chmod +x ./gradlew
RUN ./gradlew clean bootJar --no-daemon

# Etapa 2: Run
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
ENV SPRING_PROFILES_ACTIVE=render
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]