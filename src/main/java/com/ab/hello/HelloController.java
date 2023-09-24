package com.ab.hello;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    @GetMapping
    public ResponseEntity<String> getGreeting() {
        String message = "Hello Alex! This is version 2";
        return ResponseEntity.ok()
                .body(message);
    }
}
