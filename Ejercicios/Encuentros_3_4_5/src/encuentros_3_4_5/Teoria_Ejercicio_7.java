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
public class  Teoria_Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    	Scanner leer = new Scanner(System.in);

    	int tipoMotor;

    	System.out.println("Ingrese una opción (1 al 4)");

    	tipoMotor  = leer.nextInt();

    	switch (tipoMotor) {
        	case 1:
           System.out.println("La bomba es una bomba de agua");
           break;

        	case 2:
           System.out.println("La bomba es una bomba de gasolina");
            break;
            
        	case 3:
           System.out.println("La bomba es una bomba de hormigón");
            break;
            
        	case 4:
           System.out.println("La bomba es una bomba de pasta alimenticia");
            break;

        	default:
           System.out.println("No existe un valor válido para tipo de bomba.");
    	}

    }
    
}
