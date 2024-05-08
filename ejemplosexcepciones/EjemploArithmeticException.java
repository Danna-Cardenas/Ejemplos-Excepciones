/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

/**
 *
 * @author DANNA
 */
public class EjemploArithmeticException {
    
    public static void main(String[] args) {
        try {
            int resultado = dividir(15, 0);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            // Manejo de la excepción
            System.out.println("Se produjo un error aritmético, no se puede dividir por cero ");
            
        }
    }

     public static int dividir(int numerador, int denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("Intento de dividir por cero.");
        }
        return numerador / denominador;
    }
}
