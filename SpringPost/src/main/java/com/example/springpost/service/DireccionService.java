package com.example.springpost.service;

import com.example.springpost.entity.Direccion;
import com.example.springpost.repository.DireccionRepository;
import org.springframework.stereotype.Service;

@Service
public class DireccionService {
    private DireccionRepository direccionRepository;
    private  Integer id = 1;

    public  DireccionService(DireccionRepository direccionRepository){
        this.direccionRepository = direccionRepository;
    }
    public Direccion obtenerPorId(Integer id){
        return  this.direccionRepository.findById(id).get();
    }
    public Integer guardarDireccion(String calle, String numExt, String numInt, Integer cp, String colonia, Integer ciudad, Integer estado){
        Direccion direccion = new Direccion();
        direccion.setId(this.getId());
        direccion.setCalle(calle);
        direccion.setNumExt(numExt);
        direccion.setNumInt(numInt);
        direccion.setCp(cp);
        direccion.setColonia(colonia);
        direccion.setCiudad(ciudad);
        direccion.setEstado(estado);
        direccion = direccionRepository.save(direccion);
        this.incrementarID();
        return direccion.getId();
    }

    public Integer getId() {
        return id;
    }
    public void incrementarID(){
        this.id = id += 1;

    }
}
