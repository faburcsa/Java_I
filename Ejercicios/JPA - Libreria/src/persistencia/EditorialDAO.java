/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.Editorial;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class EditorialDAO {

    private final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("LibreriaFMU");
    private EntityManager em = EMF.createEntityManager();

    // Este método nos permite conectar con la base de datos
    // se verifica si la conexión está realizada, en caso que
    // no esté realizada, se realiza.
    public void conectar() {
        if (!em.isOpen()) {
            em = EMF.createEntityManager();
        }
    }

    // Este método nos permite desconectarnos de la base de datos
    // Se verifica si existe una conexión, y de ser el caso, se
    // cierra la conexión y se desconecta el programa con la base de datos.
    public void desconectar() {
        if (em.isOpen()) {
            em.close();
        }
    }

    // este método nos permite persistir un objeto en la base de datos.
    // Toma como parámetro el objeto de tipo Mascota que se quiere persistir
    public void guardar(Editorial editorial) {
        conectar();
        em.getTransaction().begin();
        em.persist(editorial);
        em.getTransaction().commit();
        desconectar();
    }

    // Este método nos permite eliminar un registro de la base de datos.
    // Como parámetro se pasa el objeto a eliminar de la base de datos.
    // Se busca en la base de datos el registro que contenga la misma información
    // que el parámetro recibido, y se elimina.
    public void eliminar(Editorial editorial) {
        conectar();
        em.getTransaction().begin();
        //ERROR
        // Entity must be managed to call remove: Editorial{id=151, nombre=Fabricion, alta=true}, try merging the detached and try the remove again.
        //  Editorial detachedEditorial = entityManager.find(Editorial.class, 102); // Retrieve the detached entity by ID
        //  Editorial mergedEditorial = entityManager.merge(detachedEditorial); // Merge the detached entity
        em.remove(em.merge(em.find(Editorial.class, editorial.getId()))); // Remove the merged entity
        //em.remove(editorial);
        em.getTransaction().commit();
        desconectar();
    }

    // Este método nos permite modificar un registro de una base de datos.
    // Recibe como parámetro el objeto con los datos cambiados (debe mantener
    // la misma llave primaria) y lo reemplaza por el anterior.
    public void editar(Editorial editorial) {
        conectar();
        em.getTransaction().begin();
        em.merge(editorial);
        em.getTransaction().commit();
        desconectar();
    }

    public List<Editorial> listarTodos() throws Exception {
        conectar();
        List<Editorial> editoriales = em.createQuery("SELECT a FROM Editorial a ").getResultList();
        desconectar();
        return editoriales;
    }

    public Editorial buscarPorID(Integer id) throws Exception {
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT a FROM Editorial a WHERE a.id LIKE :id").setParameter("id", id.toString()).getSingleResult();
        desconectar();
        return editorial;
    }
}
