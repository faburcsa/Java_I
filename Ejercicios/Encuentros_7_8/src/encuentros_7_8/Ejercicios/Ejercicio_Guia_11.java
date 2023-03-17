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
 *
 * Escribir un programa que procese una secuencia de caracteres ingresada por
 * teclado y terminada en punto, y luego codifique la palabra o frase ingresada
 * de la siguiente manera: cada vocal se reemplaza por el carácter que se indica
 * en la tabla y el resto de los caracteres (incluyendo a las vocales
 * acentuadas) se mantienen sin cambios. aeiou
 * @#$%* Realice un subprograma que reciba una secuencia de caracteres y retorne
 * la codificación correspondiente. Utilice la estructura “según” para la
 * transformación. Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a
 * las once y 10. La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s
 * %nc# y 10
 *
 */
public class Ejercicio_Guia_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Frase, debe finalizar en punto (.).");

        String Frase = leer.nextLine();
        int longitud = Frase.length(); //Valido Termine con punto
        String caracter = Frase.substring(longitud-1);

        if (!caracter.equals(".")) {
            System.out.println("Frase No termina con punto, se aborta.");

        } else {
            String fraseCode = codifica(Frase); // Codifico Frase

            System.out.println(fraseCode);
            
            //System.out.println("Limpiar Pantalla");
            //leer.next();
            //clearScreen();
        }

    }

    public static String codifica(String cadena) {
        String codificada = "";
        int longitud = cadena.length();
        String caracter;

        for (int i = 0; i < longitud; i++) {
            caracter = cadena.substring(i, i + 1);
            //System.out.println(caracter);

            switch (caracter.toUpperCase()) {
                case "A":
                case "Á":
                    caracter = "@";
                    break;
                case "E":
                case "É":
                    caracter = "#";
                    break;
                case "I":
                case "Í":
                    caracter = "$";
                    break;
                case "O":
                case "Ó":
                    caracter = "%";
                    break;
                case "U":
                case "Ú":
                    caracter = "*";
                    break;
            }
            codificada = codificada.concat(caracter);
        }

        return codificada;
    }
    
    public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
} 
    
}
