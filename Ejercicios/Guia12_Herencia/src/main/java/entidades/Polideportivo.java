/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enumeraciones.TipoPoli;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado
 * o Abierto, esta clase implementará los dos métodos abstractos y los atributos
 * del padre.
 */
public class Polideportivo extends Edificio {

    protected String nombre;
    protected TipoPoli tipo;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, TipoPoli tipo, float ancho, float alto, float largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    @Override
    public float calcularSuperficie() {
        return this.alto * this.ancho;
    }

    @Override
    public float calcularVolumen() {
        if (this.tipo == TipoPoli.ABIERTO) {
            return 0;
        } else {
            return this.alto * this.ancho * this.alto;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoPoli getTipo() {
        return tipo;
    }

    public void setTipo(TipoPoli tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "Polideportivo{" + "nombre=" + nombre + ", tipo=" + tipo + '}';
    }
    
    

}
