/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia9.entidades;

import java.util.Date;

/**
 *
 * @author Fabian M. Urchueguia
 * 
 * Implemente la clase Persona en el paquete entidades. 
 * Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), 
 * constructor vacío, constructor parametrizado, get y set. 
 * 
 */
public class Persona {
    private String nombre;
    private Date fechNac;

    public Persona() {
    }

    public Persona(String nombre, Date fechNac) {
        this.nombre = nombre;
        this.fechNac = fechNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechNac() {
        return fechNac;
    }

    public void setFechNac(Date fechNac) {
        this.fechNac = fechNac;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechNac=" + fechNac + '}';
    }
    
    
}
