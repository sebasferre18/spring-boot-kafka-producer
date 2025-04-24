package com.demo.kafka.producer.controller.impl;

import com.demo.kafka.producer.service.MultiTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class MultiTypeControllerImpl {

    @Autowired
    private MultiTypeService multiTypeService;

    public ResponseEntity<?> sendMessage(String topicName) {
        try {
            multiTypeService.sendMessage(topicName);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

}
