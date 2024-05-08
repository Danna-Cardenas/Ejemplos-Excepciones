/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DANNA
 */
public class EjemploSQLException {
    
    public static void main(String[] args) throws java.sql.SQLException {
        Connection conexion = null;

        try {
            // Conectarse a una base de datos (reemplaza estos datos con tus credenciales reales)
            String url = "jdbc:mysql://localhost:3306/tu base de datos";
            String usuario = "usuario";
            String contraseña = "contraseña";
            conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Intentar ejecutar una instrucción SQL inválida
            java.sql.Statement declaracion = conexion.createStatement();
            int resultado = declaracion.executeUpdate("SELECT * from tabla no existente"); // Esto causará una SQLException
            System.out.println("Número de filas afectadas: " + resultado); // Esta línea no se ejecutará
        } catch (SQLException e) {
            // Manejar SQLException para tabla inválida u otros errores de base de datos
            System.err.println("Error al conectarse a la base de datos o ejecutar la instrucción SQL:");
            System.err.println("SQLState: " + e.getSQLState());
            System.err.println("Código de Error: " + e.getErrorCode());
            System.err.println("Mensaje: " + e.getMessage());
        } finally {
            // Cerrar la conexión si se abrió
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
    }
    
}
