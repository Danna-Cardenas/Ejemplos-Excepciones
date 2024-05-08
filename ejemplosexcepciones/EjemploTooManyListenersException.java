/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DANNA
 */
public class EjemploTooManyListenersException {

    public static void main(String[] args) {
        Button boton = new Button("Click me");

        // Intentamos agregar dos listeners de acción al botón
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Listener de acción 1");
            }
        });

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Listener de acción 2");
            }
        });
    }

}
/**
 *
 * En este ejemplo, intentamos agregar dos listeners de acción al mismo botón
 * (boton.addActionListener(...)). Sin embargo, los botones en AWT (Abstract
 * Window Toolkit) de Java solo pueden tener un único listener de acción. Por lo
 * tanto, al intentar agregar el segundo listener, se lanzará una
 * TooManyListenersException.
 */
