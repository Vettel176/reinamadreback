package com.reinamadre.service;
import java.util.List;

import com.reinamadre.dto.CitaDto;


public interface CitaService {
    List<CitaDto> findAll();
    CitaDto findById(Long id);
    CitaDto save(CitaDto citaDto);
    String deleteById (Long id);
}
