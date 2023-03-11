/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentros_3_4_5;

import java.util.Scanner;

/**
 * Realizar un programa que pida dos números enteros positivos por teclado y
 * muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y
 * el programa deberá mostrar el resultado por pantalla y luego volver al menú.
 * El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta
 * que, si el usuario selecciona la opción 5, en vez de salir del programa
 * directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
 * seguro que desea salir del programa (S/N)? Si el usuario selecciona el
 * carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el
 * menú.
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        boolean flag = false;

        System.out.println("Ingrese 2 nros. positivos:");
        int nro1 = leer.nextInt();
        int nro2 = leer.nextInt();

        while (flag != true) {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. SALIR");
            System.out.println("Elija Opcion:");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(nro1 + "+" + nro2 + "=" + (nro1 + nro2));
                    break;
                case 2:
                    System.out.println(nro1 + "-" + nro2 + "=" + (nro1 - nro2));
                    break;
                case 3:
                    System.out.println(nro1 + "*" + nro2 + "=" + (nro1 * nro2));
                    break;
                case 4:
                    System.out.println(nro1 + "/" + nro2 + "=" + (nro1 / nro2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    char resp;
                    resp = leer.next().charAt(0);
                    if ( Character.toUpperCase(resp) == "S".charAt(0)) {
                        flag = true;
                    }
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        }
    }

}
