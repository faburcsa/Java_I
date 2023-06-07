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
 * Escribir un programa en Java que juegue con el usuario a adivinar un número.
 * La computadora debe generar un número aleatorio entre 1 y 500, y el usuario
 * tiene que intentar adivinarlo. Para ello, cada vez que el usuario introduce
 * un valor, la computadora debe decirle al usuario si el número que tiene que
 * adivinar es mayor o menor que el que ha introducido el usuario. Cuando
 * consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de
 * veces que el usuario ha intentado adivinar el número. Si el usuario introduce
 * algo que no es un número, se debe controlar esa excepción e indicarlo por
 * pantalla. En este último caso también se debe contar el carácter fallido como
 * un intento.
 */
public class EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nroAdivinar = (int) (Math.random() * 501);
        System.out.println("TRAMPA el nro es: " + nroAdivinar);
        int nroUser, contIntentos;
        boolean flag = true;
        contIntentos = 0;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        do {
            System.out.println("Ingrese Nro:");
            try {
                nroUser = leer.nextInt();

                contIntentos += 1;
                if (nroUser != nroAdivinar) {
                    System.out.print("No Adivinaste, reintente");
                    if (nroAdivinar > nroUser) {
                        System.out.println("El Numero a Adivinar es Mayor");
                    } else {
                         System.out.println("El Numero a Adivinar es Menor");
                    }
                } else {
                    flag = false;
                }
            } catch (InputMismatchException e) { //Capturo si lo ingresado no es un Entero
                System.out.println("Excepccion Manejada " + e.toString());
                contIntentos += 1; // Sumo igual un intento
                leer.next(); // Para evitar el looping del scanner
            }
        } while (flag);

        System.out.println("ADIVINASTE!!!!");
        System.out.println("Cant. Intentos " + contIntentos);
    }

}
