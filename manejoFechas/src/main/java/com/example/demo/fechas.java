package com.example.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class fechas {

    @GetMapping("/fecha")
    public String fecha() {
        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaFormato = fecha.format(formato);
        System.out.println("Fecha actual: " + fechaFormato);
        return fechaFormato;
    }

    @GetMapping("/fecha2")
    public String fecha2() {
        LocalDateTime fecha = LocalDateTime.now();
        LocalDateTime fecha2 = LocalDateTime.now();
        fecha2 = fecha2.plusHours(5);
        Duration duracion = Duration.between(fecha, fecha2);
        System.out.println("Duracion en minutos: " + duracion.toMinutes());
        System.out.println("Duracion en horas: " + duracion.toHours());
        return " Duracion en horas: " + duracion.toHours();
    }


    @GetMapping("/formato")
    public String formato() {
        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyy/MM/dd HH:mm:ss");
        String fechaFormato = fecha.format(formato);
        System.out.println("Fecha actual: " + fechaFormato);
        return fechaFormato;
    }

    @GetMapping("/formato2")
    public String formato2() {
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyy/MM/dd HH:mm:ss");
        String fechaFormato = formato.format(fecha);
        System.out.println("Fecha actual: " + fechaFormato);
        return fechaFormato;
    }


}