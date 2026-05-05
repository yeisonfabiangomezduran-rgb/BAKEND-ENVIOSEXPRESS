package com.envios.envios.model;


import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "envios")
public class Envio {


   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String cliente;
    private String origen;
    private String destino;
    private String descripcion;
    private String estado = "Pendiente";
    private String fecha;


}
