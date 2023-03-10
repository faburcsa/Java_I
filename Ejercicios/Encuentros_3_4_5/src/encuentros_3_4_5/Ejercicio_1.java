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
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un programa que dado un número determine si es par o impar.
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Un nro");
        int num=leer.nextInt();
        
        if (num%2==0) {
            System.out.println("El Nro. es Par");
        } else {
            System.out.println("El Nro. es Impar");
        }
    }
    
}
