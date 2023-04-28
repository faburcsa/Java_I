/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * Para esto, tendremos una clase Pelicula con el título, director y duración de
 * la película (en horas)
 */
public class Pelicula {

    private String titulo;
    private String director;
    private LocalTime horas;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, LocalTime horas) {
        this.titulo = titulo;
        this.director = director;
        this.horas = horas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalTime getHoras() {
        return horas;
    }

    public void setHoras(LocalTime horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", horas=" + horas.format(DateTimeFormatter.ofPattern("HH:mm:ss")) + '}';
    }

}
