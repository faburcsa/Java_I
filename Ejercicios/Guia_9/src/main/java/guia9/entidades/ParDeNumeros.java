/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia9.entidades;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class ParDeNumeros {
    private float num1,num2;

    public ParDeNumeros() {
        //En el constructor vacío se usará el Math.random para generar los dos números. 
        this.num1 = (float) Math.random() * 10;
        this.num2 = (float) Math.random() * 10;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "ParDeNumeros{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
    
}
