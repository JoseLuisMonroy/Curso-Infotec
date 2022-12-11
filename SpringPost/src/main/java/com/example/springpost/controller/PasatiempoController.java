package com.example.springpost.controller;

import com.example.springpost.dto.DataDTOPasatiempo;
import com.example.springpost.dto.DataDTOPersona;
import com.example.springpost.service.PasatiempoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PasatiempoController {
    @Autowired
    public PasatiempoService pasatiempoService;

    @PutMapping("/guardarPasatiempo")
    public ResponseEntity<Integer> guardarPasatiempo(@RequestParam("id_Persona")Integer id_persona,@RequestParam("nombre")String nombre, @RequestParam("pasatiempo")Integer pasatiempo){
        Integer id = 0;
        try {
            id = this.pasatiempoService.guardarPasatiempo(nombre, pasatiempo, id_persona);
        }catch (Exception e){
            System.out.println("Error");
        }
        if (id == 0) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<Integer>(id, HttpStatus.OK);
    }
    @GetMapping("/obtenerPasatiempo/{id}")
    public ResponseEntity<DataDTOPasatiempo> obtenerPasatiempo(@PathVariable("id")Integer id){
        return new ResponseEntity<>(new DataDTOPasatiempo(this.pasatiempoService.obtenerPorID(id)), HttpStatus.OK);
    }
}
