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
public class EjemploBadPaddingException {

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

            // Cifrar los datos (simulado)
            byte[] datosCifrados = cipher.doFinal("Datos a cifrar".getBytes());

            // Intentar descifrar los datos utilizando una clave incorrecta
            SecretKeySpec claveIncorrectaSpec = new SecretKeySpec(new byte[16], "AES"); // Clave incorrecta
            cipher.init(Cipher.DECRYPT_MODE, claveIncorrectaSpec);
            byte[] datosDescifrados = cipher.doFinal(datosCifrados);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException e) {
            System.out.println("Se lanzó una excepción: " + e.getMessage());
        } catch (BadPaddingException e) {
            System.out.println("Se lanzó una BadPaddingException: " + e.getMessage());
        }
    }
}
/**
 *
 * es una excepción que se lanza durante operaciones criptográficas, como la
 * desencriptación, cuando se detecta un relleno incorrecto o no válido en los
 * datos cifrados.
 *
 * En este ejemplo, estamos intentando descifrar datos cifrados utilizando una
 * clave incorrecta. Esto provocará una BadPaddingException porque el relleno no
 * será válido para la clave incorrecta. La excepción se captura en el bloque
 * catch y se muestra un mensaje indicando que se lanzó una BadPaddingException.
 */
