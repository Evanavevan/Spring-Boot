package com.evan.spring.boot.amqp.consumer.service;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.stereotype.Component;

@Component
public class HelloRabbitConsumer {
    @RabbitHandler
    public void process(String message) {
        System.out.println("Consumer: " + message);
    }
}
