package com.kafka.controller;

import com.kafka.config.KafkaTopicConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final KafkaTemplate kafkaTemplate;

    public UserController(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/message")
    public String sendMessage(@RequestBody String message) {
        kafkaTemplate.send(KafkaTopicConfig.TOPIC, message);
        return message;
    }

}
