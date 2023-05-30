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
public final class Yate extends BarcoMotor{
    protected int nroCamarotes;

    public Yate() {

    }

    public Yate(int nroCamarotes, Integer CV, String matricula, Float esloraMts, LocalDate anioFabricacion) {
        super(CV, matricula, esloraMts, anioFabricacion);
        this.nroCamarotes = nroCamarotes;
    }

    public int getNroCamarotes() {
        return nroCamarotes;
    }

    public void setNroCamarotes(int nroCamarotes) {
        this.nroCamarotes = nroCamarotes;
    }

    @Override
    public String toString() {
        return super.toString()+"{" + "nroCamarotes=" + nroCamarotes + '}';
    }

    
    
    
}
