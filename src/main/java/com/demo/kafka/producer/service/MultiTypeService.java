package com.demo.kafka.producer.service;

import com.demo.kafka.model.Farewell;
import com.demo.kafka.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MultiTypeService {

    @Autowired
    private KafkaTemplate<String, Object> multiTypeKafkaTemplate;

    public void sendMessage(String multiTypeTopicName) {
        multiTypeKafkaTemplate.send(multiTypeTopicName, new Greeting("Greetings", "World!"));
        multiTypeKafkaTemplate.send(multiTypeTopicName, new Farewell("Farewell", 25));
        multiTypeKafkaTemplate.send(multiTypeTopicName, "Simple string message");
    }

}
