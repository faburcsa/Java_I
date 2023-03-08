/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjavaintro;

import java.util.Scanner;

/**
 *
 * @author fabia
 */
public class Ejercicio_III {
    public static void main(String[] args) {
        System.out.println("Ejercicio Nro. III");
        
        /*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
         Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/
        
        Scanner leer = new Scanner(System.in); // Creamos el Scanner
        System.out.println("Escriba una frase:");
        String frase=leer.nextLine();
        
        System.out.println("MASYUSCULAS: "+frase.toUpperCase());
        System.out.println("minusculas: "+frase.toLowerCase());
    }
}
