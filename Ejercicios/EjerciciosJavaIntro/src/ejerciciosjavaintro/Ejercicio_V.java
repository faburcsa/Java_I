/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjavaintro;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author fabia
 */
public class Ejercicio_V {
    public static void main(String[] args) {
        System.out.println("Ejercicio V");
        /*Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
        el triple y la raíz cuadrada de ese número. 
        Nota: investigar la función Math.sqrt().*/
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un Nro.");
        int nro=leer.nextInt();
        
        System.out.println("El doble de "+nro+" es "+ (nro+nro));
        System.out.println("El triple de "+nro+" es "+ (nro*3));
        System.out.println("La raiz cuadrada de "+nro+" es "+ (sqrt(nro)));
    }
}
