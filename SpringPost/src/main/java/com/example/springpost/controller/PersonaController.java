package com.example.springpost.controller;

import com.example.springpost.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @Autowired
    public PersonaService personaService;
    @PutMapping("/guardar")
    public ResponseEntity<Integer> guardarPersona(@RequestParam("nombre")String nombre,@RequestParam("nombre")String apellidos) {
        Integer id = 0;
        try {
            id = this.personaService.guardarPersona(nombre, apellidos);
        } catch (Exception e) {
            System.out.println("Error");
        }
        if (id == 0) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<Integer>(id, HttpStatus.OK);
    }
}
