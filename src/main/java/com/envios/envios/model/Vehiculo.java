package com.envios.envios.model;

import jakarta.persistence.*;

@Entity
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String placa;
    private String tipo;
    private String capacidad;
    private String estado;

    // getters y setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getCapacidad() { return capacidad; }
    public void setCapacidad(String capacidad) { this.capacidad = capacidad; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}