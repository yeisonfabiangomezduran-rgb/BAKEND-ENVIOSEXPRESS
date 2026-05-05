package com.envios.envios.model;


import jakarta.persistence.*;

@Entity
public class Conductor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String telefono;
    private String licencia;
    private String estado;

    // getters y setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getLicencia() { return licencia; }
    public void setLicencia(String licencia) { this.licencia = licencia; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}