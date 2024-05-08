/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/**
 *
 * @author DANNA
 */
public class EjemploCertificateException {

    public static void main(String[] args) {
        try {
            // Intentar cargar un certificado desde un archivo que no existe
            String certificateFile = "certificate.crt";

            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            InputStream inputStream = new FileInputStream(certificateFile);
            X509Certificate certificate = (X509Certificate) certificateFactory.generateCertificate(inputStream);

            // Procesar el certificado...
        } catch (CertificateException e) {
            System.out.println("Se lanzó una CertificateException: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("El archivo de certificado no se encontró: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Se lanzó una excepción: " + e.getMessage());
        }
    }

}
/**
 *
 * estamos intentando cargar un certificado desde un archivo (certificate.crt)
 * que no existe. Esto provocará una FileNotFoundException, que será capturada y
 * convertida en una CertificateException, ya que FileNotFoundException es una
 * subclase de IOException y CertificateException puede ser lanzada como
 * resultado de problemas de E/S durante la carga del certificado.
 */
