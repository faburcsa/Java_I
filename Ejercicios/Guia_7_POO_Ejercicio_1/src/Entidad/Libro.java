/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class Libro {

    private int iSBN;
    private String titulo;
    private String autor;
    private int numPag;

    public Libro() {
    }

    public Libro(int iSBN, String titulo, String autor, int numPag) {
        this.iSBN = iSBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    public void cargarLibro(int iSBN, String titulo, String autor, int numPag) {
//     Crear un método para cargar un
//     libro pidiendo los datos al usuario
        this.iSBN = iSBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    public void mostrarLibro() {
        //informar mediante otro método el
        //número de ISBN, el título, el autor del libro y el número de páginas.
        System.out.println("ISBN:" + this.iSBN);
        System.out.println("Titulo:" + this.titulo);
        System.out.println("Autor:" + this.autor);
        System.out.println("Nro. Paginas:" + this.numPag);
        //Integer.toString(numEntero)
    }

    public int getiSBN() {
        return iSBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setiSBN(int iSBN) {
        this.iSBN = iSBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPag() {
        return numPag;
    }

    @Override
    public String toString() {
        return "Libro{" + "iSBN=" + iSBN + ", titulo=" + titulo + ", autor=" + autor + ", numPag=" + numPag + '}';
    }

}
