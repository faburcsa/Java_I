/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package faburcsa.guia13_exception;

import entidades.Persona;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null
 * y tratar de invocar el método esMayorDeEdad() a través de ese objeto. Luego,
 * englobe el código con una cláusula try-catch para probar la nueva excepción
 * que debe ser controlada.
 */
public class EJ1 {

    public static void main(String[] args) {
        
        Persona per=null;
        try {
            per.esMayor();
        } catch (Exception e) {
            System.out.println("Excepcion " + e.getMessage() + " Capturada");
            System.out.println(e.toString());
        }
        
    }
}
