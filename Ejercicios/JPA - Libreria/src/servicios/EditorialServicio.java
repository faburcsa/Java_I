/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Editorial;
import java.util.List;
import persistencia.EditorialDAO;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class EditorialServicio {

    private final EditorialDAO DAO;

    public EditorialServicio() {
        this.DAO = new EditorialDAO();
    }

//    public void setServicios(MascotaServicio mascotaServicio, PersonaServicio personaServicio) {
//        this.mascotaServicio = mascotaServicio;
//        this.personaServicio = personaServicio;
//    }
    // este método recibe dos parámetros: pais y provincia y los utiliza
    //  para inicializar un objeto Editorial con estos valores. Luego se
    //  invoca al método guardar de la clase DAO padre y se pasa el objeto 
    //  a persistir.
    public Editorial crearEditorial(String nombre) {
        Editorial editorial = new Editorial();
        try {
            editorial.setNombre(nombre);
            DAO.guardar(editorial);
            return editorial;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Editorial> listarEditoriales() {
        try {
            return DAO.listarTodos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Editorial buscarPorId(Integer id) {
        try {
            return DAO.buscarPorID(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean eliminarPorId(Integer id) {
        try {
            Editorial editorial = DAO.buscarPorID(id);
            System.out.println(editorial.toString());
            DAO.eliminar(editorial);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
