/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda;

import java.util.Scanner;
import tienda.servicios.ProductoService;
import tienda.servicios.FabricanteService;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    static ProductoService productoService = new ProductoService();
    static FabricanteService fabricanteService = new FabricanteService();

    public static void main(String[] args) {
        // TODO code application logic here
        //DAO dao=new DAO_FMU();
        boolean flagMenu = true;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        while (flagMenu) {

            System.out.println("MENU");

            System.out.println("Ingrese Opcion");
            System.out.println("1 - Listar Productos.");
            System.out.println("2 - Listar Productos con Precios.");
            System.out.println("3 - Listar Productos con Precios entre 120 y 202.");
            System.out.println("4 - Buscar y listar todos los Portátiles de la tabla producto");
            System.out.println("5 - Listar el nombre y el precio del producto más barato. ");
            System.out.println("6 - Ingresar un producto a la base de datos");
            System.out.println("7 - Ingresar un fabricante a la base de datos");
            System.out.println("8 - Editar un producto con datos a elección.");

            System.out.println("0 - Salir");
            int Opcion = leer.nextInt();

            switch (Opcion) {
                case 0:
                    flagMenu = false;
                    break;
                case 1:
                    listaProductos();
                    break;
                case 2:
                    listaProductosCPrecio();
                    break;
                case 3:
                    listaProductosBetween();
                    break;
                case 4:
                    listaPortatiles();
                    break;
                case 5:
                    listaBarato();
                    break;
                case 6:
                    IngresarProducto();
                    break;
                case 7:
                    IngresarFabricante();
                    break;
                case 8:
                    ModificaProducto();
                    break;
                default:
                    System.out.println("Opcion Incorrecta.");
            }
        }

    }

    // Lista el nombre de todos los productos que hay en la tabla producto
    public static void listaProductos() {
        try {
            productoService.imprimirProductos();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
    }

    // Lista los nombres y los precios de todos los productos de la tabla producto.
    public static void listaProductosCPrecio() {
        try {
            productoService.imprimirProductosCPrecio();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
    }

    //Listar aquellos productos que su precio esté entre 120 y 202
    public static void listaProductosBetween() {
        try {
            productoService.imprimirProductosBetween();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
    }

    //Listar aquellos productos que su precio esté entre 120 y 202
    public static void listaPortatiles() {
        try {
            productoService.imprimirPortatiles();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
    }

    //Listar aquellos productos que su precio Barato
    public static void listaBarato() {
        try {
            productoService.imprimirBarato();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
    }

    public static void IngresarProducto() {
        try {
            productoService.crearProducto();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
    }

    public static void IngresarFabricante() {
        try {
            fabricanteService.crearFabricante();
            fabricanteService.listaFabricante();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
    }
    
    
        public static void ModificaProducto() {
        try {
            productoService.modificarProductos();
            productoService.imprimirProductosCPrecio();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
    }
    
    

}
