/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 *
 * @author DANNA
 */
public class EjemploParserConfigurationException {

    public static void main(String[] args) {
        try {
            // Intentamos crear un DocumentBuilder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Utilizamos el DocumentBuilder para parsear un documento XML (no proporcionado en este ejemplo)
            // builder.parse("documento.xml");
            System.out.println("Parser configurado correctamente.");
        } catch (ParserConfigurationException e) {
            // Manejamos la excepción si ocurre una ParserConfigurationException
            System.err.println("Error de configuración del parser: " + e.getMessage());
        }
    }

}
/**
 *
 * Intentamos crear un DocumentBuilder a partir de una DocumentBuilderFactory.
 * Si hay algún problema durante la configuración del parser de XML, como una
 * configuración inválida o no soportada, se lanzará una
 * ParserConfigurationException.
 */
