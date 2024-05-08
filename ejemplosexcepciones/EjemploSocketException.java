/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;

/**
 *
 * @author DANNA
 */
public class EjemploSocketException {

    public static void main(String[] args) {
        try {
            // Intentamos conectarnos a un servidor en el puerto 8080
            Socket socket = new Socket("localhost", 7070);

            // Creamos streams de entrada y salida para comunicarnos con el servidor
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Enviamos un mensaje al servidor
            out.println("Hola servidor!");

            // Leemos la respuesta del servidor
            String respuesta = in.readLine();
            System.out.println("Respuesta del servidor: " + respuesta);

            // Cerramos la conexión
            socket.close();
        } catch (SocketException e) {
            // Manejamos la excepción si ocurre una SocketException
            System.err.println("Error de socket: " + e.getMessage());
        } catch (Exception e) {
            // Manejamos otras excepciones que puedan ocurrir
            e.printStackTrace();
        }
    }

}
/**
 *
 * Intentamos conectarnos a un servidor en el puerto 8080 en el localhost. Si
 * hay algún problema al establecer la conexión, se lanzará una SocketException.
 * Esto podría ocurrir si el servidor no está en ejecución en el puerto
 * especificado, si hay problemas de red, o si hay algún otro problema
 * relacionado con los sockets.
 */
