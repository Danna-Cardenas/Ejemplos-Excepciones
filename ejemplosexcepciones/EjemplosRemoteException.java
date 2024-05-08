/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.rmi.RemoteException;

/**
 *
 * @author DANNA
 */
public class EjemplosRemoteException {
    
     public static void main(String[] args) {
        try {
            realizarLlamadaRemota();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static void realizarLlamadaRemota() throws RemoteException {
        // Simulamos un error de invocación remota
        throw new RemoteException("Error en la invocación remota");
    }
}
/**
 *
 * En este ejemplo, el método realizarLlamadaRemota() lanza explícitamente una
 * RemoteException para simular un error durante la invocación remota. Cuando
 * ejecutamos main(), la llamada a realizarLlamadaRemota() resultará en una
 * RemoteException, que se maneja en el bloque catch dentro de main().
 */
    

