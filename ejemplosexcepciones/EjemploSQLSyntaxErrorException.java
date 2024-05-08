/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DANNA
 */
public class EjemploSQLSyntaxErrorException {

    public static void main(String[] args) {
        try {
            // Establecer la conexión con la base de datos (debes cambiar la URL, usuario y contraseña según tu configuración)
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo", "usuario", "contraseña");

            // Crear una declaración SQL con una consulta incorrecta
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM tabla_inexistente");

            // Recorrer el resultado de la consulta
            while (resultSet.next()) {
                // Procesar el resultado...
            }

            // Cerrar la conexión
            connection.close();
        } catch (SQLException e) {
            if (e instanceof java.sql.SQLSyntaxErrorException) {
                System.out.println("Se lanzó una SQLSyntaxErrorException: " + e.getMessage());
            } else {
                e.printStackTrace();
            }
        }
    }

}
/**
 *
 * Se esta intentando ejecutar una consulta SQL incorrecta que hace referencia a
 * una tabla inexistente (tabla_inexistente). Esto provocará una
 * SQLSyntaxErrorException, que capturamos en el bloque catch y mostramos un
 * mensaje indicando que se lanzó una SQLSyntaxErrorException. *
 *
 *
 *
 *
 */
