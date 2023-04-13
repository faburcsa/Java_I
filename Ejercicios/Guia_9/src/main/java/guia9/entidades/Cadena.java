/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia9.entidades;

/**
 *
 * @author Fabian M. Urchueguia
 * 
 * Realizar una clase llamada Cadena, en el paquete
 * de entidades, que tenga como atributos una frase (String) y su longitud.
 * Agregar constructor vacío y con atributo frase solamente. Agregar getters y
 * setters. El constructor con frase como atributo debe setear la longitud de la
 * frase de manera automática. 
 * 
 */
public class Cadena {
    private String frase;
    private int longitudFrase;

    public Cadena(String frase) {
        this.frase = frase;
        this.longitudFrase = frase.length();
    }

    public Cadena() {
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitudFrase() {
        return longitudFrase;
    }

    public void setLongitudFrase(int longitudFrase) {
        this.longitudFrase = longitudFrase;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitudFrase=" + longitudFrase + '}';
    }
    
    
}
