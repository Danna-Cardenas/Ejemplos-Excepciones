/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 *
 * @author DANNA
 */
public class EjemploMissingResourceException {

    public static void main(String[] args) {
        try {
            // Cargar el archivo de propiedades
            ResourceBundle bundle = ResourceBundle.getBundle("messages");

            // Intentar obtener una cadena que no existe en el archivo de propiedades
            String missingKey = bundle.getString("missing_key");
            System.out.println("Mensaje: " + missingKey);
        } catch (MissingResourceException e) {
            System.out.println("Se lanzó una MissingResourceException: " + e.getMessage());
        }
    }

}
/**
 *
 * es una excepción que se lanza cuando no se puede encontrar un recurso
 * solicitado, como un archivo de propiedades o una entrada en un archivo de
 * propiedades, durante la carga o búsqueda de recursos en Java
 *
 * En este ejemplo, estamos intentando obtener una cadena de texto con la clave
 * "missing_key" del archivo de propiedades messages.properties. Sin embargo,
 * esta clave no existe en el archivo de propiedades, lo que provocará una
 * MissingResourceException. Esta excepción se captura en el bloque catch y se
 * muestra un mensaje indicando que se lanzó una MissingResourceException.
 */
