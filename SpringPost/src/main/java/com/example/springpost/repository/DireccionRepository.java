package com.example.springpost.repository;

import com.example.springpost.entity.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DireccionRepository extends JpaRepository <Direccion, Integer> {
}
