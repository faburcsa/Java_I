/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia9.entidades;

import java.util.ArrayList;

/**
 *
 * @author Fabian M. Urchueguia
 * * crearemos una clase entidad llamada Curso, cuyos atributos serán: 
* nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde),  
* precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión 5 (cinco),
* donde se alojarán los nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
Un constructor por defecto.
Un constructor con todos los atributos como parámetro.
* 
Métodos getters y setters de cada atributo.

 */
public class Curso {
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private float precioPorHora;
    private ArrayList<Alumno> Alumnos;

    public Curso() {
        //Constructor crea el arraylist vacio con objetos tipo Receta
        this.Alumnos = new ArrayList();
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, float precioPorHora, ArrayList<Alumno> Alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.Alumnos = Alumnos;
    }



    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public float getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(float precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public ArrayList<Alumno> getAlumnos() {
        return Alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> Alumnos) {
        this.Alumnos = Alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso 
                + ", cantidadHorasPorDia=" + cantidadHorasPorDia 
                + ", cantidadDiasPorSemana=" + cantidadDiasPorSemana 
                + ", turno=" + turno + ", precioPorHora=" 
                + precioPorHora 
                + "\n Alumnos=" + Alumnos + '}';
    }

    
}
