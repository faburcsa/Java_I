/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faburcsa.guia13_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * Todas estas operaciones puede tirar excepciones a manejar, el ingreso por
 * teclado puede causar una excepción de tipo InputMismatchException, el método
 * Integer.parseInt() si la cadena no puede convertirse a entero, arroja una
 * NumberFormatException y además, al dividir un número por cero surge una
 * ArithmeticException. Manipule todas las posibles excepciones utilizando
 * bloques try/catch para las distintas excepciones
 */
public class EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese 2 Numeros a Dividir");

        String n1; // Leo como String
        String n2;
        int ni1;
        int ni2;
        
        try {
            n1 = leer.nextLine(); // Leo como String - No se causar error de String
            n2 = leer.nextLine();

            try {
                ni1 = Integer.parseInt(n1); //Trato de Parsear
                ni2 = Integer.parseInt(n2);

                try {
                    System.out.println("Resultado division: " + ( ni1 / ni2)); // Trato de Dividir por si es por 0
                } catch (ArithmeticException e) {
                    System.out.println("Error Division por Zero");
                    System.out.println(e.getMessage());
                }
            } catch (NumberFormatException e) {
                System.out.println("Manejando el Parseint");
            }

        } catch (InputMismatchException e) {
            System.out.println("No Ingreso Texto");
        }

    }

}
