/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Producto;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class ProductoDAO extends DAO {

    public Collection<Producto> listarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM producto ";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString("nombre"));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    public Collection<Producto> listarProductosCPrecio() throws Exception {
        try {
            String sql = "SELECT nombre,precio FROM producto ";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    public Collection<Producto> listarProductosBetween() throws Exception {
        try {
            String sql = "SELECT nombre,precio FROM producto where precio between 120 and 202 ";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    public Collection<Producto> listarPortatiles() throws Exception {
        try {
            String sql = "SELECT nombre,precio FROM producto where nombre like ('%portátil%') ";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    public Collection<Producto> listarBarato() throws Exception {
        try {
            String sql = "SELECT nombre,precio FROM producto where precio=(SELECT MIN(precio) FROM producto) ";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble("precio"));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto");
            }
            String sql = "INSERT INTO PRODUCTO(NOMBRE, PRECIO, CODIGO_FABRICANTE)" + "VALUES ('" + producto.getNombre()
                    + "','" + producto.getPrecio() + "','" + producto.getCodigoFabricante() + "');";
            System.out.println(sql);
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto a modificar");
            }
            String sql = "UPDATE PRODUCTO SET NOMBRE = '" + producto.getNombre() + "',PRECIO ="
                    + producto.getPrecio()
                    + " WHERE CODIGO = " + producto.getCodigo() + ";";
            insertarModificarEliminar(sql);
            
            
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    
     public Producto buscarProducto(Integer id) throws Exception {
        try {

            String sql = "SELECT * FROM producto "
                    + " WHERE codigo = '" + id + "'";

            consultarBase(sql);

            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt("codigo"));
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
}
