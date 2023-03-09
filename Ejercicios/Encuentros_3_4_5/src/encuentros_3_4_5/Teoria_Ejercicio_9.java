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
public class Teoria_Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa que lea 20 números. Si el número leído es igual a 
        cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".  
        El programa deberá calcular y mostrar el resultado de la suma de los números leídos, 
        pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
        */
        Scanner leer = new Scanner(System.in);
        int num;
        int cont=1;
        int suma=0;
        
        do {
            System.out.println("Ingrese Nro. " + cont);
            num=leer.nextInt();
            if (num==0) {
                System.out.println("Se capturo el numero cero");
                break;
            }
            
            cont++;
            
            if (num<0) {
                System.out.println("Nro Negativo no se suma");
                continue;
            }
            suma=suma+num;
            
        } while (cont<21);
        
        System.out.println("La Sua es "+suma);
    }
    
}
