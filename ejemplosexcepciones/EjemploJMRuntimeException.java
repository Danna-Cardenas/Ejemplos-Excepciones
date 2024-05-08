/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.lang.management.ManagementFactory;
import javax.management.JMRuntimeException;
import javax.management.MBeanServer;

/**
 *
 * @author DANNA
 */
public class EjemploJMRuntimeException {
    
    public static void main(String[] args) {
        // Intentar conectar con el agente JMX local
        try {
            MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
            System.out.println("Conexión exitosa con el agente JMX local.");
        } catch (JMRuntimeException e) {
            // Manejar la excepción JMRuntimeException
            System.err.println("Error al conectar con el agente JMX: " + e.getMessage());
            e.printStackTrace();
}
}
    
}
