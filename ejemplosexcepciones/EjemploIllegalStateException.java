/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DANNA
 */
public class EjemploIllegalStateException {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        // Agregamos algunos elementos a la lista
        lista.add("Elemento 12");
        lista.add("Elemento 15");
        lista.add("Elemento 18");

        // Intentamos realizar una operación en una lista que ya está cerrada
        lista.clear();

        // Intentamos agregar un elemento después de que la lista ha sido limpiada
        lista.add("Nuevo elemento"); // Esto lanzará IllegalStateException
    }

}
/**
 *
 * En este ejemplo, creamos una lista ArrayList y agregamos algunos elementos a
 * ella. Luego, limpiamos la lista utilizando el método clear(), que elimina
 * todos los elementos de la lista. Después de eso, intentamos agregar un nuevo
 * elemento a la lista utilizando el método add(). Sin embargo, la lista ya ha
 * sido limpiada y no se puede agregar ningún elemento adicional, lo que
 * provocará una IllegalStateException.
 */
