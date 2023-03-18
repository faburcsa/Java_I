/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtras;

import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 * Realizar un algoritmo que calcule la suma de todos los elementos de un 
 * vector de tamaño N, con los valores ingresados por el usuario.
 * 
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese Tamaño de Vector:");
        int N=leer.nextInt();
        int vector[]=new int[N];
        
        int suma=0;
        for (int i = 0; i< vector.length; i++) {
            System.out.print("Ingrese Numero vector["+i+"]: ");
            vector[i]=leer.nextInt();
            suma+=vector[i];
        }
        
        System.out.println("La Suma de los Nros. es "+suma);
    }
    
}
