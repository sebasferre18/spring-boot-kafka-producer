# Spring Boot Kafka Producer
A small Spring Boot application for the purpose of testing Kafka's producer functionalities. It's recommended to run this application alongside [Spring Boot Kafka Consumer](https://github.com/sebasferre18/spring-boot-kafka-consumer)

## Requirements

- Java 17
- Apache Kafka
- [Spring Boot Kafka Commons](https://github.com/sebasferre18/spring-boot-kafka-commons)

## Deployment

You need to deploy Apache Kafka first, follow the instructions [here](https://kafka.apache.org/quickstart) in order to setup the Kafka environment.

Deploy the Kafka environment on port `9092`. Then, you can build and run the application with a Java IDE of your preference.

The application will be running at `http://localhost:8081`, now you can send requests to the following endpoints:

- `/api/message` with `topicName` and `msg` as query parameters.
- `/api/message/future` with `topicName` and `msg` as query parameters.
- `/api/message/greeting`  with `topicName` as a query parameter and a object representing the [Greeting](https://github.com/sebasferre18/spring-boot-kafka-commons/blob/main/src/main/java/com/demo/kafka/model/Greeting.java) class as a request body.
- `/api/multitype` with `topicName` as a query parameter.
- `/api/thermostat`

## Parameters

- `topicName`: the name of the Kafka topic.
- `msg`: the message that you want to send on the specified topic.
