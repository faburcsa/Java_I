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
 * 
 * Crear un programa que dibuje una escalera de números, donde cada línea de
 * números comience en uno y termine en el número de la línea. Solicitar la 
 * altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el 
 * número 3:
1
12
123

 */
public class Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un Nro.");
        int num = leer.nextInt();
        System.out.println("    ");
        
        for (int i = 0; i < num; i++) {
            int count=1;
            for (int j = 0; j <= i; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println("");
        }
    }
    
}
