/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

/**
 *
 * @author DANNA
 */
public class EjemploClassNotFoundException {

    public static void main(String[] args) {
        try {
            // Intentamos cargar la clase MiClase dinámicamente
            Class<?> clase = Class.forName("MiClase");

            // Si se encuentra la clase, imprimimos su nombre
            System.out.println("Clase cargada: " + clase.getName());
        } catch (ClassNotFoundException e) {
            // Manejamos la excepción si no se encuentra la clase
            System.err.println("No se pudo encontrar la clase: " + e.getMessage());
        }
    }

}
/**
 *
 * La excepción ClassNotFoundException se lanza en Java cuando el cargador de
 * clases (ClassLoader) intenta cargar una clase, pero no puede encontrar la
 * definición de la clase en el classpath o no puede acceder a ella por otros
 * motivos. Esta excepción ocurre en tiempo de ejecución cuando el sistema de
 * tiempo de ejecución (runtime) intenta cargar una clase dinámicamente y no
 * puede encontrar su definició 
 * Si ejecutamos este código y no tenemos una clase
 * llamada MiClase en el classpath, se lanzará una ClassNotFoundException.
 */
