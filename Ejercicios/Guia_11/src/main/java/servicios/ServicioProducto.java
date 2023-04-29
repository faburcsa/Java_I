/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * Estas las realizaremos en el servicio. Como, introducir un elemento,
 * modificar su precio, eliminar un producto y mostrar los productos que tenemos
 * con su precio (Utilizar Hashmap). El HashMap tendrá de llave el nombre del
 * producto y de valor el precio. Realizar un menú para lograr todas las
 * acciones previamente mencionadas.
 */
public class ServicioProducto {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static HashMap<String, Double> hashProductos = new HashMap();

    public static Producto crearProducto() {
        System.out.println("Ingrese Nombre Producto:");
        String nombre = leer.next();

        System.out.println("Ingrese Precio Producto:");
        Double precio = leer.nextDouble();

        Producto p = new Producto(nombre, precio);

        System.out.println("Desea Agregar Descripcion el producto " + p.getNombre() + " S/N?");
        if (leer.next().substring(0, 1).equalsIgnoreCase("S")) {
            System.out.println("Ingrese descripcion:");
            p.setDescripcion(leer.next());
        }

        System.out.println("Desea Agregar Cantidad del producto " + p.getNombre() + " S/N?");
        if (leer.next().substring(0, 1).equalsIgnoreCase("S")) {
            System.out.println("Ingrese cantidad disponible:");
            p.setCantidad(leer.nextInt());
        }

        return p;
    }

    public static void agregarHashProductos(Producto p) {
        hashProductos.put(p.getNombre(), p.getPrecio());
    }

    public static void mostrarHashProductos() {
        for (Map.Entry<String, Double> entry : hashProductos.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println("Producto: " + key + " - Precio $" + val);
        }
    }

    public static void eliminarProductos() {
        System.out.println("LISTA ACTUAL:");
        mostrarHashProductos();
        System.out.println("");
        System.out.println("Ingrese nombre de producto a eliminar:");
        hashProductos.remove(leer.next());

        System.out.println("LISTA DE PRODUCTOS ACTUALIZADA!!!");
    }

    public static void modificaPrecio() {
        System.out.println("LISTA ACTUAL:");
        mostrarHashProductos();
        System.out.println("");
        System.out.println("Ingrese nombre de producto para modificar precio:");

        for (Map.Entry<String, Double> entry : hashProductos.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            if (key.equals(leer.next())) {
                System.out.println("Ingrese Nuevo precio:");
                Double newPrice=leer.nextDouble();
                hashProductos.replace((String) key,newPrice );
            }
        }

        System.out.println("LISTA DE PRODUCTOS ACTUALIZADA!!!");
    }
}
