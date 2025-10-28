package com.maderaweb.maderaweb_backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;

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
