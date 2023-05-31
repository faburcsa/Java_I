/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * Para los Camping se indica la capacidad máxima de carpas, la cantidad de
 * baños disponibles y si posee o no un restaurante dentro de las instalaciones
 */
public final class Camping extends ExtraHotelero {
 protected int maxCarpas;
 protected int cantBanios;
 protected boolean poseeRestaurant;

    public Camping(int maxCarpas, int cantBanios, boolean poseeRestaurant, boolean privado, float mtsCuadrados, String nombre, String direccion, String localidad, String encargado) {
        super(privado, mtsCuadrados, nombre, direccion, localidad, encargado);
        this.maxCarpas = maxCarpas;
        this.cantBanios = cantBanios;
        this.poseeRestaurant = poseeRestaurant;
    }

    public int getMaxCarpas() {
        return maxCarpas;
    }

    public void setMaxCarpas(int maxCarpas) {
        this.maxCarpas = maxCarpas;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isPoseeRestaurant() {
        return poseeRestaurant;
    }

    public void setPoseeRestaurant(boolean poseeRestaurant) {
        this.poseeRestaurant = poseeRestaurant;
    }

    @Override
    public String toString() {
        return super.toString() + "Camping{" + "maxCarpas=" + maxCarpas + ", cantBanios=" + cantBanios + ", poseeRestaurant=" + poseeRestaurant + '}';
    }
 
 
}
