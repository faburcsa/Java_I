/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_poo_ejercicios;

import Entidad.Producto;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class Guia_7_poo_EjercicioExtra_Caro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Producto p1=new Producto("Lampara",202020,200,22.5);
        Producto p1=new Producto();
        p1.crearProducto();
        
        p1.mostrarProducto();
        
        p1.cambiarPrecio();

        p1.venderProducto();
        
        p1.mostrarProducto();
    }
    
}
