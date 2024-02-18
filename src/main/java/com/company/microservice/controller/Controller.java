package com.company.microservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Hello from Railway + Spring!");
    }

    @GetMapping("/example-json")
    public ResponseEntity<Object> getExampleJson() {
        // Aquí defines un objeto JSON de ejemplo
        // Esto es solo un ejemplo, puedes personalizar según tus necesidades
        String json = "{ \"key\": \"value\", \"number\": 123, \"boolean\": true }";
        return ResponseEntity.ok(json);
    }

    @GetMapping("/another-json")
    public ResponseEntity<Object> getAnotherJson() {
        // Aquí defines otro objeto JSON de ejemplo
        // Esto es solo un ejemplo, puedes personalizar según tus necesidades
        String json = "{ \"name\": \"John\", \"age\": 30, \"city\": \"New York\" }";
        return ResponseEntity.ok(json);
    }
}
