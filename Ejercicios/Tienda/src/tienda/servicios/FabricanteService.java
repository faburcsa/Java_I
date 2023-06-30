/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class FabricanteService {

    private FabricanteDAO dao;

    public FabricanteService() {
        this.dao = new FabricanteDAO();
    }

    public void crearFabricante() {
        Scanner sc = new Scanner(System.in);
        Fabricante fabricante = new Fabricante();
        System.out.println("Ingrese el Nombre del fabricante");
        fabricante.setNombre(sc.next());
        try {
            if (fabricante.getNombre().trim().isEmpty()) {
                throw new Exception("Debe ingresar un nombre");
            }
            dao.guardarFabricante(fabricante);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    	public void listaFabricante() {
		Collection<Fabricante> listaFabricante = new ArrayList<>();
		
		try {
			listaFabricante = dao.listarFabricante();
			for(Fabricante fabricante : listaFabricante) {
				System.out.println(fabricante);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
