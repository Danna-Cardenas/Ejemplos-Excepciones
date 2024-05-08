/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

/**
 *
 * @author DANNA
 */
public class EjemploStackOverflowError {

    public static void main(String[] args) {
        try {
            // Llamamos a un método recursivo infinito
            metodoRecursivo();
        } catch (StackOverflowError e) {
            // Manejamos la excepción si ocurre un StackOverflowError
            System.err.println("Se ha producido un desbordamiento de la pila: " + e.getMessage());
        }
    }

    public static void metodoRecursivo() {
        metodoRecursivo(); // Llamada recursiva infinita
    }

}
/**
 *
 * Tenemos un método llamado metodoRecursivo() que se llama a sí mismo
 * recursivamente sin ningún caso base o condición de terminación. Esto
 * provocará que el tamaño de la pila de llamadas se desborde, lo que resultará
 * en un StackOverflowError.
 */
