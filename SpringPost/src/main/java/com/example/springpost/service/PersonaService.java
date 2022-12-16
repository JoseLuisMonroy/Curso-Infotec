package com.example.springpost.service;

import com.example.springpost.entity.Persona;
import com.example.springpost.repository.PersonaRepository;
import jakarta.persistence.ManyToMany;
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
    public Integer guardarPersona(String nombre, String apellidos, Integer direccion_id){
        Persona persona = new Persona();
        persona.setId(this.getId());
        persona.setNombre(nombre);
        persona.setApellidos(apellidos);
        persona.setDireccion_id(direccion_id);
        persona = personaRepository.save(persona);
        this.incrementarID();
        return persona.getId();
    }

    public void eliminarPersona(Integer id){
        this.personaRepository.deleteById(id);
    }
    public void actualizarPersona(Integer id, String nombre, String apellidos, Integer direccion_id){
        Persona persona = this.obtenerPorId(id);
        persona.setNombre(nombre);
        persona.setApellidos(apellidos);
        persona.setDireccion_id(direccion_id);
        personaRepository.save(persona);
    }

    @ManyToMany

    public Integer getId() {
        return id;
    }

    public void incrementarID(){
        this.id = id += 1;
    }
}
