/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtras;

import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia Construya un programa que lea 5 palabras de
 * mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando,
 * construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres.
 * Las palabras se ubicarán todas en orden horizontal en una fila que será
 * seleccionada de manera aleatoria. Una vez concluida la ubicación de las
 * palabras, rellene los espacios no utilizados con un número aleatorio del 0 al
 * 9. Finalmente imprima por pantalla la sopa de letras creada. Nota: Para
 * resolver el ejercicio deberá investigar cómo se utilizan las siguientes
 * funciones de Java substring(), Length() y Math.random().
 *
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String[][] matriz = new String[20][20];
        String palabra = "";
        int cantPalabras = 4;
        int fila = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j] = " ";
            }
        }

        for (int i = 0; i < cantPalabras; i++) {
            do {
                System.out.println("Ingresa una palabra de 3 a 5 caracteres");
                palabra = leer.next();
            } while (palabra.length() < 3 || palabra.length() > 5);
            palabra = palabra.toUpperCase();

            boolean flag = true;
            //System.out.println(palabra);
            while (flag) {
                // fila random
                fila = (int) (Math.random() * 20); // Fila Random

                //verifico si la fila random ya esta ocupada, sino vuelvo a elegir un random
                //hasta que este vacia completa
                for (int j = 0; j < 20; j++) {
                    if (matriz[fila][j].equals(" ")) {
                        flag = false;
                        break;
                    }
                }
            }
            int colum = (int) ((Math.random() * 20 - palabra.length())); // Columna Random

            //System.out.print(fila + " ");
            //System.out.println(colum);
            int count = 0;

            for (int j = 0; j < 20; j++) {
                // Relleno a partir de la columna random
                if (j > colum) {
                    matriz[fila][j] = palabra.substring(count, (count + 1));
                    count++;
                    if (count >= palabra.length()) {
                        break;
                    }
                }

            }
        }

        // Relleno Matriz con Nros. donde NO esta ocupada
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (matriz[i][j].equals(" ")) {
                    int ran = (int) (Math.random() * 2); // 0 y 1
                    matriz[i][j] = Integer.toString(ran);
                }
            }
        }

        //Muestro Matriz Final
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
