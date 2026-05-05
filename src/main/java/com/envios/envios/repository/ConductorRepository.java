package com.envios.envios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.envios.envios.model.Conductor;

public interface ConductorRepository extends JpaRepository<Conductor, Long> {
}