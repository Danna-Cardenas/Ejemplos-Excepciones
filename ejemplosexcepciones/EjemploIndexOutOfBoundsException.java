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
public class EjemploIndexOutOfBoundsException {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        // Agregamos algunos elementos a la lista
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        try {
            // Intentamos acceder a un índice fuera de los límites de la lista
            int valor = numeros.get(10); // Esto lanzará IndexOutOfBoundsException
            System.out.println("Valor obtenido: " + valor);
        } catch (IndexOutOfBoundsException e) {
            // Manejamos la excepción si ocurre una IndexOutOfBoundsException
            System.err.println("Error de índice: " + e.getMessage());
        }
    }

}
/**
 *
 * Creamos una lista ArrayList llamada numeros y agregamos tres elementos a ella.
 * Luego, intentamos acceder al elemento en el índice 10 utilizando el método
 * get(). Sin embargo, como la lista solo tiene tres elementos (índices válidos
 * de 0 a 2), intentar acceder al índice 10 resultará en una
 * IndexOutOfBoundsException
 */
