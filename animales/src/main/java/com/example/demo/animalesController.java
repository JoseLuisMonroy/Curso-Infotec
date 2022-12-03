package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime; 

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class animalesController {
    @GetMapping("/animales")
    public String getAnimales() {
        List<animal> animales = new ArrayList<animal>();
        for (int i = 0; i < 10000; i++) {
            int tipo = (int) (Math.random() * 5);
            String tipoAnimal = "";
            switch (tipo) {
                case 0:
                    tipoAnimal = "León";
                    break;
                case 1:
                    tipoAnimal = "Gato";
                    break;
                case 2:
                    tipoAnimal = "Perro";
                    break;
                case 3:
                    tipoAnimal = "Venado";
                    break;
                case 4:
                    tipoAnimal = "Elefante";
                    break;
            }
            animales.add(new animal(i, tipoAnimal));
        }
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).idAnimal % 1000 == 0) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                LocalDateTime now = LocalDateTime.now();
                System.out.println(animales.get(i).idAnimal + " " + animales.get(i).tipo);
                System.out.println(now.getHour() + ":" + now.getMinute() + ":" + now.getSecond());
            }
        }
        //mostrar un resumen de cuántos cuadrúpedos hay de cada tipo
        int leones = 0;
        int venados = 0;
        int elefantes = 0;
        int perros = 0;
        int gatos = 0;
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).tipo == "León") {
                leones++;
            } else if (animales.get(i).tipo == "Venado") {
                venados++;
            } else if (animales.get(i).tipo == "Elefante") {
                elefantes++;
            } else if (animales.get(i).tipo == "Perro") {
                perros++;
            } else if (animales.get(i).tipo == "Gato") {
                gatos++;
            }
        }
        String resumen = "Leones: " + leones + " Venados: " + venados + " Elefantes: " + elefantes + " Perros: " + perros + " Gatos: " + gatos;
        return resumen;
    }

    @GetMapping("/animales1/")
    public String getAnimales1() {
        ArrayList<animal> animales = new ArrayList<animal>();
        for (int i = 0; i < 10000; i++) {
            int tipo = (int) (Math.random() * 5);
            String tipoAnimal = "";
            switch (tipo) {
                case 0:
                    tipoAnimal = "León";
                    break;
                case 1:
                    tipoAnimal = "Gato";
                    break;
                case 2:
                    tipoAnimal = "Perro";
                    break;
                case 3:
                    tipoAnimal = "Venado";
                    break;
                case 4:
                    tipoAnimal = "Elefante";
                    break;
            }
            animales.add(new animal(i, tipoAnimal));
        }
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).idAnimal % 1000 == 0) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(animales.get(i).idAnimal + " " + animales.get(i).tipo);
            }
        }
        int leones = 0;
        int venados = 0;
        int elefantes = 0;
        int perros = 0;
        int gatos = 0;
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).tipo == "León") {
                leones++;
            } else if (animales.get(i).tipo == "Venado") {
                venados++;
            } else if (animales.get(i).tipo == "Elefante") {
                elefantes++;
            } else if (animales.get(i).tipo == "Perro") {
                perros++;
            } else if (animales.get(i).tipo == "Gato") {
                gatos++;
            }
        }
        String resumen = "Leones: " + leones + " Venados: " + venados + " Elefantes: " + elefantes + " Perros: " + perros + " Gatos: " + gatos;
        return resumen;
    }

}