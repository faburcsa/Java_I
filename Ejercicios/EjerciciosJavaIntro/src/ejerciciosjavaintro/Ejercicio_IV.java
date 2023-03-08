/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjavaintro;

import java.util.Scanner;

/**
 *
 * @author fabia
 */
public class Ejercicio_IV {
    /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
    La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
    public static void main(String[] args) {
        System.out.println("Ejercicio IV");
        
        System.out.println("Ingrese Grados:");
        Scanner leer=new Scanner(System.in);
        float grados=leer.nextFloat();
        
        float fahrenheit=32+(9 * grados / 5);
        
        System.out.println(grados+" Grados, equivalen a "+fahrenheit+" Fajrenheits");
    }
    
}
