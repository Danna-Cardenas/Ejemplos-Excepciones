/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

/**
 *
 * @author DANNA
 */
public class ArrayIndexOutOfBoundsException {
    
    public static void main (String[] args){
        final int[] array = {20, 40, 60};
        
        System.out.println(array[0]);//20
        System.out.print(array[1]);//40
        System.out.print(array[2]);//60
        
        try {
            final var ret = array[3];
        }catch (IndexOutOfBoundsException e){
            System.out.print("Indice fuera de los limites del array: " + e);
        }
    }
}
