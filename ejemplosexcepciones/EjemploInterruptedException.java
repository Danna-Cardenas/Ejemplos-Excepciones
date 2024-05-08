/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

/**
 *
 * @author DANNA
 */
public class EjemploInterruptedException {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                try {
                    System.out.println("Hilo en espera...");
                    Thread.sleep(5000); // Hilo en espera durante 5 segundos
                    System.out.println("Hilo despierto.");
                } catch (InterruptedException e) {
                    System.out.println("Hilo interrumpido mientras estaba en espera.");
                }
            }
        });

        thread.start(); // Iniciar el hilo

        // Esperar un momento y luego interrumpir el hilo
        try {
            Thread.sleep(2000);
            thread.interrupt(); // Interrumpir el hilo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
/**
 *
 * En este ejemplo, creamos un hilo (thread) que espera durante 5 segundos
 * llamando a Thread.sleep(5000). Después de 2 segundos de que el hilo haya
 * comenzado a esperar, llamamos a thread.interrupt() para interrumpirlo. Esto
 * provocará que se lance una InterruptedException en el hilo en espera.
 */
