/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

/**
 *
 * @author DANNA
 */
public class EjemploRuntimeException {
    
    public static void main(String[] args) {
        try {
            // Lanzar una RuntimeException
            throw new RuntimeException("Este es un ejemplo de RuntimeException");
        } catch (RuntimeException e) {
            // Manejar la RuntimeException
            System.out.println("Se produjo una RuntimeException: " + e.getMessage());
        }
    }
    
}
