package com.demo.kafka.producer.controller.impl;

import com.demo.kafka.model.Greeting;
import com.demo.kafka.producer.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class MessageControllerImpl {

    @Autowired
    private MessageService messageService;

    public ResponseEntity<?> sendMessage(String topicName, String msg) {
        try {
            messageService.sendMessage(topicName, msg);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    public ResponseEntity<?> sendMessageFuture(String topicName, String msg) {
        try {
            messageService.sendMessageFuture(topicName, msg);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    public ResponseEntity<?> sendMessageModel(String topicName, Greeting greeting) {
        try {
            messageService.sendMessageModel(topicName, greeting);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

}
