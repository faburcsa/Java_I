/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enumeraciones.TipoGym;

/**
 *
 * @author Fabian M. Urchueguia Hotel ***** Cantidad de Habitaciones, Número de
 * camas, Cantidad de Pisos, Gimnasio, Nombre del Restaurante, Capacidad del
 * Restaurante, Cantidad Salones de Conferencia, Cantidad de Suites, Cantidad de
 * Limosinas, Precio de las Habitaciones.
 *
 */
public final class Hotel5 extends Hotel4 {

    protected int cantSalonConf;
    protected int cantSuites;
    protected int cantLimusinas;

    public Hotel5(int cantSalonConf, int cantSuites, int cantLimusinas, TipoGym Gimnasio, String nombreRestaurante, int capacidadRestaurante, int cantHabitaciones, int nroCamas, int nroPisos, String nombre, String direccion, String localidad, String encargado) {
        super(Gimnasio, nombreRestaurante, capacidadRestaurante, cantHabitaciones, nroCamas, nroPisos, nombre, direccion, localidad, encargado);
        this.cantSalonConf = cantSalonConf;
        this.cantSuites = cantSuites;
        this.cantLimusinas = cantLimusinas;
    }

    public int getCantSalonConf() {
        return cantSalonConf;
    }

    public void setCantSalonConf(int cantSalonConf) {
        this.cantSalonConf = cantSalonConf;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimusinas() {
        return cantLimusinas;
    }

    public void setCantLimusinas(int cantLimusinas) {
        this.cantLimusinas = cantLimusinas;
    }

    @Override
    public String toString() {
        return super.toString() + "Hotel5{" + "cantSalonConf=" + cantSalonConf + ", cantSuites=" + cantSuites + ", cantLimusinas=" + cantLimusinas + '}';
    }

    @Override
    public float precioHabitacion() {
        super.precioHabitacion();
        /**
         * Valor agregado por las limosinas: • $15 por la cantidad de limosinas
         * del hotel.
         */
        System.out.println("Limusinas = " + this.cantLimusinas + " - Plus $" + (15 * this.cantLimusinas));
        this.precio += 15 * this.cantLimusinas;

        return this.precio;
    }

}
