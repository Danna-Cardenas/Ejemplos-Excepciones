/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.io.IOException;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarException;
import java.util.jar.JarFile;

/**
 *
 * @author DANNA
 */
public class EjemploJarException {

    public static void main(String[] args) {
        try {
            // Intentar abrir un archivo JAR que no existe
            String jarFilePath = "archivo_no_existente.jar";
            JarFile jarFile = new JarFile(jarFilePath);

            // Listar las entradas del archivo JAR
            Enumeration<JarEntry> entries = jarFile.entries();
            while (entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                System.out.println(entry.getName());
            }

            // Cerrar el archivo JAR
            jarFile.close();
        } catch (JarException e) {
            System.out.println("Se lanzó una JarException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Se lanzó una excepción: " + e.getMessage());
        }
    }

}
/**
 *
 * es una excepción que se lanza cuando ocurre un error relacionado con la
 * manipulación de archivos JAR (Java ARchive) en Java. Los archivos JAR son
 * archivos comprimidos que contienen clases Java, recursos y metadatos
 * relacionados.
 *
 * estamos intentando abrir un archivo JAR (archivo_no_existente.jar) que no
 * existe. Esto provocará una IOException cuando se intente crear el objeto
 * JarFile, y esta excepción será capturada y convertida en una JarException, ya
 * que JarException es una subclase de IOException.
 */
