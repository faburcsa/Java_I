/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package integrador_java_i;

import entidad.Estudiante;
import servicio.EstudianteService;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * Ejercicio integrador Una escuela ha terminado su ciclo lectivo y todos sus
 * alumnos ya rindieron el examen final. La escuela nos ha pedido que calculemos
 * el promedio de notas final de todos sus alumnos y saber qué alumnos han
 * recibido una nota por encima de ese promedio.
 *
 * Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos
 * van a ser nombre y nota (representando la nota obtenida en el final).
 *
 * La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los
 * 8 estudiantes con sus respectivas notas. Una vez creado los estudiantes
 * deberemos guardar los estudiantes en un arreglo de objetos tipo Estudiante,
 * usando ese arreglo tenemos que realizar las dos tareas que nos ha pedido la
 * escuela. 
 * 
 * Calcular y mostrar el promedio de notas de todo el curso Retornar
 * otro arreglo con los nombre de los alumnos que recibieron una nota mayor al
 * promedio del curso Por último, deberemos mostrar todos los estudiantes con
 * una nota mayor al promedio.
 *
 * Nota: para crear un vector de objetos la definición es la siguiente: Objeto
 * nombreVector[] = new Objeto[];
 *
 *
 */
public class Integrador_Java_I {

    public static void main(String[] args) {
        Estudiante Estudiantes[]=new Estudiante[8];
        
//        for (int i = 0; i < 8; i++) {
//            Estudiantes[i]=EstudianteService.crearEstudiante();
//        }
//        
//        System.out.println("El promedio de las notas es:");
//        System.out.println(EstudianteService.promedio(Estudiantes));
//        
//        System.out.println("Estudiantes con Notas mayor al Promedio:");
//        EstudianteService.mostrarMayorPromedio(Estudiantes);
        
        for (int i = 2; i <= 128; i*=2) {
            System.out.println(i);
        }
    }
}
