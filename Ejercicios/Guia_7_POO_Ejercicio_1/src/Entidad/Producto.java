/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * EJERCICIO EXTRA PEDIDO A CARO DE EGG
 *
 * Crear una clase llamada Producto que contenga los siguientes atributos:
 * nombre, código, stock y precio. A continuación crear los siguientes métodos:
 * - Método constructor vacio y constructor con todos los atributos pasados por
 * parámetro - Método get y set para cada atributo - Método crearProducto():
 * pide los datos al usuario y lo guarda en los diferentes atributos - Método
 * venderProducto(): pide al usuario que ingrese una cantidad del producto y lo
 * mismo se debe restar del atributo stock - Método cambiarPrecio(): pide al
 * usuario un nuevo precio y lo asigna al atributo - Método mostrarProducto():
 * mostrar el nombre, código, stock y precio del producto
 */
public class Producto {

    private String nombre;
    private int codigo;
    private int stock;
    private double precio;

    public Producto() {
        //Método constructor vacio
    }

    public Producto(String nombre, int codigo, int stock, double precio) {
        //Método constructor con todos los atributos pasados por parámetro
        this.nombre = nombre;
        this.codigo = codigo;
        this.stock = stock;
        this.precio = precio;
    }

    //Método get y set para cada atributo
    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void crearProducto() {
        //Método crearProducto():
        //pide los datos al usuario y lo guarda en los diferentes atributos
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese Nombre Producto:");
        this.nombre = leer.next();
        System.out.print("Ingrese Codigo:");
        this.codigo = leer.nextInt();
        System.out.print("Ingrese Stock:");
        this.stock = leer.nextInt();
        System.out.print("Ingrese Precio:");
        this.precio = leer.nextDouble();
    }

    public void venderProducto() {
        //Método venderProducto(): pide al usuario que ingrese una cantidad del producto y lo
        //mismo se debe restar del atributo stock
        int cantidad;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese Cantidad Producto a restar del Stock:");
        cantidad = leer.nextInt();
        while (cantidad > this.stock) {
            System.out.println("No hay stock disponible, solo quedan: "+this.stock);
            System.out.print("Ingrese Cantidad Producto a restar del Stock:");
            cantidad = leer.nextInt();
        }

        this.stock -= cantidad;

    }

    public void cambiarPrecio() {
        //Método cambiarPrecio(): pide al
        //usuario un nuevo precio y lo asigna al atributo
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese nuevo Precio para el producto " + this.nombre+" :");
        this.precio = leer.nextDouble();
    }

    public void mostrarProducto() {
        //Método mostrarProducto():
        //mostrar el nombre, código, stock y precio del producto
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Precio: " + this.precio);
        System.out.println("Stock: " + this.stock);
    }
}
