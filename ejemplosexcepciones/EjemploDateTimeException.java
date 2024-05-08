/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author DANNA
 */
public class EjemploDateTimeException {

    public static void main(String[] args) {
        try {
            // Intentar parsear una cadena con un formato de fecha inválido
            String fechaInvalida = "2024-15-01"; // El mes 15 es inválido
            LocalDate fecha = LocalDate.parse(fechaInvalida, DateTimeFormatter.ISO_LOCAL_DATE);
            System.out.println("Fecha parseada correctamente: " + fecha);
        } catch (DateTimeParseException e) {
            System.out.println("Se lanzó una DateTimeParseException: " + e.getMessage());
        }
    }
}
/**
 *
 * Es una excepción de la API de fecha y hora de Java que se lanza cuando ocurre
 * un error durante la manipulación de fechas y horas, como problemas de
 * formato, valores inválidos o campos fuera de rango
 *
 * Estamos intentando parsear una cadena que representa una fecha con un formato
 * inválido (2024-15-01, donde el mes es 15). Esto provocará una
 * DateTimeParseException, que capturamos en el bloque catch y mostramos un
 * mensaje indicando que se lanzó una DateTimeParseException.
 */
