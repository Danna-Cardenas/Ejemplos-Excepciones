/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

/**
 *
 * @author DANNA
 */
public class EjemploIllegalThreadStateException {
    
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            // Simulación de un trabajo largo
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Tarea completada.");
        });

        // Intentar iniciar el hilo dos veces
        thread.start();
        // Esto lanzará IllegalThreadStateException
        thread.start(); 
}
}
