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
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     *
     * Los profesores del curso de programación de Egg necesitan llevar un
     * registro de las notas adquiridas por sus 10 alumnos para luego obtener
     * una cantidad de aprobados y desaprobados. Durante el período de cursado
     * cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por
     * parciales. Las ponderaciones de cada nota son:
     *
     * Primer trabajo práctico evaluativo 10% Segundo trabajo práctico
     * evaluativo 15% Primer Integrador 25% Segundo integrador 50%
     *
     * Una vez cargadas las notas, se calcula el promedio y se guarda en el
     * arreglo. Al final del programa los profesores necesitan obtener por
     * pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que
     * solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas
     * del curso.
     *
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        double[] vec = new double[3]; // deberian ser 10

        double promedio = 0;
        int aprobados = 0;
        int desaprobados = 0;
        for (int i = 0; i < vec.length; i++) {

            //vec[i] = ((Math.random()) * 10) * 0.1 + ((Math.random()) * 10) * 0.15 + ((Math.random()) * 10) * 0.25 + ((Math.random()) * 10) * 0.5;
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingresa la nota " + (j + 1) + " del alumno " + (i + 1)+": ");
                vec[i] += leer.nextDouble();
            }
            vec[i] /= 4;
            
            System.out.println("Promedio Notas Alumno "+(i+1)+": [" + vec[i] + "]");
            if (vec[i] >= 7) {

                aprobados++;
            } else {

                desaprobados++;
            }
        }
        System.out.println("");

        System.out.println("Aprobados: " + aprobados);
        System.out.println("Desaprobados: " + desaprobados);

    }

}
