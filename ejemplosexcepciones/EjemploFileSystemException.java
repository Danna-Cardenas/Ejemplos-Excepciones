/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author DANNA
 */
public class EjemploFileSystemException {

    public static void main(String[] args) {
        try {
            // Intentamos copiar un archivo que no existe
            Path origen = Paths.get("archivo que no existe");
            Path destino = Paths.get("destino");
            Files.copy(origen, destino);
        } catch (IOException e) {
            // Manejamos la excepción si ocurre una FileSystemException
            System.err.println("Error en el sistema de archivos: " + e.getMessage());
        }
    }

}
/**
 *
 * Intentamos copiar un archivo (archivo_que_no_existe.txt) que no existe en el
 * sistema de archivos a un nuevo destino (destino.txt). Si el archivo de origen
 * no existe o hay algún otro problema relacionado con el sistema de archivos,
 * se lanzará una FileSystemException.
 */
