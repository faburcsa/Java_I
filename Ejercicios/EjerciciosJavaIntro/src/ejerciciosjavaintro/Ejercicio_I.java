/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjavaintro;

import java.util.Scanner; // Este es el importe de la clase Scanner

/**
 *
 * @author fabia
 */
public class Ejercicio_I {
    public static void main(String[] args) {
        System.out.println("Ejercicio Nro. 1");  
        /*Escribir un programa que pida dos números enteros por teclado 
        y calcule la suma de los dos.
        El programa deberá después mostrar el resultado de la suma*/
        
        Scanner leer = new Scanner(System.in); // Creamos el Scanner
        
        System.out.println("Ingrese un numero entero");
        int numEntero = leer.nextInt(); // Leer un entero
        
        System.out.println("Ingrese otro numero entero");
        int numEntero2 = leer.nextInt(); // Leer un entero2
        
        int suma=numEntero+numEntero2;
        System.out.println("La suma de los numeros "+ numEntero + " + "+numEntero2+ " es "+ suma);
         
    }
            
            
}
