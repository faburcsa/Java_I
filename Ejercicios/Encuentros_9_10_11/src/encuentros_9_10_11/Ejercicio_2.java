/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentros_9_10_11;

import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia Realizar un algoritmo que llene un vector de
 * tamaño N con valores aleatorios y le pida al usuario un número a buscar en el
 * vector. El programa mostrará dónde se encuentra el numero y si se encuentra
 * repetido
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Tamaño Vector");
        int N = leer.nextInt();
        System.out.println("Ingrese Nro. a Buscar");
        int Nro = leer.nextInt();

        int vector[] = new int[N];

        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random() * 10);
        }

        boolean repetido = false;
        boolean existe = false;

        for (int i = 0; i < N; i++) {
            if (vector[i] == Nro) {
                if (existe) {
                    repetido = true;
                }
                System.out.println("Nro." + Nro + " encontrado en la posicion " + i);
                existe = true;
            }

        }
        if (repetido) {
            System.out.println("Nro. Repetido");
        }

        if (!existe) {
            System.out.println("No Existe el Nro");
        }
    }

}
