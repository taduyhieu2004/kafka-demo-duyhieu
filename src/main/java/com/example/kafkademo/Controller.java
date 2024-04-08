package com.example.kafkademo;

import com.example.kafkademo.service.Producer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/producers")
@RequiredArgsConstructor
public class Controller {
    private final Producer producer;

    @PostMapping("/send")
    public String send(@RequestParam("message") String message) {
        producer.sendMessage(message);
        return "OK";
    }

}
