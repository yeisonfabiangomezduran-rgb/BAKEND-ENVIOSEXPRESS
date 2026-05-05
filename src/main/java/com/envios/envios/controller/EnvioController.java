package com.envios.envios.controller;


import com.envios.envios.model.Envio;
import com.envios.envios.repository.EnvioRepository;
import com.envios.envios.service.EnvioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/envios")
@CrossOrigin(origins = "*") // conecta con React
public class EnvioController {

    @Autowired
    private EnvioService service;

    @GetMapping
    public List<Envio> listar() {

        return service.listar();
    }

    @PostMapping
    public Envio crear(@RequestBody Envio envio) {

        return service.guardar(envio);
    }

    @PutMapping("/{id}")
    public Envio actualizar(@PathVariable Long id, @RequestBody Envio envio){

        return service.actualizar(id, envio);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }

    @GetMapping("/buscar/{id}")
    public Envio buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

}
