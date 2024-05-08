/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosexcepciones;

import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author DANNA
 */
public class EjemploNamingException {

    public static void main(String[] args) {
        try {
            // Crear un contexto inicial con la configuración adecuada
            Hashtable<String, String> env = new Hashtable<>();
            env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.fscontext.RefFSContextFactory");
            env.put(Context.PROVIDER_URL, "file:///tmp");
            Context context = new InitialContext(env);

            // Intentar buscar un nombre que no existe en el contexto
            Object obj = context.lookup("no_existe");

            // Si el objeto es nulo, significa que el nombre no fue encontrado
            if (obj == null) {
                System.out.println("El nombre no fue encontrado.");
            }
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

}
/**
 *
 * Intentamos buscar un nombre que no existe ("no_existe") en
 * un contexto de directorio. Si el nombre no se encuentra, se lanzará una
 * NamingException. La excepción se maneja en un bloque try-catch, donde se
 * imprime el rastreo de la pila en caso de que ocurra una excepción.
 */
