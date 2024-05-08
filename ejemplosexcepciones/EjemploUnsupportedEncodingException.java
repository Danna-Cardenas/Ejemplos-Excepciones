/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.io.UnsupportedEncodingException;

/**
 *
 * @author DANNA
 */
public class EjemploUnsupportedEncodingException {

    public static void main(String[] args) {
        // Supongamos que tenemos una cadena de bytes
        byte[] bytes = {85, 86, 87, 88}; // Representa "ABCD"

        try {
            // Intentar convertir los bytes a una cadena utilizando una codificación no compatible
            String str = new String(bytes, "invalidEncoding"); // Esto lanzará una UnsupportedEncodingException
        } catch (UnsupportedEncodingException e) {
            System.out.println("Se lanzó una UnsupportedEncodingException: " + e.getMessage());
        }
    }

}
/**
 *
 * UnsupportedEncodingException es una excepción que se lanza cuando se intenta
 * utilizar un nombre de codificación de caracteres no válido. Esto puede
 * ocurrir al intentar convertir bytes en cadenas de caracteres utilizando una
 * codificación no compatible o al instanciar un objeto String con un nombre de
 * codificación no válido.
 *
 * Se crea una cadena de caracteres a partir de un array de bytes
 * utilizando una codificación de caracteres inválida ("invalidEncoding"). Esto
 * provocará una UnsupportedEncodingException ya que "invalidEncoding" no es una
 * codificación de caracteres válida. Luego, en el bloque catch, capturamos esta
 * excepción y mostramos un mensaje indicando que se lanzó una
 * UnsupportedEncodingException.
 */
