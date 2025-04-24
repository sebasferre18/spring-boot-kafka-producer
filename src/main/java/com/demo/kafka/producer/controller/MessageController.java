package com.demo.kafka.producer.controller;

import com.demo.kafka.producer.controller.impl.MessageControllerImpl;
import com.demo.kafka.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/message")
public class MessageController {

    @Autowired
    private MessageControllerImpl messageController;

    @PostMapping()
    public ResponseEntity<?> sendMessage(
            @RequestParam String topicName,
            @RequestParam String msg
    ){
        return messageController.sendMessage(topicName, msg);
    }

    @PostMapping("/future")
    public ResponseEntity<?> sendMessageFuture(
            @RequestParam String topicName,
            @RequestParam String msg
    ){
        return messageController.sendMessageFuture(topicName, msg);
    }

    @PostMapping("/greeting")
    public ResponseEntity<?> sendMessageModel(
            @RequestParam String topicName,
            @RequestBody Greeting greeting
    ){
        return messageController.sendMessageModel(topicName, greeting);
    }
}
