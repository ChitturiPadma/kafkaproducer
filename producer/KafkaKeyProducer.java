package com.spring.kafka.demos.kafkaproducer.producer;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaKeyProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String key, String data)
    {
        System.out.println("Key:" + key + ":Data:" + data);
        kafkaTemplate.send("tmulti_partitions", key, data);
    }

}
