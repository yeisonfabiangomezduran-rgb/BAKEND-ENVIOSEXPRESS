package com.envios.envios.controller;


import org.springframework.web.bind.annotation.*;
        import java.util.List;

import com.envios.envios.model.Conductor;
import com.envios.envios.repository.ConductorRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/conductores")
public class ConductorController {

    private final ConductorRepository repo;

    public ConductorController(ConductorRepository repo) {
        this.repo = repo;
    }

    // 📋 LISTAR
    @GetMapping
    public List<Conductor> listar() {
        return repo.findAll();
    }

    // 💾 GUARDAR
    @PostMapping
    public Conductor guardar(@RequestBody Conductor conductor) {
        return repo.save(conductor);
    }

    // ✏️ ACTUALIZAR
    @PutMapping("/{id}")
    public Conductor actualizar(@PathVariable Long id, @RequestBody Conductor conductor) {
        conductor.setId(id);
        return repo.save(conductor);
    }

    // ❌ ELIMINAR
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
