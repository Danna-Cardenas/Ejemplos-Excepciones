/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/**
 *
 * @author DANNA
 */
public class EjemploCipherNotFoundException {

    public static void main(String[] args) {
        try {
            // Intentar obtener una instancia de Cipher con un algoritmo no disponible
            Cipher cipher = Cipher.getInstance("AlgoritmoNoDisponible");
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            System.out.println("Se lanzó una NoSuchAlgorithmException: " + e.getMessage());
        }
    }

}
/**
 *
 * CipherNotFoundException no es una excepción estándar del lenguaje. Sin
 * embargo, si te refieres a una situación en la que una instancia de Cipher no
 * puede ser encontrada debido a que el algoritmo de cifrado especificado no
 * está disponible en la plataforma Java, puedes enfrentarte a excepciones
 * relacionadas con la clase NoSuchAlgorithmException o NoSuchPaddingException,
 * dependiendo de la operación de cifrado que estés realizando. *
 *
 */
