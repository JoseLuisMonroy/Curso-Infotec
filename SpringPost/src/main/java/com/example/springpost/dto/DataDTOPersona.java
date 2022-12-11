package com.example.springpost.dto;

import com.example.springpost.entity.Persona;

public class DataDTOPersona {
    public String nombre;
    public String apellidos;
    public Integer id;
    public Integer direccion_id;

    public DataDTOPersona(){

    }
    public DataDTOPersona(Persona persona){
        this.id = persona.getId();
        this.nombre = persona.getNombre();
        this.apellidos = persona.getApellidos();
        this.direccion_id = persona.getDireccion_id();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDireccion_id() {
        return direccion_id;
    }

    public void setDireccion_id(Integer direccion_id) {
        this.direccion_id = direccion_id;
    }
}
