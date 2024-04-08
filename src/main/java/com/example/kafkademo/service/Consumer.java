package com.example.kafkademo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "duyhieu", groupId = "group_id")
    public void consumeMessage(String message){
        System.out.println(message);
    }
}
