/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia9.servicios;

import guia9.entidades.Curso;
import guia9.entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class CursoService {

    public static ArrayList<Alumno> alumnosArray = new ArrayList();
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private static void cargarAlumnos(Curso c) {
        /*  * Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos 
            * que asisten a las clases. Nosotros nos encargaremos de almacenar esta información 
            * en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el nombre de cada alumno.*/
        System.out.println("CARGA DE ALUMNOS:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese Nombre Alumno " + (i + 1) + " :");

            Alumno a1 = new Alumno();
            a1.setNombre(leer.next());
            alumnosArray.add(a1);
        }

        c.setAlumnos(alumnosArray);
    }

    public static void crearCurso(Curso c) {
        /* Método crearCurso(): el método crear curso, le pide los valores de los
        * atributos al usuario y después se le asignan a sus respectivos atributos para
        * llenar el objeto Curso. En este método invocamos al método cargarAlumnos()
        * para asignarle valor al atributo alumnos*/

        System.out.println("NOMBRE DE CURSO:");
        c.setNombreCurso(leer.next());
        System.out.println("CANT. HORAS POR DIA:");
        c.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("CANT. DIAS A LA SEMANA:");
        c.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("PRECIO POR HORA:");
        c.setPrecioPorHora(leer.nextFloat());

        boolean flag = true;
        while (flag) {
            System.out.println("INGRESE TURNO MAÑANA o TARDE (M o T):");
            String turno = leer.next();

            if (turno.equalsIgnoreCase("M") || turno.equalsIgnoreCase("T")) {
                flag = false;
                c.setTurno(turno);
            }
        }

        cargarAlumnos(c);
    }

    public static void calcularGananciaSemanal(Curso c) {
        /* Método calcularGananciaSemanal(): este método se encarga de calcular la
     * ganancia en una semana por curso. Para ello, se deben multiplicar la cantidad
     * de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de
     * días a la semana que se repite el encuentro.*/
        int dias = c.getCantidadDiasPorSemana();
        float precio = c.getPrecioPorHora();
        int horas = c.getCantidadHorasPorDia();

        System.out.println("Ganancia Semanal $" + (dias * horas * precio));
    }
}
