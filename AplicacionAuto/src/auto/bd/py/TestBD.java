/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.bd.py;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class TestBD {

    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);

        String nombreColumna = "";
        String valorBuscar = "";
        System.out.println(" CONSULTA A LA BASE DE DATOS ");

        System.out.println(" ingresar nombre de la columna ");
        nombreColumna = texto.nextLine();
        System.out.println(" ingresar el valor a buscar ");
        valorBuscar = texto.nextLine();
        consultarBD(nombreColumna, valorBuscar);

    }

    static void consultarBD(String nombreColumna, String valorParam) {

        try {
            Conexion cn = new Conexion();

            Connection conn = cn.conexion();

            String consulta = "select * from potluck where " + nombreColumna + " = ? ";
            PreparedStatement sentencia = conn.prepareStatement(consulta);

            if (nombreColumna.equals("id")) {
                sentencia.setInt(1, Integer.valueOf(valorParam));
            } else if (nombreColumna.equals("signup_date")) {
                sentencia.setDate(1, Date.valueOf(valorParam));
            } else {
                sentencia.setString(1, valorParam);
            }

            ResultSet rs = sentencia.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt(1));
                System.out.println("NAME: " + rs.getString("name"));
                System.out.println("FOOD: " + rs.getString("food"));
                System.out.println("COMFIRMED: " + rs.getString("confirmed"));
                System.out.println("SIGNUP_DATE: " + rs.getDate("signup_date"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(TestBD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
