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
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments Escriba un programa que averigüe
     * si dos vectores de N enteros son iguales (la comparación deberá detenerse
     * en cuanto se detecte alguna diferencia entre los elementos).
     *
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese Tamaño de Vector:");
        int N = leer.nextInt();
        int vector1[] = new int[N];
        int vector2[] = new int[N];

        //Relleno Vectores en forma aleatoria
        for (int i = 0; i < N; i++) {
            vector1[i] = (int) (Math.random() * 10);
            vector2[i] = (int) (Math.random() * 10);
        }

        //Comprobacion
        boolean flag = true;
        for (int i = 0; i < N; i++) {
            if (vector1[i] != vector2[i]) {
                flag = false;
                break;
            }

        }
        if (flag) {
            System.out.println("Los vectores son Iguales.");
        } else {
            System.out.println("los vectores NO son iguales.");
        }

        //Muestro Vectores
        //Vector 1
        for (int elemento : vector1) {
            System.out.print("[" + elemento + "]");
        }
        System.out.println("");
        //Vector 2
        for (int elemento : vector2) {
            System.out.print("[" + elemento + "]");
        }
        System.out.println("");
    }

}
