/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_poo_ejercicios;

import Entidad.Cocina;
import Entidad.Cuenta;
import Entidad.Empleado;
import Entidad.Juego;
import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class Guia_7_POO_EjerciciosExtras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int reintentos;
//        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//        
//        System.out.println("Ingrese la cant. de reintentos:");
//        reintentos=leer.nextInt();
//        
//        Juego j1=new Juego(reintentos);
//        
//        j1.iniciar_juego();
        
        
        //-----------------------------------------
//        Cocina c1=new Cocina();
//        
//        c1.menuRecetas();
        
        //-----------------------------------------
//        Cuenta cu1=new Cuenta("Fabian Urchueguia",1052.32);
//        cu1.retirardinero(2000);
//        cu1.retirardinero(1000);
//        System.out.println(cu1.toString());


        //-----------------------------------------
        Empleado e1 = new Empleado("Fabian Urchueguia",41,500000);
        e1.calcular_aumento();
        
        System.out.println(e1.toString());
    }
    
}
