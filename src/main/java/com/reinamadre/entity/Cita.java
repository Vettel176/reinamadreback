package com.reinamadre.entity;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.reinamadre.dto.CitaDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Cita {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cita;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime   fecha;
    private String paciente;
	private Long   id_tipo;
    private String nombre_medico;
    private String numero_cita;
    private String other;

    public Cita(){
        
    }

    public Cita(CitaDto cita){
        this.id_cita = cita.getId_cita();
        this.fecha = cita.getFecha();
        this.paciente = cita.getPaciente();
        this.id_tipo = cita.getId_tipo();
        this.nombre_medico = cita.getNombre_medico();
        this.numero_cita = cita.getNumero_cita();
        this.other = cita.getOther();
    }
    
}
