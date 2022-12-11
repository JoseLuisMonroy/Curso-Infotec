package com.example.springpost.controller;

import com.example.springpost.dto.DataDTODireccion;
import com.example.springpost.service.DireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DireccionController {
    @Autowired
    public DireccionService direccionService;
    @PostMapping("/guardarDireccion")
    public ResponseEntity<Integer> guardarDireccion(@RequestParam("calle")String calle, @RequestParam("numExt")String numExt, @RequestParam("numInt")String numInt, @RequestParam("cp")Integer cp, @RequestParam("colonia") String colonia, @RequestParam("ciudad")Integer ciudad, @RequestParam("estado")Integer estado)   {
        Integer id = 0;
        try{
            id = this.direccionService.guardarDireccion(calle, numExt, numInt, cp, colonia, ciudad, estado);
        }catch (Exception e){
            System.out.println("Error");
        }
        if(id == 0){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return  new ResponseEntity<Integer>(id, HttpStatus.OK);
    }
    @GetMapping("/obtenerDireccion/{id}")
    public ResponseEntity<DataDTODireccion> obtenerDireccion (@PathVariable("id") Integer id){
        return new ResponseEntity<>(new DataDTODireccion(this.direccionService.obtenerPorId(id)), HttpStatus.OK);
    }
    @DeleteMapping("/eliminarDireccion/{id}")
    public ResponseEntity<Void> eliminarDireccion(@PathVariable("id") Integer id){
        this.direccionService.eliminarDireccion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/actualizarDireccion")
    public ResponseEntity<Void> actualizarDireccion(@RequestParam("id")Integer id, @RequestParam("calle")String calle, @RequestParam("numExt")String numExt, @RequestParam("numInt")String numInt, @RequestParam("cp")Integer cp, @RequestParam("colonia") String colonia, @RequestParam("ciudad")Integer ciudad, @RequestParam("estado")Integer estado){
        this.direccionService.actualizarDireccion(id, calle, numExt, numInt, cp, colonia, ciudad, estado);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
