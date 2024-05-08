/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

/**
 *
 * @author DANNA
 */
public class EjemploNullPointerException {
    
    public static void main(String[] args) {
        String nombre = null;

        try {
            // Intentar saludar usando una variable nula
            System.out.println("Hola, " + nombre.toUpperCase() + "!"); // Esto causará una NullPointerException
        } catch (NullPointerException e) {
            // Manejar NullPointerException para la variable nula
            System.err.println("Error: No se ha definido el nombre.");
            System.err.println("Debes asignar un valor a la variable 'nombre' antes de usarla.");
        }
    }
    
}
