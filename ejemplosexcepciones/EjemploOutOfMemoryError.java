/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DANNA
 */
public class EjemploOutOfMemoryError {

    public static void main(String[] args) {
        try {
            // Creamos una lista que irá creciendo infinitamente hasta quedarse sin memoria
            List<String> lista = new ArrayList<>();
            while (true) {
                lista.add("elemento");
            }
        } catch (OutOfMemoryError e) {
            // Manejamos la excepción si ocurre un OutOfMemoryError
            System.err.println("Se ha producido un error de memoria: " + e.getMessage());
        }
    }

}
/**
 *
 * Se crea una lista ArrayList llamada lista y entramos en un bucle infinito
 * agregando constantemente elementos a esta lista. Este proceso continuará
 * hasta que el programa se quede sin memoria disponible. Eventualmente, cuando
 * la JVM (Máquina Virtual de Java) no pueda asignar más memoria para crear
 * nuevos objetos, se lanzará un OutOfMemoryError.
 */
