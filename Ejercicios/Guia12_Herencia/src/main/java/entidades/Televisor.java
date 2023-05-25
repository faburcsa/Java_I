/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enumeraciones.Consumo;
import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 *
 *
 * Finalmente, en el main debemos realizar lo siguiente: Vamos a crear una
 * Lavadora y un Televisor y llamar a los métodos necesarios para mostrar el
 * precio final de los dos electrodomésticos.
 */
public final class Televisor extends Electrodomestico {

    /**
     *  * * Se debe crear también una subclase llamada Televisor con los
     * siguientes atributos: resolución (en pulgadas) y sintonizador TDT
     * (booleano), además de los atributos heredados.
     */
    private int resolucion;
    private boolean sintonizador = false;

    /**
     * Los constructores que se implementarán serán: • Un constructor vacío. •
     * Un constructor con la resolución, sintonizador TDT y el resto de los
     * atributos heredados. Recuerda que debes llamar al constructor de la clase
     * padre.
     */
    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizador, Double precio, String color, Consumo consumo, Float peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador= sintonizador;
    }

    /**
     *  * Los métodos que se implementara serán: • Método get y set de los
     * atributos resolución y sintonizador TDT.
     *
     * @return
     */
    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    /**
     *  * • Método crearTelevisor(): este método llama a crearElectrodomestico()
     * de la clase padre, lo utilizamos para llenar los atributos heredados del
     * padre y después llenamos los atributos del televisor.
     */
    public void crearTelevisor() {
        System.out.println("Carga de TV");
        super.crearElectrodomestico();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese Resolucion en pulgadas TV:");
        this.resolucion = leer.nextInt();

        System.out.println("El TV posee Sintonizador S/N?");
        if (leer.next().toUpperCase().substring(0, 1).equals("S")) {
            this.sintonizador = true;
        }

    }

    /**
     *  * • Método precioFinal(): este método será heredado y se le sumará la
     * siguiente funcionalidad. Si el televisor tiene una resolución mayor de 40
     * pulgadas, se incrementará el precio un 30% y si tiene un sintonizador TDT
     * incorporado, aumentará $500. Recuerda que las condiciones que hemos visto
     * en la clase Electrodomestico también deben afectar al precio.
     */
    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.resolucion > 40) {
            System.out.println("Precio extra por Tamaño mayor 40 pulgadas $" + this.precio*30/100);
            this.precio+=this.precio*30/100;
        }
        if (this.sintonizador) {
            this.precio+=500d;
            System.out.println("Precio extra por Sintonizador $500");
        }
        System.out.println("Precio final $" + this.precio);
    }
    
    @Override
    public String toString() {
        return "\n TV{" + "pulgadas=" + resolucion + " - Sintonizador: "+sintonizador+ "}" + super.toString();
    }
}
