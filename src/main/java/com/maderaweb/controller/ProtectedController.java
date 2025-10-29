package com.maderaweb.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/protected")
public class ProtectedController {

    @GetMapping
    public Map<String, String> getProtectedData() {
        return Map.of(
                "message", "Acceso concedido - Estás autenticado",
                "status", "OK!!");
    }
}
