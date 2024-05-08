/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author DANNA
 */
public class EjemploIOException {
    
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            // Abre un archivo para escritura
            writer = new FileWriter("archivo salida.txt");
                    //Escribe datos en el archivo 
                    writer.write("Hola, este es un ejemplo de IOException en Java");
        }catch (IOException e){
           //Manejo de la excepcion 
           System.out.print("se produjo un error de E/S: " + e.getMessage());
           e.printStackTrace();
        }finally {
            try{
                if(writer !=null) {
                    writer.close();
                }
            }catch (IOException e) {
                System.out.print("error al cerrar el archivo: "+ e.getMessage());
            }
        }
    }
    
}
