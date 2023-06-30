/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class ProductoService {

    private ProductoDAO dao;

    public ProductoService() {
        this.dao = new ProductoDAO();
    }

    public Collection<Producto> listarProductos() throws Exception {
        try {
            Collection<Producto> productos = dao.listarProductos();
            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Producto> listarProductosCPrecio() throws Exception {
        try {
            Collection<Producto> productos = dao.listarProductosCPrecio();
            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Producto> listarProductosBetween() throws Exception {
        try {
            Collection<Producto> productos = dao.listarProductosBetween();
            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Producto> listarPortatiles() throws Exception {
        try {
            Collection<Producto> productos = dao.listarPortatiles();
            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Producto> listarBarato() throws Exception {
        try {
            Collection<Producto> productos = dao.listarBarato();
            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirProductos() throws Exception {
        try {
            Collection<Producto> productos = listarProductos();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto u : productos) {
                    System.out.println(u.getNombre());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirPortatiles() throws Exception {
        try {
            Collection<Producto> productos = listarPortatiles();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto u : productos) {
                    System.out.println(u.getNombre());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirBarato() throws Exception {
        try {
            Collection<Producto> productos = listarBarato();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto u : productos) {
                    System.out.println(u.getNombre() + " - $" + u.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirProductosBetween() throws Exception {
        try {
            Collection<Producto> productos = listarProductosBetween();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto u : productos) {
                    System.out.println(u.getNombre() + " - $" + u.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirProductosCPrecio() throws Exception {
        try {
            Collection<Producto> productos = listarProductosCPrecio();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto u : productos) {
                    System.out.println(u.getNombre() + " - $" + u.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void crearProducto() {
        Scanner sc = new Scanner(System.in);
        Producto producto = new Producto();
        System.out.println("Ingrese el Nombre del producto");
        producto.setNombre(sc.next());
        System.out.println("Ingrese el precio del producto");
        producto.setPrecio(sc.nextDouble());
        System.out.println("Ingrese el codigo del Fabricante");
        producto.setCodigoFabricante(sc.nextInt());
        try {
            if (producto.getNombre().trim().isEmpty()) {
                throw new Exception("Debe ingresar un nombre");
            }
            if (producto.getPrecio() <= 0) {
                throw new Exception("Debe ingresar un valor mayor o igual a '0'");
            }
            if (producto.getCodigoFabricante() < 1) {
                throw new Exception("Debe ingresar un valor mayor o igual a '1'");
            }
            dao.guardarProducto(producto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void modificarProductos() {
        Scanner sc = new Scanner(System.in);
        Producto producto = new Producto();
        System.out.println("Ingrese el Nombre del producto a Modificar");
        producto.setNombre(sc.next());
        System.out.println("Ingrese precio del producto");
        producto.setPrecio(sc.nextDouble());
        System.out.println("Ingrese el codigo del fabricante");
        producto.setCodigoFabricante(sc.nextInt());
        try {
            if (producto.getNombre().trim().isEmpty()) {
                throw new Exception("Debe ingresar un nombre");
            }
            if (producto.getPrecio() <= 0) {
                throw new Exception("Debe ingresar un valor mayor o igual a '0'");
            }
            if (producto.getCodigoFabricante() < 1) {
                throw new Exception("Debe ingresar un valor mayor o igual a '1'");
            }
            
            //Buscamos
            Producto productoUP = buscarProductoCodigo(producto.getCodigoFabricante());
            
            //Modificamos
            productoUP.setNombre(producto.getNombre());
            productoUP.setPrecio(producto.getPrecio());
            dao.modificarProducto(productoUP);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public Producto buscarProductoCodigo(Integer codigo) throws Exception {
        try {
            //Validamos
            if (codigo == null) {
                throw new Exception("Debe indicar codigo");
            }
            Producto producto = dao.buscarProducto(codigo);
            return producto;
        } catch (Exception e) {
            throw e;
        }
    }
}
