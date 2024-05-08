/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

/**
 *
 * @author DANNA
 */
public class EjemploNumberFormatException {

    public static void main(String[] args) {
        try {
            // Intentamos convertir una cadena no numérica en un número entero
            String cadenaNoNumerica = "DCE";
            int numero = Integer.parseInt(cadenaNoNumerica); // Esto lanzará NumberFormatException
            System.out.println("Número: " + numero);
        } catch (NumberFormatException e) {
            // Manejamos la excepción si ocurre una NumberFormatException
            System.err.println("Error de formato de número: " + e.getMessage());
        }
    }

}
/**
 *
 * Se convierte la cadena "abc" en un número entero utilizando el método
 * Integer.parseInt(). Sin embargo, como la cadena no representa un número
 * válido, se lanzará una NumberFormatException.
 */
