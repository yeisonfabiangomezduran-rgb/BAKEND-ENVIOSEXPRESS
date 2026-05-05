package com.envios.envios.controller;

import org.springframework.web.bind.annotation.*;
        import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody Map<String, String> data) {

        String usuario = data.get("usuario");
        String password = data.get("password");

        Map<String, Object> response = new HashMap<>();

        // 🔐 usuario admin básico
        if ("admin".equals(usuario) && "1234".equals(password)) {
            response.put("success", true);
            response.put("token", "admin-token");
        } else {
            response.put("success", false);
        }

        return response;
    }
}