/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Fabian M. Urchueguia 
 * 
 * En contraste, los Alojamientos Extra hoteleros
 * proveen servicios diferentes a los de los hoteles, estando más orientados a
 * la vida al aire libre y al turista de bajos recursos. Por cada Alojamiento
 * Extrahotelero se indica si es privado o no, así como la cantidad de metros
 * cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los
 * Camping y las Residencias. 
 * 
 * Para los Camping se indica la capacidad máxima de
 * carpas, la cantidad de baños disponibles y si posee o no un restaurante
 * dentro de las instalaciones. Para las residencias se indica la cantidad de
 * habitaciones, si se hacen o no descuentos a los gremios y si posee o no campo
 * deportivo.
 */
public class ExtraHotelero extends Alojamiento {
    protected boolean privado;
    protected float mtsCuadrados;

    public ExtraHotelero() {
    }

    public ExtraHotelero(boolean privado, float mtsCuadrados, String nombre, String direccion, String localidad, String encargado) {
        super(nombre, direccion, localidad, encargado);
        this.privado = privado;
        this.mtsCuadrados = mtsCuadrados;
    }

    @Override
    public String toString() {
        return super.toString() + "ExtraHotelero{" + "privado=" + privado + ", mtsCuadrados=" + mtsCuadrados + '}';
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public float getMtsCuadrados() {
        return mtsCuadrados;
    }

    public void setMtsCuadrados(float mtsCuadrados) {
        this.mtsCuadrados = mtsCuadrados;
    }
    
    
    
}
