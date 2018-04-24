package com.techskills.springkafka.controller;

import com.techskills.springkafka.service.KafkaSender;
import com.techskills.springkafka.usecase.MessageSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/techskills-kafka/")
public class ApacheKafkaWebController {
    @Autowired
    private MessageSenderUseCase useCase;


    @GetMapping(value = "/producer")
    @ResponseBody
    public String produce(@RequestParam("message") String message) {
        useCase.execute(message);
        return "Message sent to the Kafka Topic java_in_use_topic Successfully";
    }
}
