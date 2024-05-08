/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author DANNA
 */
public class EjemploFileNotFoundException {
    
     public static void main(String[] args) {
         Properties configuracion = new Properties();
         
         try{
             // Intentar leer el archivo de configuración
            FileInputStream lectorArchivo = new FileInputStream("config.txt");
            configuracion.load(lectorArchivo);
            lectorArchivo.close();

            // Imprimir algunas propiedades de configuración
            System.out.println("Servidor: " + configuracion.getProperty("servidor"));
            System.out.println("Puerto: " + configuracion.getProperty("puerto"));
            System.out.println("Usuario: " + configuracion.getProperty("usuario"));
        } catch (FileNotFoundException e) {
            // Manejar la excepción FileNotFoundException
            System.err.println("Error: Archivo de configuración no encontrado: config.txt");
        } catch (IOException e) {
            // Manejar otras excepciones de E/S
            System.err.println("Error al leer el archivo de configuración: " + e.getMessage());
        }

         }
     }
     
    

