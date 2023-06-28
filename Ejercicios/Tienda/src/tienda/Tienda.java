/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda;

import java.sql.Connection;
import tienda.persistencia.DAO_FMU;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DAO dao=new DAO_FMU();
        
        Connection conn=DAO_FMU.conexion("tienda");
        
        
        DAO_FMU.desConexion(conn); //conn.close();
        
    }
    
}
