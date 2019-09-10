FROM gradle
WORKDIR /app
COPY src/ src/
COPY build.gradle .
COPY settings.gradle .
# https://www.baeldung.com/gradle-build-settings-properties
#COPY gradle.properties .
#RUN gradle clean build --stacktrace

#FROM openjdk:8u212-jre
#COPY --from=build /app/build/libs/*.jar /app/