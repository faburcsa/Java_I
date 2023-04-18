/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_9;

import guia9.entidades.Curso;
import guia9.servicios.CursoService;

/**
 *
 * @author Fabian M. Urchueguia
 * Uso de vectores como atributos de clase
 * Un profesor particular está dando cursos para grupos de cinco alumnos y necesita 
 * un programa para organizar la información de cada curso. Para ello,
 */
public class Ejercicio_VI_VectoresAtributoClase {

    public static void main(String[] args) {
        // TODO code application logic here
        //CursoService cs = new CursoService();
        Curso c = new Curso();
        
        CursoService.crearCurso(c);
        
        System.out.println(c);
        
        CursoService.calcularGananciaSemanal(c);
    }
    
}
