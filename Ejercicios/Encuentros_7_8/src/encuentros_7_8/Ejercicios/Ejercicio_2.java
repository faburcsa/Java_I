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
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los
 * datos de las personas ingresadas por teclado e indique si son mayores o
 * menores de edad.
 *
 * Después de cada persona, el programa debe preguntarle al usuario si quiere
 * seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantas Personas va a Ingresar");
        int N = leer.nextInt();

        checkedad(N);
    }

    public static void checkedad(int N) {
        String respuesta;
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese Nombre Persona " + (i+1));
            String persona = leer.nextLine();
            System.out.println("Ingrese Edad Persona de " + persona);
            int edad = leer.nextInt();

            
            if (edad >= 18) {
                System.out.println(persona+" tiene "+edad+" años. Es Mayor.");
            } else {
                System.out.println(persona+" tiene "+edad+" años. Es Menor.");
            }
            
            System.out.println("Desea seguir mostrando personas?");
            leer.nextLine(); // Esto limpia el buffer del Scanner porque sino toma como respuesta lo anterior
                        // https://www.clasesdeinformaticaweb.com/java-desde-cero/el-buffer-de-la-clase-scanner/
            
            respuesta=leer.nextLine();
            
            if (respuesta.equals("No")) {
                break;
            }
        }

    }
}
