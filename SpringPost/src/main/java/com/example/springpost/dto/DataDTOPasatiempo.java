package com.example.springpost.dto;


import com.example.springpost.entity.Pasatiempo;

public class DataDTOPasatiempo {
    public Integer id;
    public String nombre;
    public Integer pasatiempo;
    public Integer id_persona;
    public DataDTOPasatiempo(){
    }
    public DataDTOPasatiempo(Pasatiempo pasatiempo){
        this.id = pasatiempo.getId();
        this.id_persona = pasatiempo.getId_persona();
        this.nombre = pasatiempo.getNombre();
        this.pasatiempo = pasatiempo.getPasatiempo();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPasatiempo() {
        return pasatiempo;
    }

    public void setPasatiempo(Integer pasatiempo) {
        this.pasatiempo = pasatiempo;
    }

    public Integer getId_persona() {
        return id_persona;
    }

    public void setId_persona(Integer id_persona) {
        this.id_persona = id_persona;
    }
}
