/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.awt.AWTException;
import java.awt.Robot;

/**
 *
 * @author DANNA
 */
public class EjemploAWTException {

    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            // Simular un clic del mouse
            robot.mousePress(java.awt.event.InputEvent.BUTTON1_MASK);
            robot.mouseRelease(java.awt.event.InputEvent.BUTTON1_MASK);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

}
/**
 *
 * En este ejemplo, intentamos crear una instancia de Robot para simular un clic
 * del mouse. Sin embargo, si ocurre un problema al crear la instancia de Robot,
 * como por ejemplo, si el entorno de ejecución no permite la creación de
 * instancias de Robot, se lanzará una AWTException.
 */
