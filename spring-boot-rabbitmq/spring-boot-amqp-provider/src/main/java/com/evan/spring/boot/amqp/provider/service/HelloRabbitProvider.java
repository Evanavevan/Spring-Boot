package com.evan.spring.boot.amqp.provider.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * ζδΎθ
 */
@Component
public class HelloRabbitProvider {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String context = "hello" + new Date();
        System.out.println("Provider: " + context);
        amqpTemplate.convertAndSend("helloRabbit", context);
    }

}
