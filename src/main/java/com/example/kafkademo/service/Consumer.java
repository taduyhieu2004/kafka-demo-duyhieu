package com.example.kafkademo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Consumer {

    @KafkaListener(topics = "duyhieu2", groupId = "group_id1")
    public void consumeMessage(String message){

        System.out.println(message);
    }
}
