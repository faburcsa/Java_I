/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia9.entidades;

import java.util.Arrays;

/**
 *
 * @author Fabian M. Urchueguia //Juego Ahorcado: Crear una clase Ahorcado (como
 * el juego), la cual deberá contener como atributos, un vector con la palabra a
 * buscar, //la cantidad de letras encontradas y la cantidad jugadas máximas que
 * puede realizar el usuario.
 */
public class Ahorcado {

    private String[] palabra;
    private String[] palabraShow;
    private int cantFound = 0;
    private int cantMaxJuegos;
    private int longitud;

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantMaxJuegos, int longitud) {
        this.palabra = palabra;
        this.cantMaxJuegos = cantMaxJuegos;
        this.longitud = longitud;
        this.palabraShow = new String[palabra.length];
        Arrays.fill(palabraShow, "");
    }

    public String[] getPalabraShow() {
        return palabraShow;
    }

    public void setPalabraShow(String[] palabraShow) {
        this.palabraShow = palabraShow;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantFound() {
        return cantFound;
    }

    public void setCantFound(int cantFound) {
        this.cantFound = cantFound;
    }

    public int getCantMaxJuegos() {
        return cantMaxJuegos;
    }

    public void setCantMaxJuegos(int cantMaxJuegos) {
        this.cantMaxJuegos = cantMaxJuegos;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", cantFound=" + cantFound + ", cantMaxJuegos=" + cantMaxJuegos + '}';
    }

}
