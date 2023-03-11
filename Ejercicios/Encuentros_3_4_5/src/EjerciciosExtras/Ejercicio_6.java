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
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Leer la altura de N personas y determinar el promedio de estaturas que 
        se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.*/
        
        Scanner leer = new Scanner(System.in);
        float estatura,promPetiso,promTotal, sumaPetiso=0,sumaTotal=0;
        int N=5, cantPetiso=0;
        
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese Estatura persona "+(i+1)+":");
            estatura=leer.nextFloat();
            
            if (estatura < 1.6) {
                sumaPetiso+=estatura;
                cantPetiso++;
            } 
            sumaTotal+=estatura;
            }
        
        System.out.println("Hay "+cantPetiso+" personas de estatura menor a 1.60, promedio = "+(sumaPetiso/cantPetiso));
        System.out.println("El promedio total es "+sumaTotal/N);
        }
        
    }
