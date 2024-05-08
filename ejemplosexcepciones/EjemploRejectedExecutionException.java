/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/**
 *
 * @author DANNA
 */
public class EjemploRejectedExecutionException {

    public static void main(String[] args) {
        try {
            // Crear un ExecutorService con un solo hilo
            ExecutorService executor = Executors.newSingleThreadExecutor();

            // Apagar el ExecutorService para que no se puedan agregar nuevas tareas
            executor.shutdown();

            // Intentar agregar una tarea después de apagar el ExecutorService
            executor.execute(() -> System.out.println("Hola desde la tarea"));

            // Cerrar el ExecutorService
            executor.shutdownNow(); // Esto se ejecuta para liberar los recursos del ExecutorService
        } catch (RejectedExecutionException e) {
            System.out.println("Se lanzó una RejectedExecutionException: " + e.getMessage());
        }
    }

}
/**
 *
 * es una excepción que se lanza cuando se intenta agregar una tarea a un
 * ExecutorService pero la tarea no se puede aceptar para su ejecución. Esto
 * suele ocurrir cuando el ExecutorService ha sido apagado o está en un estado
 * que no permite la ejecución de nuevas tareas, como cuando se alcanza el
 * límite máximo de tareas en una cola de espera.
 *
 * creamos un ExecutorService con un solo hilo y luego lo apagamos llamando al
 * método shutdown(). Después de apagar el ExecutorService, intentamos agregar
 * una tarea utilizando el método execute(). Esto provocará una
 * RejectedExecutionException porque el ExecutorService ha sido apagado y no
 * puede aceptar nuevas tareas para su ejecución. La excepción se captura en el
 * bloque catch y se muestra un mensaje indicando que se lanzó una
 * RejectedExecutionException.
 */
