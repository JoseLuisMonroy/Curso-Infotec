package com.example.springpost.service;

import com.example.springpost.entity.Pasatiempo;
import com.example.springpost.repository.PasatiempoRepository;
import org.springframework.stereotype.Service;

@Service
public class PasatiempoService {
    private PasatiempoRepository pasatiempoRepository;
    private Integer id = 1;

    public PasatiempoService(PasatiempoRepository pasatiempoRepository){
        this.pasatiempoRepository = pasatiempoRepository;
    }
    public Pasatiempo obtenerPorID(Integer id){
        return this.pasatiempoRepository.findById(id).get();
    }
    public Integer guardarPasatiempo(String nombre, Integer pasatiempos, Integer id_persona){
        Pasatiempo pasatiempo = new Pasatiempo();
        pasatiempo.setId(this.getId());
        pasatiempo.setNombre(nombre);
        pasatiempo.setPasatiempo(pasatiempos);
        pasatiempo.setId_persona(id_persona);
        pasatiempo = pasatiempoRepository.save(pasatiempo);
        this.incrementarID();
        return  pasatiempo.getId();
    }

    public Integer getId() {
        return id;
    }
    public void incrementarID(){
        this.id = id += 1;

    }
}
