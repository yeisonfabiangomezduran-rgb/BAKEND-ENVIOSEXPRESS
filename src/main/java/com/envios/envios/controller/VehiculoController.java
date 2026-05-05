package com.envios.envios.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.envios.envios.model.Vehiculo;
import com.envios.envios.repository.VehiculoRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {

    private final VehiculoRepository repo;

    public VehiculoController(VehiculoRepository repo) {
        this.repo = repo;
    }

    // 📋 LISTAR
    @GetMapping
    public List<Vehiculo> listar() {
        return repo.findAll();
    }

    // 💾 GUARDAR
    @PostMapping
    public Vehiculo guardar(@RequestBody Vehiculo vehiculo) {
        return repo.save(vehiculo);
    }

    // ✏️ ACTUALIZAR
    @PutMapping("/{id}")
    public Vehiculo actualizar(@PathVariable Long id, @RequestBody Vehiculo vehiculo) {
        vehiculo.setId(id);
        return repo.save(vehiculo);
    }

    // ❌ ELIMINAR
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
