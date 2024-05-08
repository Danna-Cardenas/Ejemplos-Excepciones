/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 *
 * @author DANNA
 */
public class EjemploEmptyStackException {
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Intentar hacer pop en una pila vacía
        try {
            stack.pop(); // Intenta hacer pop en una pila vacía
        } catch (EmptyStackException e) {
            // Manejar la excepción
            System.err.println("¡La pila está vacía! No se puede hacer pop.");
        }

        // Intentar acceder al elemento en la cima de la pila vacía
        try {
            stack.peek(); // Intenta acceder al elemento en la cima de la pila vacía
        } catch (EmptyStackException e) {
            // Manejar la excepción
            System.err.println("¡La pila está vacía! No se puede acceder al elemento en la cima.");
        }
    }

}
