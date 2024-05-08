/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author DANNA
 */
public class EjemploUnsupportedOperationException {

    public static void main(String[] args) {
        // Creamos una lista no modificable
        List<String> lista = Collections.singletonList("elemento");

        // Intentamos agregar un elemento a la lista
        try {
            lista.add("nuevo elemento"); // Esto lanzará UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            // Manejamos la excepción si ocurre una UnsupportedOperationException
            System.err.println("Operación no soportada: " + e.getMessage());
        }
    }

}
/**
 *
 * Creamos una lista no modificable utilizando Collections.singletonList().
 * Luego, intentamos agregar un nuevo elemento a la lista utilizando el método
 * add(). Sin embargo, la lista devuelta por Collections.singletonList() es
 * inmutable, por lo que intentar modificarla lanzará una
 * UnsupportedOperationException.
 */
