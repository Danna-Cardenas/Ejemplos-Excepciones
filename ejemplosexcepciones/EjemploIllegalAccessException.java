/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

/**
 *
 * @author DANNA
 */
public class EjemploIllegalAccessException {

    private int privateField;

    public static void main(String[] args) {
        EjemploIllegalAccessException example = new EjemploIllegalAccessException();
        try {
            // Intentar acceder al campo privado indirectamente usando un método público
            example.setPrivateField(10);
        } catch (IllegalAccessException e) {
            System.out.println("Se lanzó una IllegalAccessException: " + e.getMessage());
        }
    }

    // Método público para establecer el valor del campo privado
    public void setPrivateField(int value) throws IllegalAccessException {
        this.privateField = value;
    }

}
/**
 *
 * IllegalAccessException es una excepción que se lanza cuando se intenta
 * acceder a un miembro de una clase (como un campo, método o constructor) de
 * manera ilegal, es decir, cuando se trata de acceder a un miembro que no es
 * accesible desde el contexto actual debido a restricciones de acceso.
 */
