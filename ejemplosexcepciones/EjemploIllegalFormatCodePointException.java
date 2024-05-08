/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

/**
 *
 * @author DANNA
 */
public class EjemploIllegalFormatCodePointException {

    public static void main(String[] args) {
        try {
            // Intentar formatear una cadena con un punto de código Unicode ilegal
            String.format("Este es un punto de código Unicode ilegal: %c", 0xD800); // Punto de código Unicode ilegal
        } catch (java.util.IllegalFormatCodePointException e) {
            System.out.println("Se lanzó una IllegalFormatCodePointException: " + e.getMessage());
        }
    }

}
/**
 *
 * Es una excepción que se lanza cuando se encuentra un punto de código Unicode
 * ilegal en una cadena de formato, especialmente cuando se está utilizando el
 * método String.format() o la clase Formatter para formatear cadenas en Java.
 *
 * En este ejemplo, estamos intentando formatear una cadena utilizando %c para
 * un punto de código Unicode ilegal (0xD800). Este valor es ilegal porque es un
 * punto de código de alta sucesión sin pareja, lo que lo convierte en un punto
 * de código ilegal en el estándar Unicode. Esto provocará una
 * IllegalFormatCodePointException, que capturamos en el bloque catch y
 * mostramos un mensaje indicando que se lanzó una
 * IllegalFormatCodePointException.
 */
