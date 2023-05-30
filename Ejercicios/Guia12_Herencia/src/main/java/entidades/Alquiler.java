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
public class Alquiler {

    public int dni;
    public String nombreCliente;
    public LocalDate fechaAlquiler;
    public LocalDate fechaDevolucion;
    public int posAmarre;
    public Barco barcoSeleccion;

    public Alquiler() {
    }

    public Alquiler(int dni, String nombreCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posAmarre, Barco barcoSeleccion) {
        this.dni = dni;
        this.nombreCliente = nombreCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posAmarre = posAmarre;
        this.barcoSeleccion = barcoSeleccion;
    }
    
    


    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(int posAmarre) {
        this.posAmarre = posAmarre;
    }

    public Barco getBarcoSeleccion() {
        return barcoSeleccion;
    }

    public void setBarcoSeleccion(Barco barcoSeleccion) {
        this.barcoSeleccion = barcoSeleccion;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "dni=" + dni + ", nombreCliente=" + nombreCliente + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posAmarre=" + posAmarre + ", barcoSeleccion=" + barcoSeleccion + '}';
    }

}
