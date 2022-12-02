package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class diccionario {
    Map<String, String> diccionario = new HashMap<String, String>();
    Map<String, String> diccionario2 = new HashMap<String, String>();

    @GetMapping("/traducir/{palabra}")
    public String traducir(@PathVariable String palabra) {
        palabra = palabra.toLowerCase();
        diccionario.put("hola", "hello");
        diccionario.put("adios", "goodbye");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("casa", "house");
        diccionario.put("computadora", "computer");
        diccionario2.put("hola", "bonjour");
        diccionario2.put("adios", "au revoir");
        diccionario2.put("perro", "chien");
        diccionario2.put("gato", "chat");
        diccionario2.put("casa", "maison");
        diccionario2.put("computadora", "ordinateur");
        if (diccionario.containsKey(palabra)) {
        	String resp =  "La traduccion de " + palabra + " al ingles es " + diccionario.get(palabra) + " y al frances es "
                    + diccionario2.get(palabra);
        	System.out.println(resp);
        	return resp;
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la traduccion al ingles");
            String ingles = sc.nextLine();
            System.out.println("Ingrese la traduccion al frances");
            String frances = sc.nextLine();
            sc.close();
            return this.agregar(palabra, ingles, frances);
        }
    }

    @GetMapping("/agregar/{palabra}/{traduccionIng}/{traduccionFr}")
    public String agregar(@PathVariable String palabra, @PathVariable String traduccionIng, @PathVariable String traduccionFr) {
        diccionario.put(palabra, traduccionIng);
        diccionario2.put(palabra, traduccionFr);
        return "La palabra " + palabra + " fue agregada al diccionario";
    }
}