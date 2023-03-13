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
 * Escribir un programa que lea un número entero y devuelva el número de dígitos
 * que componen ese número. Por ejemplo, si introducimos el número 12345 , el
 * programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
 * utilizando el operador de división. Nota: recordar que las variables de tipo
 * entero truncan los números o resultados.
 *
 */
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un Nro.");
        int num = leer.nextInt();
        int count = 0;
        
        while (num>0) {
            num=num/10;
            //System.out.println(num);
            count++;
            
        }
        System.out.println("La Cant. de digitos que componen el Nro. ingresado es "+count);
    }

}
