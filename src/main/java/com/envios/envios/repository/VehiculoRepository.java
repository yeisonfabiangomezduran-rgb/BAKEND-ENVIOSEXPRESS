package com.envios.envios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.envios.envios.model.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
}