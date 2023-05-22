/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enumeraciones.tipoVehiculo;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * b. Gestión de vehículos. Se registra la información de cada vehículo
 * asegurado. Marca, modelo, año, número de motor, chasis, color, tipo
 * (camioneta, sedán, etc.).
 */
public class Vehiculo {

    private String marca;
    private String modelo;
    private Integer chasis;
    private String color;
    private tipoVehiculo tipo;
    private Poliza poliza;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getChasis() {
        return chasis;
    }

    public void setChasis(Integer chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public tipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(tipoVehiculo tipo) {
        this.tipo = tipo;
    }

    public Vehiculo(String marca, String modelo, Integer chasis, String color, tipoVehiculo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public Vehiculo() {
    }
}
