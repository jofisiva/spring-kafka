package com.techskills.springkafka.usecase;

import com.techskills.springkafka.service.KafkaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageSenderUseCase implements UseCase {

    @Autowired
    private KafkaSender sender;

    @Override
    public void execute(String message) {

        sender.send(message);
    }
}
