/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author DANNA
 */
public class EjemploNoSuchElementException {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(130);
        numeros.add(230);
        numeros.add(330);

        // Creamos un Iterator para recorrer la lista
        Iterator<Integer> iterador = numeros.iterator();

        try {
            // Iteramos sobre la lista utilizando el Iterator
            while (iterador.hasNext()) {
                Integer numero = iterador.next();
                System.out.println(numero);
            }

            // Intentamos acceder a un elemento adicional que no existe
            Integer siguienteNumero = iterador.next(); // Esto lanzará NoSuchElementException
        } catch (NoSuchElementException e) {
            // Manejamos la excepción si ocurre una NoSuchElementException
            System.err.println("No hay más elementos en la lista.");
        }
    }

}
/**
 *
 * NoSuchElementException es una excepción que se lanza en Java cuando se
 * intenta acceder a un elemento en una estructura de datos como una colección,
 * pero el elemento no existe. Esta excepción se utiliza comúnmente en el
 * contexto de las clases Iterator y Enumeration cuando se invoca el método
 * next() y no hay más elementos disponibles. creamos un Iterator para recorrer
 * una lista de números. Después de haber recorrido todos los elementos de la
 * lista, intentamos llamar al método next() del Iterator para obtener un
 * siguiente elemento, pero como no hay más elementos, se lanza una
 * NoSuchElementException.
 */
