/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtras;

import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia Realice un programa para que el usuario adivine
 * el resultado de una multiplicación entre dos números generados aleatoriamente
 * entre 0 y 10. El programa debe indicar al usuario si su respuesta es o no
 * correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario
 * ingresar su respuesta nuevamente. Para realizar este ejercicio investigue
 * como utilizar la función Math.random() de Java.
 *
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nro1 = (int) (Math.random() * 11);
        int nro2 = (int) (Math.random() * 11);

        int adivina = nro1 * nro2;
        int result=0;
        
        do {
            System.out.println("Adivine el Resultado::");
            result = leer.nextInt();
            //System.out.println(nro1 +" * "+nro2);
            
        } while ( adivina != result );

        System.out.println("ADIVINASTE!!!");
        System.out.println(nro1 +" * "+nro2+" = "+ result);
    }

}
