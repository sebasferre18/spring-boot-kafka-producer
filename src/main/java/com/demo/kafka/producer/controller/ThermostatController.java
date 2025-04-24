package com.demo.kafka.producer.controller;

import com.demo.kafka.producer.controller.impl.ThermostatControllerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/thermostat")
public class ThermostatController {

    @Autowired
    private ThermostatControllerImpl thermostatController;

    @PostMapping()
    public ResponseEntity<?> measureCelsiusAndPublish(){
        return thermostatController.measureCelsiusAndPublish();
    }

}
