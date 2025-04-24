package com.demo.kafka.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ThermostatService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void measureCelsiusAndPublish(int numMeasurements) {
        new Random().doubles(25, 35)
                .limit(numMeasurements)
                .forEach(tmp -> {
                    kafkaTemplate.send("partition", String.valueOf(tmp));
                });
    }
}
