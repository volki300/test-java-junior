/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.bd.py;

import java.sql.*;

public class Conexion {

    public Connection con;

    public Connection conexion() {
        try {
            Class.forName("org.postgresql.Driver");  //loads the driver
        } catch (ClassNotFoundException e) {
            System.out.println("No encontro driver");
        }
        try {
            String url = "jdbc:postgresql://localhost:5432/sodep";
            con = DriverManager.getConnection(url, "postgres", "saa");
//            DatabaseMetaData dma = con.getMetaData();

//            System.out.println("\nConectado a: " + dma.getURL());

        } catch (SQLException e) {
            System.out.println(" " + e.getMessage());
        }
        return con;
    }
//    public static void main(String[] args) {
//        new Conexion().conexion();
//    }
}
