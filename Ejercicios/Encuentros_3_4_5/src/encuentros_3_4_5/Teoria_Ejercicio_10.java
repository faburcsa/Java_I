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
public class Teoria_Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado 
        seguido de tantos asteriscos como indique su valor. Por ejemplo:
        5 *****
        3 ***
        11 ***********
        2 **
        */
        Scanner leer = new Scanner(System.in);
        int nro;
        
        for (int i = 1; i<=4; i++) {
            System.out.println("Ingrese un Nro." + i +" ");
            nro=leer.nextInt();
            //System.out.print(nro + " ");
            
            for (int j = 0; j<nro; j++) {
                
                System.out.print("*");  
            }
             System.out.println("");
            
        }

    }
    
}
