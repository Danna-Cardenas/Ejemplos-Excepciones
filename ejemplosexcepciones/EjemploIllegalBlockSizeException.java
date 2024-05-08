/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author DANNA
 */
public class EjemploIllegalBlockSizeException {

    public static void main(String[] args) {
        try {
            // Generar una clave secreta
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            SecretKey secretKey = keyGenerator.generateKey();
            byte[] keyBytes = secretKey.getEncoded();

            // Crear un objeto SecretKeySpec a partir de los bytes de la clave
            SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, "AES");

            // Crear un cifrador
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");

            // Inicializar el cifrador en modo de cifrado
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);

            // Cifrar datos con una longitud no válida
            byte[] datosParaCifrar = new byte[5]; // Longitud no válida para el cifrado AES
            byte[] datosCifrados = cipher.doFinal(datosParaCifrar);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | BadPaddingException e) {
            System.out.println("Se lanzó una excepción: " + e.getMessage());
        } catch (IllegalBlockSizeException e) {
            System.out.println("Se lanzó una IllegalBlockSizeException: " + e.getMessage());
        }
    }

}
/**
 *
 * es una excepción que se lanza durante operaciones criptográficas, como el
 * cifrado o descifrado, cuando se detecta un tamaño de bloque de datos
 * incorrecto o no válido.
 *
 * En este ejemplo, estamos intentando cifrar datos con una longitud no válida
 * para el cifrado AES. Esto provocará una IllegalBlockSizeException porque el
 * tamaño de los datos a cifrar no es válido para el algoritmo de cifrado. La
 * excepción se captura en el bloque catch y se muestra un mensaje indicando que
 * se lanzó una IllegalBlockSizeException.
 */
