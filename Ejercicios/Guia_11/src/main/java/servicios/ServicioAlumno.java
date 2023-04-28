/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * * En el servicio de Alumno deberemos tener un bucle que crea un objeto
 * Alumno.
 *
 * Se pide toda la información al usuario y ese Alumno se guarda en una lista de
 * tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.
 *
 * Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
 * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere
 * calcular su nota final y se lo busca en la lista de Alumnos. Si está en la
 * lista, se llama al método. Dentro del método se usará la lista notas para
 * calcular el promedio final de alumno. Siendo este promedio final, devuelto
 * por el método y mostrado en el main.
 *
 */
public class ServicioAlumno {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static ArrayList<Alumno> alumnoList = new ArrayList();

    public static ArrayList<Alumno> crearAlumnos() {
        String opcion;
        do {
            Alumno a = new Alumno();
            ArrayList<Integer> notas = new ArrayList();
            
            System.out.println("Ingrese Nombre Alumno:");
            a.setNombre(leer.next());

            //Cargo Notas del Alumno
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota Nro. " + (i + 1));
                notas.add(leer.nextInt());
            }
            
            a.setNotas(notas);

            alumnoList.add(a); // Agrego el alumno a la lista de alumnos

            System.out.println("");
            System.out.println("Desea Agregar Otro Alumno S/N?");
            opcion = leer.next().substring(0, 1).toUpperCase();

        } while (opcion.equals("S"));

        return alumnoList;
    }

    public static float notaFinal(ArrayList<Alumno> aSearch) {
        /*Método notaFinal(): El usuario ingresa el nombre del alumno que
        * quiere calcular su nota final y se lo busca en la lista de Alumnos. Si está
        * en la lista, se llama al método. 
        Dentro del método se usará la lista notas
        * para calcular el promedio final de alumno. Siendo este promedio final,
        * devuelto por el método y mostrado en el main.*/

        System.out.println("Ingrese Nombre Alumno: ");
        String nombre = leer.next();
        float suma = 0;

        for (Alumno aList : aSearch) {
            if (aList.getNombre().equals(nombre)) {
                for (int i = 0; i < aList.getNotas().size(); i++) {
                    suma += aList.getNotas().get(i);
                }
            }
        }

        float prom = suma / 3;
        return prom;
    }
}
