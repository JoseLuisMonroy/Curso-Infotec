package com.example.springpost.repository;

import com.example.springpost.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository <Persona, Integer> {

}