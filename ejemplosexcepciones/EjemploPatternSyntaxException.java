/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author DANNA
 */
public class EjemploPatternSyntaxException {

    public static void main(String[] args) {
        try {
            // Intentar compilar una expresión regular inválida
            Pattern pattern = Pattern.compile("["); // Esto lanzará una PatternSyntaxException
        } catch (PatternSyntaxException e) {
            System.out.println("Se lanzó una PatternSyntaxException: " + e.getMessage());
            System.out.println("Posición del error: " + e.getIndex());
        }
    }

}
/**
 *
 * PatternSyntaxException es una excepción que se lanza cuando hay un problema
 * con la sintaxis de una expresión regular. Esto puede ocurrir, por ejemplo,
 * cuando intentas compilar una expresión regular inválida utilizando la clase
 * Pattern del paquete java.util.regex. * estamos tratando de compilar una
 * expresión regular inválida [, que falta el carácter de cierre para la clase
 * de caracteres. 
 * 
 * Esto provocará una PatternSyntaxException, que capturamos en
 * el bloque catch y mostramos un mensaje indicando que se lanzó una
 * PatternSyntaxException, así como la posición del error dentro de la expresión
 * regular. Esto puede ayudar en la depuración para identificar y corregir el
 * problema con la expresión regular.
 *
 *
 */
