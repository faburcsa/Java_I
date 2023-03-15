/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentros_7_8.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 * Crea una aplicación que a través de una función nos convierta una cantidad 
 * de euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 * yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
 * moneda a convertir que será una cadena, este no devolverá ningún valor y 
 * mostrará un mensaje indicando el cambio (void).
* El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double euros;
        String moneda;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad e Euros a convertir: ");
        euros = entrada.nextDouble();

        System.out.print("A que moneda desea convertirla? ");
        entrada.nextLine();
        moneda = entrada.nextLine();
        
        conversorMoneda(euros, moneda);
    }

    public static void conversorMoneda(double cantEuros, String moneda) {
        moneda = moneda.toLowerCase();
        System.out.println(moneda);
        switch(moneda){
            case "libras": 
                System.out.println("La conversion a libras es " + (0.86*cantEuros));
                break;
            case "pesos": 
                System.out.println("La conversion a pesos es " + (1.28611*cantEuros));
                break;
            case "yenes": 
                System.out.println("La conversion a yenes es " + (129.852*cantEuros));
                break;
            default:
                System.out.println("Moneda Incorrecta.");
        }
    }
}
   
