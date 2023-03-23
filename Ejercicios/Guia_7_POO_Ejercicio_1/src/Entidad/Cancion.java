/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Fabian M. Urchueguia
 * Desarrollar una clase Cancion con los siguientes atributos: título y autor. 

 */
public class Cancion {
    private String titulo;
    private String autor;

    //Se deberá́ definir además dos constructores: uno vacío que inicializa el título 
    // y el autor a cadenas vacías
    public Cancion() {
        this.titulo="";
        this.autor="";
    }

    // Se deberá́ definir además dos constructores: otro que reciba como parámetros el título y el 
    // autor de la canción. 
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    //Se deberán además definir los métodos getters y setters correspondientes.
    public String getTitulo(){
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
