/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

/**
 *
 * @author DANNA
 */
public class ParseException {
    
    public static void main(String args[]){
        
        int a = Integer.parseInt("24");
        double b = Double.parseDouble("80");
        int c = Integer.parseInt("150",2);
        
        System.out.print(Integer.parseInt("24"));
        System.out.print(Double.parseDouble("80"));
        System.out.print(Integer.parseInt("150",2));
        System.out.print(Integer.parseInt("110",8));

       }
    
}
