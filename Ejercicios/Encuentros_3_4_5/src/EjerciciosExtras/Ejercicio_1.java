/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtras;

import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia Dado un tiempo en minutos, calcular su
 * equivalente en días y horas. Por ejemplo, si el usuario ingresa 1600 minutos,
 * el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tiempo = new Scanner(System.in);
        System.out.println("Ingrese tiempo en minutos:");
        int minutos=tiempo.nextInt();
        
        int dias=0,horas=0;
        
        horas=minutos/60; // Calculo las horas
        dias=horas/24; // Calculo los dias
        horas=horas%24; // calculo si quedan horas
        minutos=minutos%60; // calculo si quedaron minutos
        
        System.out.println(minutos+" minutos equivalen a "+dias+" dias y "+horas+" horas.y "+minutos+" minutos.");
        
    }

}
