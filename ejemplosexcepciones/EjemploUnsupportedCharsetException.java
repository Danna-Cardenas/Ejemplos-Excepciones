/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.UnsupportedCharsetException;

/**
 *
 * @author DANNA
 */
public class EjemploUnsupportedCharsetException {

    public static void main(String[] args) {
        // Intentar obtener un conjunto de caracteres (charset) no soportado
        String charsetName = "UTF-16"; // Supongamos que intentamos usar UTF-16, que está soportado en la mayoría de las plataformas
        try {
            Charset charset = Charset.forName(charsetName);
            CharsetEncoder encoder = charset.newEncoder();
            // Aquí podríamos hacer más operaciones con el encoder, pero no es relevante para el ejemplo
            System.out.println("Conjunto de caracteres soportado: " + charsetName);
        } catch (UnsupportedCharsetException e) {
            // Manejar la excepción UnsupportedCharsetException
            System.err.println("Conjunto de caracteres no soportado: " + charsetName);
        }
    }

}
