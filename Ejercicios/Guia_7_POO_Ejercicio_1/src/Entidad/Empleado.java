/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Fabian M. Urchueguia Crea una clase "Empleado" que tenga atributos
 * como "nombre", "edad" y "salario". Luego, crea un método "calcular_aumento"
 * que calcule el aumento salarial de un empleado en función de su edad y
 * salario actual. El aumento salarial debe ser del 10% si el empleado tiene más
 * de 30 años o del 5% si tiene menos de 30 años.
 *
 */
public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    public void calcular_aumento() {
        if (this.edad >= 30) {
            System.out.println("Aumento del 10%");
            this.salario += this.salario * 10 / 100;
        } else {
            System.out.println("Aumento del 5%");
            this.salario += this.salario * 5 / 100;
        }
    }

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
