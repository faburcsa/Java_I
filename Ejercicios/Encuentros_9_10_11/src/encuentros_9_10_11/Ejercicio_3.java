/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentros_9_10_11;

import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia Recorrer un vector de N enteros contabilizando
 * cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5
 * dígitos).
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Tamaño Vector");
        int N = leer.nextInt();

        int vector[] = new int[N];

        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random() * 10000);
            System.out.println(vector[i]);
        }

        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0;
        for (int i = 0; i < N; i++) {
            switch (cuentaCifras(vector[i])) {
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
                case 3:
                    c3++;
                    break;
                case 4:
                    c4++;
                    break;
                case 5:
                    c5++;
                    break;
                default:
                    throw new AssertionError();
            }
        }
        System.out.println("Nros. con 1 Digito: "+c1);
        System.out.println("Nros. con 2 Digito: "+c2);
        System.out.println("Nros. con 3 Digito: "+c3);
        System.out.println("Nros. con 4 Digito: "+c4);
        System.out.println("Nros. con 5 Digito: "+c5);

    }

    public static int cuentaCifras(int num) {
        /*Le damos un número por parámetro.
        Si ese número es 0, devuelvo 1.
        Si no es 0, recorremos del número dividiéndolo entre 10 hasta llegar a 0. 
        Para evitar problemas con negativos, lo pasaremos a absoluto.
        Cada vez que dividamos entre 10, aumentamos en 1 nuestro contador.*/
        int contador = 0;

        if (num == 0) {
            contador = 1;
        } else {

            for (int i = Math.abs(num); i > 0; i /= 10) {
                contador++;
            }

        }

        return contador;
    }
    
     public static int cantdig(int n) {
        int dig=1;
        
        while(n>9){
            n=n/10;
            dig++;
        }
        return dig;
    }

}
