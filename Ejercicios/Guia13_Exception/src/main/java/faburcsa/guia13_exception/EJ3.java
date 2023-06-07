/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faburcsa.guia13_exception;

import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * Defina una clase llamada DivisionNumero. En el método main utilice un Scanner
 * para leer dos números en forma de cadena. A continuación, utilice el método
 * parseInt() de la clase Integer, para convertir las cadenas al tipo int y
 * guardarlas en dos variables de tipo int. Por ultimo realizar una división con
 * los dos numeros y mostrar el resultado.
 *
 */
public class EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese 2 Numeros a Dividir");
        String n1 = leer.next();
        String n2 = leer.next();

        int ni1, ni2;
        ni1 = Integer.parseInt(n1);
        ni2 = Integer.parseInt(n2);

        try {
            System.out.println("Resultado division: " + ((double) ni1 / ni2));

        } catch (Exception e) {

            System.out.println("Error Division por Zero");
            System.out.println(e.getMessage());
        }
    }

}
