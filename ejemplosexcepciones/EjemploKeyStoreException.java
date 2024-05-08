/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;

/**
 *
 * @author DANNA
 */
public class EjemploKeyStoreException {

    public static void main(String[] args) {
        try {
            // Intentar cargar un archivo de almacén de claves que no existe
            String keyStoreFile = "keystore.jks";
            char[] password = "password".toCharArray();

            KeyStore keyStore = KeyStore.getInstance("JKS");
            InputStream inputStream = new FileInputStream(keyStoreFile);
            keyStore.load(inputStream, password);
        } catch (KeyStoreException | FileNotFoundException e) {
            System.out.println("Se lanzó una KeyStoreException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Se lanzó una excepción: " + e.getMessage());
        }
    }

}
/**
 *
 * es una excepción que se lanza cuando ocurre un error durante la manipulación
 * de almacenes de claves en Java, como almacenes de claves privadas, almacenes
 * de certificados, etc.
 *
 * estamos intentando cargar un archivo de almacén de claves (keystore.jks) que
 * no existe. Esto provocará una FileNotFoundException, que será capturada y
 * convertida en una KeyStoreException, ya que FileNotFoundException es una
 * subclase de IOException y KeyStoreException puede ser lanzada como resultado
 * de problemas de E/S durante la carga del almacén de claves.
 */
