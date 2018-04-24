package com.techskills.springkafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {
    //.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic javainuse-topic --from-beginning
    String kafka_topic = "javainuse-topic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(String message) {
        kafkaTemplate.send(kafka_topic, message);
    }
}
