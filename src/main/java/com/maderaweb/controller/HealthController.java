package com.maderaweb.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HealthController {

    @GetMapping("health")
    public Map<String, String> checkHealth() {
        return Map.of(
                "status", "OK",
                "message", "Api corriendo");
    }
}
