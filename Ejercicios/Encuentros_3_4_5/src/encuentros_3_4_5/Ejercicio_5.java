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
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa en el cual se ingrese un valor limite positivo, 
        y a continuacion solicite numeros al usuario hasta que la suma de los 
        numeros introducidos supere el limite inicial.*/

        Scanner leer = new Scanner(System.in);
        int suma = 0;

        System.out.println("Ingrese un Limite Positivo:");
        int limite = leer.nextInt();

        while (suma < limite) {
            System.out.println("Ingrese un Nro.");
            int nro = leer.nextInt();
            //suma = suma + nro;
            suma+=nro;

        }

        System.out.println("La suma es " + suma);
    }

}
