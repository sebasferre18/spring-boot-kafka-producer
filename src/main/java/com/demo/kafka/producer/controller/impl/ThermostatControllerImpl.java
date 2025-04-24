package com.demo.kafka.producer.controller.impl;

import com.demo.kafka.producer.service.ThermostatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ThermostatControllerImpl {

    @Autowired
    private ThermostatService thermostatService;

    public ResponseEntity<?> measureCelsiusAndPublish() {
        try {
            thermostatService.measureCelsiusAndPublish(10);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

}
