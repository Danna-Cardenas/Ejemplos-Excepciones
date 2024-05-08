/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/**
 *
 * @author DANNA
 */
public class EjemploInvalidKeyException {

    public static void main(String[] args) {
        try {
            // Generar una clave secreta
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            SecretKey secretKey = keyGenerator.generateKey();

            // Intentar crear una instancia de Cipher con una clave inválida
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey); // Proporcionamos una clave nula, lo que provocará una InvalidKeyException

        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException e) {
            System.out.println("Se lanzó una InvalidKeyException: " + e.getMessage());
        }
    }

}

/**
 *
 * es una excepción que se lanza cuando se utiliza una clave inválida en
 * operaciones criptográficas en Java. Esto puede ocurrir, por ejemplo, cuando
 * se intenta cifrar o descifrar datos utilizando una clave que no es compatible
 * con el algoritmo de cifrado o cuando la clave no está en un formato adecuado
 *
 * estamos intentando crear una instancia de Cipher para cifrar datos en modo
 * ECB (Electronic Codebook) con relleno PKCS5 y proporcionamos una clave nula
 * en el método init(). Esto provocará una InvalidKeyException, ya que la clave
 * no se puede utilizar para cifrar los datos. La excepción se captura en el
 * bloque catch y se muestra un mensaje indicando que se lanzó una
 * InvalidKeyException.
 */
