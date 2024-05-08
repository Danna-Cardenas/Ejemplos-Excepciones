/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.util.Formatter;
import java.util.Locale;

/**
 *
 * @author DANNA
 */
public class EjemploFormatFlagsConversionMismatchException {

    public static void main(String[] args) {
        try {
            // Crear un objeto Formatter con una cadena de formato inválida
            Formatter formatter = new Formatter(Locale.US);
            formatter.format("%#d", "texto"); // Intentamos aplicar la bandera '#' a una cadena

            // Cerrar el objeto Formatter
            formatter.close();
        } catch (java.util.FormatFlagsConversionMismatchException e) {
            System.out.println("Se lanzó una FormatFlagsConversionMismatchException: " + e.getMessage());
        }
    }

}
/**
 *
 * Es una excepción de la clase Formatter en Java que se lanza cuando se
 * encuentra una bandera en una cadena de formato que no es compatible con la
 * conversión que se está realizando. *
 *
 * En este ejemplo, estamos intentando aplicar la bandera '#' a una cadena en la
 * cadena de formato "%#d". Sin embargo, la bandera '#' es incompatible con la
 * conversión %d (decimal entero). Esto provocará una
 * FormatFlagsConversionMismatchException, que capturamos en el bloque catch y
 * mostramos un mensaje indicando que se lanzó una
 * FormatFlagsConversionMismatchException.
 *
 */
