package com.envios.envios.service;

import com.envios.envios.model.Envio;
import com.envios.envios.repository.EnvioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnvioService {

    @Autowired
    private EnvioRepository repository;

    public List<Envio> listar() {
        return repository.findAll();
    }

    public Envio guardar(Envio envio) {
        return repository.save(envio);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }

    public Envio actualizar(Long id, Envio envio){
        Envio actual = repository.findById(id).get();
        if (actual == null){
            return null;
        }
        actual.setCliente(envio.getCliente());
        actual.setOrigen(envio.getOrigen());
        actual.setDestino(envio.getDestino());
        actual.setDescripcion(envio.getDescripcion());
        actual.setEstado(envio.getEstado());
        actual.setFecha(envio.getFecha());

        return repository.save(actual);
    }

    public Envio buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Envio no encontrado"));
    }


}