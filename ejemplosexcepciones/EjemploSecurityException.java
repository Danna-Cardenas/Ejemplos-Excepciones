/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

/**
 *
 * @author DANNA
 */
public class EjemploSecurityException {

    public static void main(String[] args) {
        try {
            // Intentar acceder a un recurso protegido
            System.setSecurityManager(new SecurityManager());
            System.getProperty("user.home");
        } catch (SecurityException e) {
            System.out.println("Se lanzó una SecurityException: " + e.getMessage());
        }
    }

}
/**
 *
 * SecurityException es una excepción que se lanza cuando se viola un acceso de
 * seguridad, como intentar acceder a recursos protegidos o realizar operaciones
 * no permitidas por la política de seguridad del sistema. se intenta obtener la
 * propiedad del sistema user.home, que generalmente indica el directorio de
 * inicio del usuario. Sin embargo, si se establece un SecurityManager, puede
 * que este código no esté permitido, ya que acceder a propiedades del sistema
 * podría considerarse una operación de seguridad peligrosa. Por lo tanto, si se
 * lanza una SecurityException, se captura y se imprime un mensaje adecuado.
 */
