/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author DANNA
 */
public class EjemploAccessControlException {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("archivo"));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
/**
 *
 * Si el archivo "archivo" está ubicado en un directorio protegido o en un
 * lugar donde el programa no tiene permisos de lectura, se lanzará una
 * AccessControlException al intentar abrir el archivo.
 */
