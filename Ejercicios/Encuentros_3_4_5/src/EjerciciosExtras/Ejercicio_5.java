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
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Una obra social tiene tres clases de socios:
        Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
        Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
        Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
        Solicite una letra (carácter) que representa la clase de un socio, y luego 
        un valor real que represente el costo del tratamiento (previo al descuento) y determine el 
        importe en efectivo a pagar por dicho socio.
         */
        char tipoSocio;
        float valor = 0;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tipo de socio A, B o C:");
        tipoSocio = leer.next().charAt(0);
        tipoSocio = Character.toUpperCase(tipoSocio);

        System.out.println("Ingrese costo tratamiento:");
        valor = leer.nextFloat();

        switch (tipoSocio) {
            case 'A':
                System.out.println("Valor Costo, Dto. 50% $" + (valor / 2));
                break;
            case 'B':
                System.out.println("Valor Costo, Dto. 35% $" + (valor - valor * 35 / 100));
                break;
            case 'C':
                System.out.println("A pagar la plata!!!!. $" + valor);
                break;
            default:
                System.out.println("ERROR - Tipo socio Incorrecto.");
        }

    }

}
