package com.reinamadre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reinamadre.dto.CitaDto;
import com.reinamadre.dto.UserDto;
import com.reinamadre.service.CitaService;
import com.reinamadre.service.UserService;

@RestController
public class ClinicaController {

    @Autowired
    UserService clinicaService;

    @Autowired
    CitaService citaService;
   
    @GetMapping("/clinica/users")
        public String getUsers(){
            clinicaService.findAll();
        return "Imprimiendo en el back todos los usuarios";
       }
    
    @PostMapping("/clinica/user")
        public String findUser(@RequestBody UserDto userDto){
            String name = userDto.getName();
            String pass = userDto.getPassword();
            return clinicaService.findAllByNameAndPassword(name,pass);
        }

    //Servicios para las citas ----------

    @GetMapping("/clinica/citas")
        public List<CitaDto> findAll(){
            return citaService.findAll();
        }

    @GetMapping("/clinica/cita/{id}")
        public CitaDto findById(@PathVariable Long id){
             return citaService.findById(id);
        }

    @PostMapping("/clinica/cita")
        public CitaDto save(@RequestBody CitaDto cita){
          return citaService.save(cita);
        }
  
}
