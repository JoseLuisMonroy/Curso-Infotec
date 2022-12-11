package com.example.springpost.repository;

import com.example.springpost.entity.Pasatiempo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasatiempoRepository extends JpaRepository <Pasatiempo, Integer> {
}
