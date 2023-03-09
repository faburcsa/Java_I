/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentros_3_4_5;

import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class Teoria_Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escriba un programa que valide si una nota está entre 0 y 10, sino está 
        //entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

        Scanner leer = new Scanner(System.in);
        int nota;
        System.out.println("Ingrese Nota");
        nota = leer.nextInt();

        while (nota <= 0 || nota >= 10) {
            System.out.println("Nota fuera de Rango, Ingrese otra");
            nota = leer.nextInt();
        }
        
        System.out.println("Nota Ingresada "+nota);

    }

}
