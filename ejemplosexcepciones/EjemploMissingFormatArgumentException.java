/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

/**
 *
 * @author DANNA
 */
public class EjemploMissingFormatArgumentException {

    public static void main(String[] args) {
        try {
            // Intentar formatear una cadena con un argumento faltante
            String.format("El número es: %d", 42); // Se espera un argumento adicional
        } catch (java.util.MissingFormatArgumentException e) {
            System.out.println("Se lanzó una MissingFormatArgumentException: " + e.getMessage());
        }
    }
}
/**
 *
 * Es una excepción que se lanza cuando no se proporciona un argumento requerido
 * para el formato en una cadena de formato. Esto ocurre principalmente al usar
 * el método String.format() o la clase Formatter en Java.
 *
 *
 * En este ejemplo, estamos intentando formatear una cadena utilizando %d, que
 * espera un argumento entero adicional. Sin embargo, no proporcionamos ese
 * argumento adicional, lo que resulta en una MissingFormatArgumentException.
 * Esta excepción se captura en el bloque catch y se muestra un mensaje
 * indicando que se lanzó una MissingFormatArgumentException.
 */
