FROM java
ADD target/payment-risk-service-0.0.1-SNAPSHOT.jar //
ENTRYPOINT ["java", "-jar", "/payment-risk-service-0.0.1-SNAPSHOT.jar"]
