/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * Para las residencias se indica la cantidad de habitaciones, si se hacen o no
 * descuentos a los gremios y si posee o no campo deportivo.
 */
public class Residencia extends ExtraHotelero {
    protected int cantHabitaciones;
    protected boolean dtoGremios;
    protected boolean campoDeportivo;

    public Residencia(int cantHabitaciones, boolean dtoGremios, boolean campoDeportivo, boolean privado, float mtsCuadrados, String nombre, String direccion, String localidad, String encargado) {
        super(privado, mtsCuadrados, nombre, direccion, localidad, encargado);
        this.cantHabitaciones = cantHabitaciones;
        this.dtoGremios = dtoGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDtoGremios() {
        return dtoGremios;
    }

    public void setDtoGremios(boolean dtoGremios) {
        this.dtoGremios = dtoGremios;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return super.toString() + "Residencias{" + "cantHabitaciones=" + cantHabitaciones + ", dtoGremios=" + dtoGremios + ", campoDeportivo=" + campoDeportivo + '}';
    }
    
    
}
