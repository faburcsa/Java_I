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
 * * A continuación, se debe crear una subclase llamada Lavadora, con el
 * atributo carga, además de los atributos heredados.
 *
 */
public class Lavadora extends Electrodomestico {

    private Float carga;

    /**
     * Los constructores que se implementarán serán: • Un constructor vacío.
     */
    public Lavadora() {
    }

    // Un constructor con la
    // * carga y el resto de los atributos heredados. Recuerda que debes llamar al
    // * constructor de la clase padre. 
    public Lavadora(Float carga, Double precio, String color, Consumo consumo, Float peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    /**
     * •Los métodos que se implementara serán: • Método get y set del atributo
     * carga./
     *
     * @return
     */
    public Float getCarga() {
        return carga;
    }

    public void setCarga(Float carga) {
        this.carga = carga;
    }

    /**
     * • Método crearLavadora (): este método llama a crearElectrodomestico() de
     * la clase padre, lo utilizamos para llenar los atributos heredados del
     * padre y después llenamos el atributo propio de la lavadora.
     */
    public void crearLavadora() {
        System.out.println("Carga de Lavadora");
        super.crearElectrodomestico();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese Carga Lavadora:");
        this.carga = leer.nextFloat();
        //return new Lavadora(leer.nextFloat(),precio,color,consumo,peso);
    }

    @Override
    public String toString() {
        return "\n Lavadora{" + "carga=" + carga + '}' + super.toString();
    }

    /**
     *  * • Método precioFinal(): este método será heredado y se le sumará la
     * siguiente funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el
     * precio en $500, si la carga es menor o igual, no se incrementará el
     * precio. Este método debe llamar al método padre y añadir el código
     * necesario. Recuerda que las condiciones que hemos visto en la clase
     * Electrodoméstico también deben afectar al precio.
     */
    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.carga > 30) {
            this.precio += 500d;
            System.out.println("Precio extra por carga superior a 30Kg $500");
        }
        System.out.println("Precio final $" + this.precio);
    }

}
