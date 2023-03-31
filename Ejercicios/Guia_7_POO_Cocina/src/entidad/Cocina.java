/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class Cocina {

    Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    public ArrayList<Receta> recetas; 
    //cada nuevo objeto de "r":r0, r1,r2,r3;
    //se agrega un elemento al arraylist

    public Cocina() {
        //Constructor crea el arraylist vacio con objetos tipo Receta
        this.recetas = new ArrayList();
    }

    public void crearRecetas() {
        System.out.println("Ingrese nombre receta: ");
        String nombre = entrada.next();
        System.out.println("Cuantos ingredientes tiene su receta "+nombre+"? ");
        int cantidad = entrada.nextInt();
        String[] ingredientes = new String[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese ingrediente numero : " + (i + 1));
            ingredientes[i] = entrada.next();
        }
        Receta r = new Receta(nombre, ingredientes);
        // recetas 0 String nombre, String [] ingredientes;
        recetas.add(r);
    }

    public void buscarRecetas() {
        // arraylist [3] r0 r1 r2
        /// r0 nombre,ingrediente,auto;
        System.out.println("Ingrese nombre de receta a buscar: ");
        String nombre = entrada.next();
        for (Receta r : recetas) {
            if (r.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(r.toString()); // es igual a, por estar en override: System.out.println(r);
            }
        }
    }
    
public void buscarPorIngrediente() {

        System.out.println("Ingresa el ingrediente:");

        String ingrediente = entrada.next();
        String[] ingredientes;

        for (Receta r : recetas) {
            boolean flag = false;
            //System.out.println(r.toString()); // es igual a, por estar en override: System.out.println(r);
            ingredientes = r.getIngredientes();
            for (int i = 0; i < ingredientes.length; i++) {
                //System.out.println((i + 1) + "-" + ingredientes[i]);

                if (ingredientes[i].equalsIgnoreCase(ingrediente)) {
                    flag = true;
                }
            }
            if (flag) {

                System.out.println(r.toString());
            }

        }
    }
    
}
