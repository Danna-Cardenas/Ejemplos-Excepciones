/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.management.openmbean.InvalidKeyException;

/**
 *
 * @author DANNA
 */
public class EjemploNoSuchPaddingException {

    public static void main(String[] args) {
        try {
            // Generar una clave secreta
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            SecretKey secretKey = keyGenerator.generateKey();
            byte[] keyBytes = secretKey.getEncoded();

            // Crear un objeto SecretKeySpec a partir de los bytes de la clave
            SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, "AES");

            // Crear un cifrador con un tipo de relleno válido (PKCS5Padding)
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);

            // Continuar con el procesamiento del cifrado...
        } catch (NoSuchAlgorithmException | InvalidKeyException | NoSuchPaddingException e) {
            System.out.println("Se lanzó una excepción: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Se lanzó una excepción: " + e.getMessage());
        }
    }

}
/**
 *
 * es una excepción que se lanza cuando un algoritmo de cifrado no válido o no
 * compatible es especificado en Java. Esto ocurre generalmente en el contexto
 * de operaciones criptográficas, como el cifrado y descifrado de datos.
 */
