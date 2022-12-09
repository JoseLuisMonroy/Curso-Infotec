package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ordenamiento{

    @GetMapping("/ordenamiento")
    public List<Integer> ordenar() {
        List<Integer> lista = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            lista.add((int) (Math.random() * 1000) + 1);
        }
        Collections.sort(lista);
        System.out.println("Lista ordenada: " + lista);
        Collections.reverse(lista);
        System.out.println("Lista invertida: " + lista);
        return lista;

    }

    @GetMapping("/combinacion")
    public List<String> combinacion() {
        List<String> listaUno = new ArrayList<String>();
        listaUno.add("A");
        listaUno.add("B");
        listaUno.add("C");
        listaUno.add("D");
        listaUno.add("E");
        List<String> listaDos = new ArrayList<String>();
        listaDos.add("B");
        listaDos.add("D");
        listaDos.add("F");
        listaDos.add("G");
        listaDos.add("H");
        List<String> listaMezcla = new ArrayList<String>();
        listaMezcla.addAll(listaUno);
        listaMezcla.addAll(listaDos);
        System.out.println("Lista mezclada: " + listaMezcla);
        return listaMezcla;
    }
}