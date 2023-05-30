/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;

/**
 *
 * @author Fabian M. Urchueguia
 * 
 * Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
 */
public class Barco {
    protected String matricula;
    protected Float esloraMts;
    protected LocalDate anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, Float esloraMts, LocalDate anioFabricacion) {
        this.matricula = matricula;
        this.esloraMts = esloraMts;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Float getEsloraMts() {
        return esloraMts;
    }

    public void setEsloraMts(Float esloraMts) {
        this.esloraMts = esloraMts;
    }

    public LocalDate getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(LocalDate anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", esloraMts=" + esloraMts + ", anioFabricacion=" + anioFabricacion + '}';
    }
    
    
    
}
