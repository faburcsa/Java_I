/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentros_3_4_5;

import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 * Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos es mayor a 25.
 */
public class Teoria_Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese Nro. 1");
        int nro1=leer.nextInt();
        
        System.out.println("Ingrese Nro. 2");
        int nro2=leer.nextInt();
        
        if (nro1>25 || nro2>25) {
            if (nro1>25 && nro2>25) {
                System.out.println("Los dos son mayores a 25"); 
            } else {
            System.out.println("Uno de los Numeros es Mayor a 25");   
            }
        } else {
            System.out.println("Ninguno es Mayor");
        }

    }
    
}
