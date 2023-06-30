/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class FabricanteDAO extends DAO {
     public void guardarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar un fabricante");
            }
            String sql = "INSERT INTO FABRICANTE(NOMBRE)" + "VALUES ('" + fabricante.getNombre()+ "');";
            System.out.println(sql);
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
     
         public Collection<Fabricante> listarFabricante() throws Exception {
        try {
            String sql = "SELECT * FROM fabricante ";

            consultarBase(sql);

            Fabricante fabricante = null;
            Collection<Fabricante> fabricantes = new ArrayList();
            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setNombre(resultado.getString("nombre"));
                fabricantes.add(fabricante);
            }
            desconectarBase();
            return fabricantes;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
}
