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
 * A continuación, se debe crear una subclase llamada Lavadora, con el atributo
 * carga, además de los atributos heredados. Los constructores que se
 * implementarán serán: • Un constructor vacío. • Un constructor con la carga y
 * el resto de los atributos heredados. Recuerda que debes llamar al constructor
 * de la clase padre. Los métodos que se implementara serán: • Método get y set
 * del atributo carga. • Método crearLavadora (): este método llama a
 * crearElectrodomestico() de la clase padre, lo utilizamos para llenar los
 * atributos heredados del padre y después llenamos el atributo propio de la
 * lavadora. • Método precioFinal(): este método será heredado y se le sumará la
 * siguiente funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el
 * precio en $500, si la carga es menor o igual, no se incrementará el precio.
 * Este método debe llamar al método padre y añadir el código necesario.
 * Recuerda que las condiciones que hemos visto en la clase Electrodoméstico
 * también deben afectar al precio.
 *
 *
 * Se debe crear también una subclase llamada Televisor con los siguientes
 * atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de
 * los atributos heredados. Los constructores que se implementarán serán: • Un
 * constructor vacío. • Un constructor con la resolución, sintonizador TDT y el
 * resto de los atributos heredados. Recuerda que debes llamar al constructor de
 * la clase padre. LETRA PRECIO A $1000 B $800 C $600 D $500 E $300 F $100
 *
 * PESO PRECIO Entre 1 y 19 kg $100 Entre 20 y 49 kg $500 Entre 50 y 79 kg $800
 * Mayor que 80 kg $1000
 *
 * 14
 *
 * Los métodos que se implementara serán: • Método get y set de los atributos
 * resolución y sintonizador TDT. • Método crearTelevisor(): este método llama a
 * crearElectrodomestico() de la clase padre, lo utilizamos para llenar los
 * atributos heredados del padre y después llenamos los atributos del televisor.
 * • Método precioFinal(): este método será heredado y se le sumará la siguiente
 * funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
 * incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
 * aumentará $500. Recuerda que las condiciones que hemos visto en la clase
 * Electrodomestico también deben afectar al precio.
 *
 * Finalmente, en el main debemos realizar lo siguiente: Vamos a crear una
 * Lavadora y un Televisor y llamar a los métodos necesarios para mostrar el
 * precio final de los dos electrodomésticos.
 */
public class Electrodomestico {

    //Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
    //consumo energético (letras entre A y F) y peso.
    protected Double precio = 1000d;
    protected String color;
    protected Consumo consumo;
    protected Float peso;

    //Los constructores que se deben implementar son los siguientes:
    public Electrodomestico() {
        //Un constructor vacío.
    }

    public Electrodomestico(Double precio, String color, Consumo consumo, Float peso) {
        //• Un constructor con todos los atributos pasados por parámetro.
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    //Los métodos a implementar son:
    /**
     * Método comprobarConsumoEnergetico(char letra): comprueba que la letra es
     * correcta, sino es correcta usara la letra F por defecto. Este método se
     * debe invocar al crear el objeto y no será visible.
     */
    private Consumo comprobarConsumoEnergetico(char letra) {
        try {
            Consumo valor = Consumo.valueOf(String.valueOf(letra));
            System.out.println(letra + " pertenece al enum Consumo.");
            return valor;
        } catch (IllegalArgumentException e) {
            System.out.println(letra + " no pertenece al enum Consumo. Valor por defecto = F");
            return Consumo.valueOf(String.valueOf("F"));
        }
    }

    /**
     *  * • Método comprobarColor(String color): comprueba que el color es
     * correcto, y si no lo es, usa el color blanco por defecto. Los colores
     * disponibles para los electrodomésticos son blanco, negro, rojo, azul y
     * gris. No importa si el nombre está en mayúsculas o en minúsculas. Este
     * método se invocará al crear el objeto y no será visible.
     *
     * @return
     */
    private String comprobarColor(String color) {
        String respuesta;
        switch (color.toUpperCase()) {
            case "BLANCO":
            case "NEGRO":
            case "ROJO":
            case "AZUL":
            case "GRIS":
                respuesta = color;
                break;
            default:
                respuesta = "BLANCO";
        }
        return respuesta;
    }

    /**
     * * • Metodo crearElectrodomestico(): le pide la información al usuario y
     * llena el electrodoméstico, también llama los métodos para comprobar el
     * color y el consumo. Al precio se le da un valor base de $1000.
     *
     */
    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

//        System.out.println("Ingrese Precio $");
//        this.precio = leer.nextDouble();
        System.out.println("Ingrese Peso en Kg.");
        this.peso = leer.nextFloat();

        System.out.println("Ingrese Color");
        this.color = comprobarColor(leer.next());

        System.out.println("Ingrese Consumo (desde la A a la F)");
        this.consumo = comprobarConsumoEnergetico(leer.next().toUpperCase().charAt(0));
    }

    /**
     * • Método precioFinal(): según el consumo energético y su tamaño,
     * aumentará el valor del precio. Esta es la lista de precios:
     */
    public void precioFinal() {
        Double extPriceConsumo = 0d;
        Double extPricePeso = 0d;

        switch (this.consumo.name()) {
            case "A":
                extPriceConsumo = 1000d;
                break;
            case "B":
                extPriceConsumo = 800d;
                break;
            case "C":
                extPriceConsumo = 600d;
                break;
            case "D":
                extPriceConsumo = 500d;
                break;
            case "E":
                extPriceConsumo = 300d;
                break;
            case "F":
                extPriceConsumo = 100d;
                break;
        }
        System.out.println("Precio extra por consumo $" + extPriceConsumo);

        if (this.peso >= 1 && this.peso <= 19) {
            extPricePeso += 100d;
        } else if ((this.peso >= 20 && this.peso <= 49)) {
            extPricePeso += 500d;
        } else if ((this.peso >= 50 && this.peso <= 79)) {
            extPricePeso += 800d;
        } else if ((this.peso >= 80)) {
            extPricePeso += 1000d;
        }

        System.out.println("Precio extra por peso $" + extPricePeso);
        this.precio += extPriceConsumo + extPricePeso;
    }

    //• Métodos getters y setters de todos los atributos.
    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Consumo getConsumo() {
        return consumo;
    }

    public void setConsumo(Consumo consumo) {
        this.consumo = consumo;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }

}
