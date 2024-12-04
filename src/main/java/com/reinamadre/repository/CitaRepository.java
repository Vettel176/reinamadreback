package com.reinamadre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.reinamadre.entity.Cita;

public interface CitaRepository extends JpaRepository<Cita, Long> {

}