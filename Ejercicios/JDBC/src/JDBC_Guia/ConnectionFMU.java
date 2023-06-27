/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JDBC_Guia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Fabian M. Urchueguia
 */
public class ConnectionFMU {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/tienda"; // Replace 'mydatabase' with your database name
        String username = "root";
        String password = "root";

        // Register the JDBC driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Establish the connection
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            // Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mysql?" + "user=root&password=root");
            System.out.println("Conexion Exitosa!");

            // Do something with the connection...
            // Close the connection when done
            Statement stmt = connection.createStatement();
            stmt.executeQuery("Select * from fabricante");

            ResultSet result = stmt.executeQuery("Select * from fabricante");

            while (result.next()) {
                // Assuming the table has 'id' and 'name' columns, you can retrieve their values like this:
                int codigo = result.getInt("codigo");
                String nombre = result.getString("nombre");

                System.out.println("Cod: " + codigo + ", Nombre: " + nombre);
            }

            result.close();
            stmt.close();
            connection.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }

    }
}
