/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8.servicios;

import guia_8.entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
 * Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
 * devuelve un booleano. Metodo crearPersona(): el método crear persona, le pide
 * los valores de los atributos al usuario y después se le asignan a sus
 * respectivos atributos para llenar el objeto Persona. Además, comprueba que el
 * sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
 * deberá mostrar un mensaje
 *
 *
 * Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
 * kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que
 * 20, significa que la persona está por debajo de su peso ideal y la función
 * devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
 * (incluidos), significa que la persona está en su peso ideal y la función
 * devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor
 * que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
 *
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        //Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario 
        // y después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, 
        // comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
        String nombre;
        int edad;
        char sexo = 'X';
        float peso;
        float altura;
        boolean sex = false;
//    

        System.out.print("Ingrese Nombre: ");
        nombre = leer.nextLine();
        System.out.print("Ingrese Edad: ");
        edad = leer.nextInt();

        while (!sex) {
            System.out.print("Ingrese Sexo (H/M/O): ");
            sexo = (char) leer.next().charAt(0);
            sexo = Character.toUpperCase(sexo);
            
            if (sexo == 'H' || sexo == 'M' || sexo == 'O') {
                sex=true;
            } else {
                System.out.println("Sexo Incorrecto, reintente...");
            }
        }

        System.out.print("Ingrese Peso en Kgs.: ");
        peso = leer.nextFloat();
        System.out.print("Ingrese Altura: ");
        altura = leer.nextFloat();

        return new Persona(nombre, edad, sexo, peso, altura);
    }
    
        public Persona crearPersona(String nombre, int edad, char sexo, float peso, float altura) {
        //Metodo crearPersona(): Se pasan valores para TEsting, se supone que Sexo pasa correctamente

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public Boolean esMayorDeEdad(Persona p) {
        //Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
        return (p.getEdad() >= 18);
    }
    
    
    public int calcularIMC(Persona p){
// * Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
// * kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que
// * 20, significa que la persona está por debajo de su peso ideal y la función
// * devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
// * (incluidos), significa que la persona está en su peso ideal y la función
// * devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor
// * que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
        float IMC;
        
        IMC=(float) (p.getPeso()/(Math.pow(p.getAltura(),2)));
        
        if (IMC < 20) {
            return -1;
        } else {
            if (IMC >=20 && IMC <=25 ) {
                return 0;
            } else {
                return 1;
            }
        }
    }

}
