/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enumeraciones.Palos;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class Carta {
    private Integer nro;
    private Palos palo;

    public Carta() {
    }

    public Carta(Integer nro, Palos palo) {
        this.nro = nro;
        this.palo = palo;
    }

    public Integer getNro() {
        return nro;
    }

    public void setNro(Integer nro) {
        this.nro = nro;
    }

    public Palos getPalo() {
        return palo;
    }

    public void setPalo(Palos palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "nro=" + nro + ", palo=" + palo + '}';
    }
    
    
}
