/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.security.InvalidParameterException;

/**
 *
 * @author DANNA
 */
public class EjemploInvalidParameterException {

    public static void main(String[] args) {
        try {
            // Simulando una función que requiere un número positivo
            int resultado = calcularCuadrado(-5);
            System.out.println("El resultado es: " + resultado);
        } catch (InvalidParameterException e) {
            System.out.println("Se lanzó una InvalidParameterException: " + e.getMessage());
        }
    }

    public static int calcularCuadrado(int numero) {
        if (numero < 0) {
            throw new InvalidParameterException("El número debe ser positivo");
        }
        return numero * numero;
    }

}
/**
 *
 * es una excepción que se lanza cuando un método recibe un parámetro inválido.
 * Esta excepción puede ocurrir en diferentes contextos, pero generalmente se
 * utiliza para indicar que un parámetro dado no cumple con ciertas
 * restricciones o expectativas.
 *
 * calcularCuadrado() espera un número positivo como parámetro. Si se le pasa un
 * número negativo, la función lanza una InvalidParameterException con un
 * mensaje indicando que el número debe ser positivo.
 */
