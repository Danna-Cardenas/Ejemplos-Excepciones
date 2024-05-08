/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

/**
 *
 * @author DANNA
 */
public class EjemploStringIndexOutOfBoundsException {

    public static void main(String[] args) {
        String cadena = "Hola";

        // Intentamos acceder a un índice fuera de los límites de la cadena
        char caracter = cadena.charAt(10);
        System.out.println(caracter);
    }

}
/**
 *
 * En este ejemplo, la cadena "Hola" tiene una longitud de 4 caracteres, por lo
 * que los índices válidos van desde 0 hasta 3. Sin embargo, intentamos acceder
 * al carácter en el índice 10, lo que está más allá de los límites de la
 * cadena. Esto provocará que se lance una StringIndexOutOfBoundsException.
 */
