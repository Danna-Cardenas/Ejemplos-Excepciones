/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author DANNA
 */
public class EjemploConcurrentModificationException {

    public class EjemploConcurrentModification {

        public static void main(String[] args) {
            List<Integer> numeros = new ArrayList<>();
            numeros.add(10);
            numeros.add(20);
            numeros.add(30);

            // Utilizando un iterador para iterar y modificar la lista
            Iterator<Integer> iterador = numeros.iterator();
            while (iterador.hasNext()) {
                Integer numero = iterador.next();
                System.out.println(numero);
                // Modificando la lista a través del iterador
                iterador.remove(); // Esto no causará ConcurrentModificationException
            }
        }
    }
}
/**
 *
 * En este ejemplo, se crea una lista de números (numeros), y se utiliza un
 * iterador (Iterator) para recorrer la lista y eliminar los elementos uno por
 * uno. Este enfoque evita la ConcurrentModificationException porque la
 * eliminación se realiza a través del iterador y no directamente en la lista.
 */
