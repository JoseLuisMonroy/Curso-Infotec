package com.example.springpost.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pasatiempo", schema = "public")
public class Pasatiempo {
    @Id
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "pasatiempo")
    private Integer pasatiempo;
    @Column(name = "id_persona")
    private Integer id_persona;

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
