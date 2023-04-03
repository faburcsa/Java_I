/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8.entidades;

/**
 *
 * @author Fabian M. Urchueguia
 * 
 *  * Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2º grado. 
 * Tendremos los 3 coeficientes como atributos, llamémosles a, b y c. Hay que insertar estos 3 valores para 
 * construir el objeto a través de un método constructor. 
 */
public class Raices {
    private int nro,x,y;

    public Raices() {
    }

    public Raices(int nro, int x, int y) {
        this.nro = nro;
        this.x = x;
        this.y = y;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Raices{" + "nro=" + nro + ", x=" + x + ", y=" + y + '}';
    }
    
    
    
}
