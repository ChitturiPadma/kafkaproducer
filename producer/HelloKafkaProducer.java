package com.spring.kafka.demos.kafkaproducer.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

// let spring know that this is a service class
@Service
public class HelloKafkaProducer {

    //create kafkaTemplate instance
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendHello(String name)
    {
        kafkaTemplate.send("thello", "Hello:" + name);

    }

}
