/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enumeraciones.TipoGym;

/**
 *
 * @author Fabian M. Urchueguia Hotel **** Cantidad de Habitaciones, Número de
 * camas, Cantidad de Pisos, Gimnasio, Nombre del Restaurante, Capacidad del
 * Restaurante, Precio de las Habitaciones.
 */
public class Hotel4 extends Hotel {

    protected TipoGym Gimnasio;
    protected String nombreRestaurante;
    protected int capacidadRestaurante;

    public Hotel4(TipoGym Gimnasio, String nombreRestaurante, int capacidadRestaurante, int cantHabitaciones, int nroCamas, int nroPisos, String nombre, String direccion, String localidad, String encargado) {
        super(cantHabitaciones, nroCamas, nroPisos, nombre, direccion, localidad, encargado);
        this.Gimnasio = Gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public TipoGym getGimnasio() {
        return Gimnasio;
    }

    public void setGimnasio(TipoGym Gimnasio) {
        this.Gimnasio = Gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public String toString() {
        return super.toString() + "Hotel4{" + "Gimnasio=" + Gimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + '}';
    }

    public float precioHabitacion() {
        System.out.println("Calculando Precio Habitacion Hotel: " + this.nombre);
        /**
         * El precio de una habitación debe calcularse de acuerdo con la
         * siguiente fórmula: PrecioHabitación = $50 + ($1 x capacidad del
         * hotel) + (valor agregado por restaurante) + (valor agregado por
         * gimnasio) + (valor agregado por limosinas). Donde: Valor agregado por
         * el restaurante: • $10 si la capacidad del restaurante es de menos de
         * 30 personas. • $30 si está entre 30 y 50 personas. • $50 si es mayor
         * de 50. Valor agregado por el gimnasio: • $50 si el tipo del gimnasio
         * es A. • $30 si el tipo del gimnasio es B. Valor agregado por las
         * limosinas: • $15 por la cantidad de limosinas del hotel.
         */

        //PrecioHabitación = $50 + ($1 x capacidad del hotel)
        System.out.println("Cant Habitaciones " + this.cantHabitaciones + " - Plus $" + (1 * this.cantHabitaciones));
        this.precio += (1 * this.cantHabitaciones);
        /**
         * Valor agregado por el restaurante: • $10 si la capacidad del
         * restaurante es de menos de 30 personas. • $30 si está entre 30 y 50
         * personas. • $50 si es mayor de 50.
         */
        System.out.print("Restaurante " + this.nombreRestaurante + " con capacidad de " + this.capacidadRestaurante + " - $");
        if (this.capacidadRestaurante < 30) {
            this.precio += 10;
            System.out.println("10");
        } else if (this.capacidadRestaurante >= 30 && this.capacidadRestaurante <= 50) {
            this.precio += 30;
            System.out.println("30");
        } else {
            this.precio += 50;
            System.out.println("50");
        }
        
        /**
         * Valor agregado por el gimnasio: • $50 si el tipo del gimnasio
         * es A. • $30 si el tipo del gimnasio es B. 
         */
        if (this.Gimnasio == TipoGym.A) {
            System.out.println("Tipo Gym A + $50");
            this.precio += 50;
        } else {
            System.out.println("Tipo Gym B + $30");
            this.precio += 30;
        }
        //System.out.println("Precio $" + this.precio);
        return this.precio;
    }
}
