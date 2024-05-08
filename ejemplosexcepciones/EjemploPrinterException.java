/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

/**
 *
 * @author DANNA
 */
public class EjemploPrinterException {
    
    public static void main(String[] args) {
        // Crear un trabajo de impresión
        PrinterJob job = PrinterJob.getPrinterJob();

        // Setear el trabajo de impresión
        job.setPrintable((graphics, pageFormat, pageIndex) -> {
            // Simular impresión de un documento
            graphics.drawString("Documento de prueba", 150, 150);
            return Printable.PAGE_EXISTS;
        });

        // Intentar imprimir el documento
        try {
            job.print();
        } catch (PrinterException e) {
            // Manejar la excepción PrinterException
            System.err.println("Error al imprimir: " + e.getMessage());
        }
    }
    
}
