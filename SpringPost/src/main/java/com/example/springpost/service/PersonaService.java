package com.example.springpost.service;

import com.example.springpost.entity.Persona;
import com.example.springpost.repository.PersonaRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    private PersonaRepository personaRepository;
    private Integer id = 1;

    public PersonaService(PersonaRepository personaRepository){
        this.personaRepository = personaRepository;
    }
    public Persona obtenerPorId(Integer id){
        return this.personaRepository.findById(id).get();
    }
    public Integer guardarPersona(String nombre, String apellidos){
        Persona persona = new Persona();
        persona.setId(this.getId());
        persona.setNombre(nombre);
        persona.setApellidos(apellidos);
        persona = personaRepository.save(persona);
        this.incrementarID();
        return persona.getId();
    }

    public Integer getId() {
        return id;
    }

    public void incrementarID(){
        this.id = id += 1;
    }
}
