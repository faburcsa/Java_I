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
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir
 * entre sumar, restar, multiplicar y dividir. La aplicación debe tener una
 * función para cada operación matemática y deben devolver sus resultados para
 * imprimirlos en el main.
 */
public class Ejercicio_1 {

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
                    System.out.println(suma(nro1, nro2));
                    break;
                case 2:
                    System.out.println(resta(nro1, nro2));
                    break;
                case 3:
                    System.out.println(multi(nro1, nro2));
                    break;
                case 4:
                    System.out.println(divi(nro1, nro2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    char resp;
                    resp = leer.next().charAt(0);
                    if (Character.toUpperCase(resp) == "S".charAt(0)) {
                        flag = true;
                    }
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        }
    }

    static public int suma(int n1, int n2) {
        int res = n1 + n2;
        return res;
    }

    static public int resta(int n1, int n2) {
        int res = n1 - n2;
        return res;
    }

    static public int multi(int n1, int n2) {
        int res = n1 * n2;
        return res;
    }

    static public int divi(int n1, int n2) {
        int res=0;
        try {  
          res = n1 / n2;  
        } catch (Exception ex) {
            System.out.println("No se puede dividir por 0.");
        }
    
            
        return res;
    }

}
