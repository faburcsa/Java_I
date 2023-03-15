/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentros_7_8.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 * Crea un procedimiento EsMultiplo que reciba los dos números pasados por el 
 * usuario, validando que el primer número múltiplo del segundo e imprima si el
 * primer número es múltiplo del segundo, sino informe que no lo son.
 */
public class Ejercicio_Guia_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 Nros.:");
        int n1=leer.nextInt();
        int n2=leer.nextInt();
        
        EsMultiplo(n1, n2);
    }
    
    public static void EsMultiplo(int nro1, int nro2){ 
        if (nro1%nro2 == 0) {
            System.out.println(nro1 + " Es Multiplo de " + nro2);
        } else {
            System.out.println(nro1 + " NO Es Multiplo de " + nro2);
        }
        
    }
    
}
