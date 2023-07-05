/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Autor;
import java.util.List;
import persistencia.AutorDAO;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class AutorServicio {
private final AutorDAO DAO;

    public AutorServicio() {
        this.DAO = new AutorDAO();
    }

//    public void setServicios(MascotaServicio mascotaServicio, PersonaServicio personaServicio) {
//        this.mascotaServicio = mascotaServicio;
//        this.personaServicio = personaServicio;
//    }

    // este método recibe dos parámetros: pais y provincia y los utiliza
    //  para inicializar un objeto Autor con estos valores. Luego se
    //  invoca al método guardar de la clase DAO padre y se pasa el objeto 
    //  a persistir.
    public Autor crearAutor(String nombre) {
        Autor autor = new Autor();
        try {
            autor.setNombre(nombre);
            DAO.guardar(autor);
            return autor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public List<Autor> buscarPorNombre(String nombre) {
        try {
            return DAO.buscarPorNombre(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    
    public List<Autor> listarAutores() {
        try {
            return DAO.listarTodos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Autor buscarPorId(Integer id) {
        try {
            return DAO.buscarPorID(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean eliminarPorId(Integer id) {
        try {
            Autor autor = DAO.buscarPorID(id);
            System.out.println(autor.toString());
            DAO.eliminar(autor);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
