/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

/**
 *
 * @author DANNA
 */
public class EjemploFormatException {
    
    public static void main(String[] args) {
        // Intentemos analizar una cadena que no es un número en formato entero
        String cadenaNoEntera = "abc";
        try {
            int numero = Integer.parseInt(cadenaNoEntera);
            System.out.println("Número analizado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error de formato: No se puede analizar la cadena como un número entero.");
            e.printStackTrace();
        }
    }

    
}
/**
 *java.util.FormatException: Se produce cuando se produce un error de formato
 * en una cadena, como intentar analizar una cadena en un formato no compatible.

 * En este ejemplo, intentamos analizar la cadena "abc" en un número entero
 * utilizando Integer.parseInt(). Sin embargo, "abc" no es un número válido en
 * formato entero, lo que provocará una java.util.FormatException al intentar
 * analizarla. La excepción será capturada por el bloque catch donde podemos
 * manejarla adecuadamente.
 */