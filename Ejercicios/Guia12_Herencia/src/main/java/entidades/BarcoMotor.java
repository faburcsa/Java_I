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
public class BarcoMotor extends Barco{
    protected Integer CV;

    public BarcoMotor() {
    }

    public BarcoMotor(Integer CV, String matricula, Float esloraMts, LocalDate anioFabricacion) {
        super(matricula, esloraMts, anioFabricacion);
        this.CV = CV;
    }



    public Integer getCV() {
        return CV;
    }

    public void setCV(Integer CV) {
        this.CV = CV;
    }

    @Override
    public String toString() {
        return super.toString()+"{" + "CV=" + CV + '}';
    }
    
    
}
