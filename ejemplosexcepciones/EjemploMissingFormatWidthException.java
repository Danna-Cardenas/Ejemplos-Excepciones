/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

/**
 *
 * @author DANNA
 */
public class EjemploMissingFormatWidthException {

    public static void main(String[] args) {
        try {
            // Intentar formatear una cadena con un ancho de campo faltante
            String.format("El número es: %d", 42); // Falta el ancho de campo
        } catch (java.util.MissingFormatWidthException e) {
            System.out.println("Se lanzó una MissingFormatWidthException: " + e.getMessage());
        }
    }

}
/**
 *
 * es una excepción que se lanza cuando falta el ancho de campo requerido en una
 * cadena de formato en Java. Esto ocurre cuando se utiliza el símbolo % en una
 * cadena de formato sin especificar el ancho del campo.
 *
 *
 * En este ejemplo, estamos intentando formatear una cadena utilizando %d, que
 * requiere el ancho de campo adicional. Sin embargo, no proporcionamos el ancho
 * de campo, lo que resulta en una MissingFormatWidthException. Esta excepción
 * se captura en el bloque catch y se muestra un mensaje indicando que se lanzó
 * una MissingFormatWidthException.
 */
