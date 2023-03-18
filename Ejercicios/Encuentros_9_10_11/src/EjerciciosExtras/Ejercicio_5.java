/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtras;

import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia Realizar un programa que llene una matriz de
 * tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Tamaño N:");
        int N = leer.nextInt();
        System.out.println("Ingrese Tamaño M:");
        int M = leer.nextInt();

        int matriz[][] = new int[N][M];

        int suma = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                suma += matriz[i][j];
            }
        }

        //Muestro Matriz
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println("");
        }

        System.out.println("La suma de los elementos es " + suma);
    }

}
