FROM openjdk:8
ADD target/advert-poq-0.0.1-SNAPSHOT.jar /app/advert-poq.jar
EXPOSE 8099
CMD ["java", "-Xmx512m", "-jar", "/app/advert-poq.jar"]
