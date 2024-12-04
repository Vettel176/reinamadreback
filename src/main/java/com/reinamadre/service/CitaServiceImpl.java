package com.reinamadre.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reinamadre.dto.CitaDto;
import com.reinamadre.entity.Cita;
import com.reinamadre.repository.CitaRepository;

@Service
public class CitaServiceImpl implements CitaService {

    @Autowired
    private CitaRepository citaRepository;

    @Override
    public List<CitaDto> findAll() {
        List<CitaDto> listCitasDto = new ArrayList<>();
        List<Cita> listCitas = citaRepository.findAll();
        listCitas.stream().forEach(p -> listCitasDto.add(new CitaDto(p)));
        return listCitasDto;
    }

    @Override
    public CitaDto findById(Long id) {
        CitaDto citaDto = new CitaDto(citaRepository.findById(id).orElseThrow());
        return citaDto;
    }

    @Override
    public CitaDto save(CitaDto citaDto) {
        CitaDto customerDtoRetry = new CitaDto(citaRepository.save(new Cita(citaDto)));
        return customerDtoRetry;
    }

    @Override
    public String deleteById(Long id) {
        try {
            citaRepository.deleteById(id);
            return "deleted";
        } catch (Exception e) {
           return "Error al eliminar"+e.getMessage();
        }
   
    
    }


}
