package com.example.springpost.service;

import com.example.springpost.entity.Persona;
import com.example.springpost.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    private PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository){
        this.personaRepository = personaRepository;
    }
    public Persona obtenerPorId(Integer id){
        return this.personaRepository.findById(id).get;
    }
    public Integer guardarPersona(String nombre, String apellidos){
        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setApellidos(apellidos);
        persona = personaRepository.save(persona);
        return persona.getId();
    }
}
