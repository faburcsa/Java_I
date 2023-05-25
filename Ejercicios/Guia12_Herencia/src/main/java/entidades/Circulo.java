/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Fabian M. Urchueguia Área circulo: PI * radio ^ 2 / Perímetro
 * circulo: PI * diámetro.
 *
 */
public class Circulo implements calculosFormas {

    private Double radio;
    private Double diametro;

    public Circulo(Double radio, Double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }
    
    

    @Override
    public Double calculaArea() {
        return VALORPI * radio * radio;
    }

    @Override
    public Double calculaPerimetro() {
        return VALORPI * diametro;
    }

}
