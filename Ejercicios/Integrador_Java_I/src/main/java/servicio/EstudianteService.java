/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Estudiante;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 *
 *  * Calcular y mostrar el promedio de notas de todo el curso Retornar otro
 * arreglo con los nombre de los alumnos que recibieron una nota mayor al
 * promedio del curso Por último, deberemos mostrar todos los estudiantes con
 * una nota mayor al promedio.
 *
 * Nota: para crear un vector de objetos la definición es la siguiente: Objeto
 * nombreVector[] = new Objeto[];
 */
public class EstudianteService {
    
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static Estudiante crearEstudiante() {
        System.out.println("Ingrese Nombre Estudiante:");
        String nombre = leer.next();
        System.out.println("Ingrese Nota Final Estudiante:");
        float nota = leer.nextFloat();
        
        return new Estudiante(nombre, nota);
    }
    
    public static double promedio(Estudiante e[]) {
        double sumar = 0;
        
        for (Estudiante eTmp : e) {
            sumar += eTmp.getNota();
        }
        
        return sumar / 8;
    }
    
    public static ArrayList mostrarMayorPromedio(Estudiante e[]) {
        double promedioTotal = promedio(e);
        //Estudiante eMayor[]=new Estudiante[e.length];
        ArrayList<Estudiante> EstudianteList = new ArrayList();
        
        for (Estudiante eTmp : e) {
            if (eTmp.getNota() > promedioTotal) {
                //System.out.println(eTmp.getNombre());
                EstudianteList.add(eTmp);
            }
        }
        
        System.out.println(EstudianteList.toString());
        return EstudianteList;
    }
}
