/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;

/**
 *
 * @author Fabian M. Urchueguia
 */
public final class Velero extends Barco {
    protected int nroMastiles;

    public Velero() {
    }

    public Velero(int nroMastiles, String matricula, Float esloraMts, LocalDate anioFabricacion) {
        super(matricula, esloraMts, anioFabricacion);
        this.nroMastiles = nroMastiles;
    }

    public int getNroMastiles() {
        return nroMastiles;
    }

    public void setNroMastiles(int nroMastiles) {
        this.nroMastiles = nroMastiles;
    }

    @Override
    public String toString() {
        return super.toString()+"{" + "nroMastiles=" + nroMastiles + '}';
    }
    
    
}
