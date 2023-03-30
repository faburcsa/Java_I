/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;


import java.util.Scanner;

/**
 *
 * @author Fabian M. Urchueguia . Crea una clase "Cocina" que tenga una lista de
 * objetos "Receta". Luego, crea métodos para agregar nuevas recetas a la lista,
 * para buscar una receta por nombre y para obtener la lista de recetas que se
 * pueden preparar con los ingredientes disponibles en la cocina.
 *
 *
 */
public class Cocina {

    private int cantRecetas = 100;
    private String mReceta[][] = new String[cantRecetas][2];
    private String nombre, ingredientes;

    public void agregar_receta() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese Nombre receta:");
        this.nombre = leer.next();
        System.out.println("Ingrese ingredientes:");
        this.ingredientes = leer.next();

        cargaReceta(nombre, ingredientes);
    }

    public Cocina() {
        // Constructor que inicializa Matriz Vacia
        for (int i = 0; i < cantRecetas; i++) {
            for (int j = 0; j < 2; j++) {
                if (i == 0 && j == 0) {
                    mReceta[i][j] = "NOMBRE";
                }
                if (i == 0 && j == 1) {
                    mReceta[i][j] = "INGREDIENTES";
                }
                if (i != 0) {
                    mReceta[i][j] = " ";
                }
            }
        }
    }

    private void cargaReceta(String nombre, String ingredientes) {
        boolean flag = false, flag2 = false;

        for (int i = 0; i < cantRecetas; i++) {
            if (flag2 == false) {

                for (int j = 0; j < 2; j++) {
                    if (mReceta[i][j].equals(" ")) {
                        if (flag == false) {
                            mReceta[i][j] = nombre;
                            flag = true;
                        } else {
                            mReceta[i][j] = ingredientes;
                            flag2 = true;
                            break;
                        }
                    }
                }
            }
        }
    }

    public void mostrarRecetas() {
        boolean flag = false;
        for (int i = 0; i < cantRecetas; i++) {
            for (int j = 0; j < 2; j++) {
                if (!mReceta[i][j].equals(" ")) {
                    System.out.print("[" + mReceta[i][j] + "]");
                } else {
                    flag = true;
                }
            }
            if (flag == false) {
                System.out.println("");
            }

        }
    }

    public void menuRecetas() {
        boolean flag = true;
        int opcion;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        while (flag) {
            System.out.println("1 - Agregar Receta.");
            System.out.println("2 - Buscar Receta por Ingredientes.");
            System.out.println("3 - Mostrar Todas las recetas.");
            System.out.println("4 - Salir.");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    agregar_receta();
                    break;
                case 2:
                    buscarRecetas();
                    break;
                case 3:
                    mostrarRecetas();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta, reintente....");
            }
        }

    }

    public void buscarRecetas() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese algun Ingrediente:");

        String ingrediente = leer.next();
        
        System.out.println("Recetas encontradas con los ingredientes ingresados:");
        System.out.println("[NOMBRE][INGREDIENTES]");

        for (int i = 0; i < cantRecetas; i++) {
            for (int j = 0; j < 2; j++) {
                if (mReceta[i][j].contains(ingrediente) && j>0 ) {
                    System.out.print("[" + mReceta[i][j - 1] + "]");
                    System.out.println("[" + mReceta[i][j] + "]");
                }
            }
        }

    }

    public int getCantRecetas() {
        return cantRecetas;
    }

    public String[][] getmReceta() {
        return mReceta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setCantRecetas(int cantRecetas) {
        this.cantRecetas = cantRecetas;
    }

    public void setmReceta(String[][] mReceta) {
        this.mReceta = mReceta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

}
