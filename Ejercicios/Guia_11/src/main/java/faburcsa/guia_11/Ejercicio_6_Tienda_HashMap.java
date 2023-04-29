/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faburcsa.guia_11;

import java.util.Scanner;
import servicios.ServicioProducto;

/**
 *
 * @author Fabian M. Urchueguia
 * 
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
* 
* 
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
public class Ejercicio_6_Tienda_HashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String opcion="S";
        do {
            System.out.println("MENU TIENDA:");
            System.out.println("1 - Agregar Producto");
            System.out.println("2 - Eliminar Producto");
            System.out.println("3 - Modificar Precio Producto");
            System.out.println("4 - Mostrar Productos");
            System.out.println("5 - Salir");
            
            opcion = leer.next();
            switch (opcion) {
                case "1":
                    ServicioProducto.agregarHashProductos(ServicioProducto.crearProducto());
                    opcion="S";
                    break;
                case "2":
                    ServicioProducto.eliminarProductos();
                    opcion="S";
                    break;
                case "3":
                    ServicioProducto.modificaPrecio();
                    opcion="S";
                    break;
                case "4":
                    ServicioProducto.mostrarHashProductos();
                    opcion="S";
                    break;
                 case "5":
                    opcion="N";
                    break;
                default:
                    System.out.println("Opcion Incorrecta, reintente...");
                    opcion="S";
            }
        } while (opcion.substring(0, 1).equalsIgnoreCase("S"));
        
        
        
        
    }
    
}
