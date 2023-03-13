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
 * Escriba un programa que lea números enteros. Si el número es múltiplo de
 * cinco debe detener la lectura y mostrar la cantidad de números leídos, la
 * cantidad de números pares y la cantidad de números impares. Al igual que en
 * el ejercicio anterior los números negativos no deben sumarse. Nota: recordar
 * el uso de la sentencia break.
 */
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int par = 0, impar = 0, nro;

        do {
            System.out.println("Ingrese un Nro. (Si es multiplo de 5 termina ejecucion)");
            nro = leer.nextInt();
            if (nro < 0) {
                System.out.println("Nro. Negativo no se cuenta.");
            } else {
                if (nro % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }
        } while ((nro % 5) != 0);
        System.out.println(nro+" es multiplo de 5, salimos...");

        System.out.println("La Cantidad de Nros. Pares es: " + par);
        System.out.println("La Cantidad de Nros. Impares es: " + impar);
    }
}
