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
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realice un programa que calcule y visualice el valor máximo, el valor
        mínimo y el promedio de n números (n>0). El valor de n se solicitará al
        principio del programa y los números serán introducidos por el usuario.
        Realice dos versiones del programa, una usando el bucle “while” y otra
        con el bucle “do - while”.*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese valor de N");
        
        //while
        int N=leer.nextInt();
        int nro, minimo=0,maximo=0,sumaProm=0;
        int cont=1;
        
        while (cont<=N) {
            System.out.println("Ingrese un Nro."+cont+" :");
            nro=leer.nextInt();
            sumaProm+=nro;
            
            if ( nro < minimo || cont==1 ) {
                minimo=nro;
            }
            if (nro > maximo) {
                maximo=nro;
            }
            cont++;
            
        }
        System.out.println("EL Nro. Minimo ingresado es: "+minimo);
        System.out.println("EL Nro. Maximo ingresado es: "+maximo);
        System.out.println("El promedio es: "+(sumaProm/N));
        
        
        
        // do while
        System.out.println("Ingrese valor de N");
        N=leer.nextInt();
        minimo=0;
        maximo=0;
        sumaProm=0;
        cont=1;
        do {
            System.out.println("Ingrese un Nro."+cont+" :");
            nro=leer.nextInt();
            sumaProm+=nro;
            
            if ( nro < minimo || cont==1 ) {
                minimo=nro;
            }
            if (nro > maximo) {
                maximo=nro;
            }
            cont++;
            
        } while (cont<=N);
        System.out.println("EL Nro. Minimo ingresado es: "+minimo);
        System.out.println("EL Nro. Maximo ingresado es: "+maximo);
        System.out.println("El promedio es: "+(sumaProm/N));
        
    }
    
}
