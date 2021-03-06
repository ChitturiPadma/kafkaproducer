package com.spring.kafka.demos.kafkaproducer.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class FixedRateProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private int i = 0;

    @Scheduled(fixedRate = 1000)
    public void sendMessage()
    {
        ++i;
        System.out.println("i value is:" + i);
        kafkaTemplate.send("tfixedrate_2", "Fixed Rate:" + i);
    }
}
