/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class Cancion_2 {

public String titulo;
    public String autor;
/// Constructores
    public Cancion_2() {
        this.autor = "";
        this.titulo = "";
    }

    public Cancion_2(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    /// Metodos gett and sett

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void mostrarDatos(){
        System.out.println("Titulo: "+this.autor);
        System.out.println("El artista es: "+this.autor);
    }
}
