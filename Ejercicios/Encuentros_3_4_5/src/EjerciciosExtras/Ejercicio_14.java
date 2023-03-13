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
 * Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
 * cantidad de hijos. Escriba un programa que pida la cantidad de familias y
 * para cada familia la cantidad de hijos para averiguar la media de edad de los
 * hijos de todas las familias.
 */
public class Ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        int N, M;
        float prom = 0, promTot = 0;
        int edad;
        System.out.println("Ingrese Cant. Familias");
        N = leer.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese Cant. Hijos familia Nro. " + (i + 1));
            M = leer.nextInt();
            for (int j = 0; j < M; j++) {
                edad = (int) (Math.random() * 99);
                System.out.println("Edad Random hijo " + (j + 1) + " es " + edad);
                prom += edad;
            }
            System.out.println("Promedio edad Familia " + (i + 1) + " es " + (prom / M));
            promTot += prom/M;
            prom=0;
        }
        System.out.println("");
        System.out.println("Promedio edad TODAS las familias es " + (promTot / N));
    }

}
