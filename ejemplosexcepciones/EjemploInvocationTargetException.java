/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author DANNA
 */
public class EjemploInvocationTargetException {
    
    public static void main(String[] args) {
        try {
            // Obtener la clase Operaciones
            Class<?> claseOperaciones = Class.forName("Operaciones");

            // Obtener el método dividir que toma dos argumentos enteros
            Method metodoDividir = claseOperaciones.getMethod("dividir", int.class, int.class);

            // Crear una instancia de Operaciones
            Object instanciaOperaciones = claseOperaciones.getDeclaredConstructor().newInstance();

            // Invocar el método dividir con argumentos 10 y 0 (división por cero)
            metodoDividir.invoke(instanciaOperaciones, 10, 0);
        } catch (Exception e) {
            // Manejar la excepción lanzada por el método dividir
            Throwable causa = e.getCause();
            if (causa instanceof java.lang.reflect.InvocationTargetException) {
                // Excepción no controlada lanzada por el método dividir
                Throwable excepcionLanzada = ((InvocationTargetException) causa).getTargetException();
                excepcionLanzada.printStackTrace();
            } else {
                // Otra excepción durante la invocación del método
                e.printStackTrace();
            }
        }
    }
}
/**
 *java.lang.reflect.InvocationTargetException: Se produce cuando un método
 * invocado mediante reflexión (reflection) lanza una excepción que no es
 * controlada por el método invocado.

 * En este ejemplo, intentamos dividir por cero, lo que lanzará una
 * ArithmeticException. Sin embargo, al invocar el método dividir a través de
 * reflexión en Main, esta excepción no controlada se envuelve en una
 * java.lang.reflect.InvocationTargetException.
 */
    

