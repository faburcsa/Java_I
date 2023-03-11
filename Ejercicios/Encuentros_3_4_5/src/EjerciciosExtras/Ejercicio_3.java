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
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si
se trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar 
la función equals() de la clase String.*/
        Scanner leer = new Scanner(System.in);
        char letra;
        
        System.out.println("Ingrese letra:");
        letra=leer.next().charAt(0);
        
        switch (Character.toUpperCase(letra)) {
            case 'A':
            case 'E':    
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Es Vocal");
                break;
            default:
                System.out.println("No es Vocal");
        }
    }
    
}
