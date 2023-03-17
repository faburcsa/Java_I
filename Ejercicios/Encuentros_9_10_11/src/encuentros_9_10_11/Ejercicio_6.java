/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentros_9_10_11;

import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
 * crear un programa que permita introducir un cuadrado por teclado y determine
 * si este cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9.
 *
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bufEntrada = new Scanner(System.in);
        int c;
        int cont;
        int ct;
        int f;
        boolean flag;
        int i;
        int j;
        int matriz[][];
        int n;
        int suma;
        int vsumas[];
        // Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas) que
        // tiene como propiedad especial que la suma de las filas, las columnas y las diagonales es igual.
        // Por ejemplo:
        // 2 7 6
        // 9 5 1
        // 4 3 8
        // En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir un algo-
        // ritmo que compruebe si una matriz de datos enteros es mágica o no, y en caso de que sea
        // mágica escribir la suma. Además, el programa deberá comprobar que los números introduci-
        // dos son correctos, es decir, están entre el 1 y el 9. El usuario ingresa el tamaño de la matriz
        // que no debe superar orden igual a 10.
        suma = 0;
        flag = true;
        //System.out.println(" Ingrese la cantidad de filas : ");
        //f = bufEntrada.nextInt();
        f=3;
        // escribir " Ingrese la cantidad de columnas : " 
        // leer c
        c = f;
        cont = 0;
        matriz = new int[f][c];
        n = f * 2 + 2;
        vsumas = new int[n];
        
        // Verifico que sea Matriz cuadrada y tamaño menor a 10 de la matriz
        if (f == c && f < 10) {
            // Relleno la Matriz automaticamente para velocidad Test
            for (i = 0; i <= f - 1; i++) {
                for (j = 0; j <= c - 1; j++) {
                    System.out.print(" Ingrese valor matriz["+i+"]["+j+"]: ");
                    matriz[i][j] = bufEntrada.nextInt();
                    //matriz[i][j] = (int) (Math.random()*9);
                }
            }
            
            // Muestro Matriz
            for (i = 0; i <= f - 1; i++) {
                for (j = 0; j <= c - 1; j++) {
                    System.out.print("[" + matriz[i][j] + "]");
                }
                System.out.println(" ");
            }
            
            // Control Filas
            for (i = 0; i <= f - 1; i++) {
                suma = 0;
                for (j = 0; j <= c - 1; j++) {
                    suma = suma + matriz[i][j];
                }
                System.out.println(" La fila " + i + " suma : " + suma);
                vsumas[cont] = suma;
                cont = cont + 1;
            }
            
            // Control Columnas
            for (i = 0; i <= f - 1; i++) {
                suma = 0;
                for (j = 0; j <= c - 1; j++) {
                    suma = suma + matriz[j][i];
                }
                System.out.println(" La columna " + i + " suma : " + suma);
                vsumas[cont] = suma;
                cont = cont + 1;
            }
            suma = 0;
            
            // Control Diagonal Principal
            for (i = 0; i <= f - 1; i++) {
                for (j = 0; j <= c - 1; j++) {
                    if (i == j) {
                        suma = suma + matriz[i][j];
                    }
                }
            }
            System.out.println(" La suma de los valores de la diagonal principal es : " + suma);
            vsumas[cont] = suma;
            cont = cont + 1;
            suma = 0;
            ct = f - 1;
            // Control Diagonal Secundaria
            for (i = 0; i <= f - 1; i++) {
                for (j = 0; j <= c - 1; j++) {
                    if (i == j) {
                        suma = suma + matriz[i][ct];
                    }
                }
                ct = ct - 1;
            }
            System.out.println(" La suma de los valores de la diagonal Secundaria es : " + suma);
            vsumas[cont] = suma;
            cont = cont + 1;
            for (i = 0; i <= n - 1; i++) {
                // escribir sin saltar "[",vSumas(i),"]" // Muestro Vector
                if (i <= n - 2) {
                    // Si un valor difiere del otro en el vector sumas, cambio flag a falso
                    if (vsumas[i] != vsumas[i + 1]) {
                        flag = false;
                    }
                }
            }
            
            if (flag) {
                System.out.println("Es una Matriz Magica!!!!");
            } else {
                System.out.println("No es una Matriz Magica... :(");
            }
        } else {
            System.out.println(" la matriz no es cuadrada o excede el limite de una matriz de 10x10 ");
        }
    }

}
