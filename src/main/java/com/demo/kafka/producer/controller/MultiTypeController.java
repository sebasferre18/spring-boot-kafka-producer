package com.demo.kafka.producer.controller;

import com.demo.kafka.producer.controller.impl.MultiTypeControllerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api/multitype")
public class MultiTypeController {

    @Autowired
    private MultiTypeControllerImpl multiTypeController;

    @PostMapping()
    public ResponseEntity<?> sendMessage(
            @RequestParam String topicName
    ){
        return multiTypeController.sendMessage(topicName);
    }

}
