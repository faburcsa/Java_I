/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentros_9_10_11;

import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia Crea un vector llamado ‘Equipo’ cuya dimensión
 * sea la cantidad de compañeros de equipo y define su tipo de dato de tal
 * manera que te permita alojar sus nombres más adelante.
 *
 * Ejercicio 14 Utilizando un Bucle for, aloja en el vector Equipo, los nombres
 * de tus compañeros de equipo
 *
 */
public class Ejercicio_Guia_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Tipo  Nombre[] = Dimension;
        Scanner leer = new Scanner(System.in);
        String equipo[] = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese Nombre para posicion equipo[" + i + "]");
            equipo[i] = leer.nextLine();
        }
        
        // Muestro la Vector
        for (int i = 0; i < 3; i++) {
            System.out.print("[" + equipo[i] + "]");
        }
        System.out.println("");
    }
}
