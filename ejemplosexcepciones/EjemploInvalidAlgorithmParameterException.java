/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/**
 *
 * @author DANNA
 */
public class EjemploInvalidAlgorithmParameterException {

    public static void main(String[] args) {
        try {
            // Intentar crear una instancia de Cipher con un parámetro de algoritmo incorrecto
            Cipher cipher = Cipher.getInstance("AES/InvalidAlgorithm"); // "InvalidAlgorithm" es un parámetro de algoritmo inválido

        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            System.out.println("Se lanzó una InvalidAlgorithmParameterException: " + e.getMessage());
        }
    }

}
/**
 *
 * es una excepción que se lanza cuando se proporciona un parámetro de algoritmo
 * inválido o no válido en Java, especialmente al trabajar con algoritmos
 * criptográficos u otros algoritmos que requieren parámetros específicos.
 *
 * Estamos intentando crear una instancia de Cipher con el parámetro de
 * algoritmo "AES/InvalidAlgorithm", donde "InvalidAlgorithm" es un parámetro de
 * algoritmo inválido. Esto provocará una InvalidAlgorithmParameterException,
 * que capturamos en el bloque catch y mostramos un mensaje indicando que se
 * lanzó una InvalidAlgorithmParameterException.
 */
