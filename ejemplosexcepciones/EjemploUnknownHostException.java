/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author DANNA
 */
public class EjemploUnknownHostException {

    public static void main(String[] args) {
        try {
            // Intentamos resolver el nombre de host de una dirección IP
            InetAddress address = InetAddress.getByName("hostdesconocido.com");
            System.out.println("La dirección IP de hostdesconocido.com es: " + address.getHostAddress());
        } catch (UnknownHostException e) {
            // Manejamos la excepción si ocurre una UnknownHostException
            System.err.println("No se pudo resolver el nombre de host: " + e.getMessage());
        }
    }

}
/**
 *
 * En este ejemplo, intentamos resolver el nombre de host "hostdesconocido.com"
 * en una dirección IP utilizando el método getByName() de la clase InetAddress.
 * Si el nombre de host no se puede resolver, es decir, si no existe en el
 * sistema de nombres de dominio (DNS) o si hay algún otro problema relacionado
 * con la resolución del nombre de host, se lanzará una UnknownHostException.
 *
 */
