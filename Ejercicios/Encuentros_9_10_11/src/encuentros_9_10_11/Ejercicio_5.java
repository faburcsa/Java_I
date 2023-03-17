/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentros_9_10_11;

/**
 *
 * @author Fabian M. Urchueguia Realice un programa que compruebe si una matriz
 * dada es antisimétrica. Se dice que una matriz A es antisimétrica cuando ésta
 * es igual a su propia traspuesta, pero cambiada de signo. Es decir, A es
 * antisimétrica si A = -AT. La matriz traspuesta de una matriz A se denota por
 * AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][] = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int matrizAnt[][] = {{0, 2, -4}, {-2, 0, -2}, {4, 2, 0}};

        System.out.println("ORIGINAL:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }

        System.out.println("TRANSPUESTA:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizAnt[i][j] + "] ");
            }
            System.out.println("");
        }

        System.out.println("CONTROLAR:");
        boolean flag=true;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ( (matriz[i][j] - matrizAnt[j][i]) != 0) {
                    flag=false;
                    break;
                }
            }
        }
        
        if (flag) {
            System.out.println("Las Matrices son antisimétricas");
        } else {
            System.out.println("Las Matrices NO son antisimétricas");
        }
    }

}
