package com.example.springpost.controller;

import com.example.springpost.dto.DataDTOPersona;
import com.example.springpost.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonaController {
    @Autowired
    public PersonaService personaService;
    @PutMapping("/guardar")
    public ResponseEntity<Integer> guardarPersona(@RequestParam("nombre")String nombre,@RequestParam("apellidos")String apellidos, @RequestParam("direccion_id")Integer direccion_id) {
        Integer id = 0;
        try {
            id = this.personaService.guardarPersona(nombre, apellidos, direccion_id);
        } catch (Exception e) {
            System.out.println("Error");
        }
        if (id == 0) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
    @GetMapping("/obtenerPersona/{id}")
    public ResponseEntity<DataDTOPersona> obtenerPersona (@PathVariable("id") Integer id){
        return new ResponseEntity<>(new DataDTOPersona(this.personaService.obtenerPorId(id)), HttpStatus.OK);
    }
}
