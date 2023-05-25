/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * Área rectángulo: base * altura /
 *
 * Perímetro rectángulo: (base + altura) * 2.
 */
public class Rectangulo implements calculosFormas {

    private Double base;
    private Double altura;

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    

    @Override
    public Double calculaArea() {
        return base * altura;
    }

    @Override
    public Double calculaPerimetro() {
        return (base + altura) * 2;
    }

}
