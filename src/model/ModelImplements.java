/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * En la implementacion de la base de datos leemos de un archivo de propiedades
 * el URL, el usuario y la contraseña para realizar la conexion.
 *
 * @author Elias
 */
public class ModelImplements implements Model {

    private PreparedStatement stmnt;
    private Connection con;

    ResourceBundle bundle = ResourceBundle.getBundle("model.config");

    private final String url = bundle.getString("URL");
    private final String user = bundle.getString("USER");
    private final String pass = bundle.getString("PASS");

    public void openConnection() {
        try {
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmnt != null) {
            try {
                stmnt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public ResultSet executeSql(String s) {
        this.openConnection();
        ResultSet rs = null;
        try {
            stmnt = con.prepareStatement(s);
            rs = stmnt.executeQuery();
            System.out.println(rs);

        } catch (Exception e) {
        }
        this.closeConnection();
        System.out.println(rs);
        return rs;
    }

    /**
     * Contiene un metodo que obtiene el saludo de una base de datos, con una
     * sentencia que selecciona el mensaje de la tabla.
     *
     * @return Devuelve el saludo obtenido
     *
     */
    @Override
    public String getGreeting() {
        ResultSet rs = null;
        String greeting = null;
        this.openConnection();

        String sql = "SELECT * from saludo";

        try {
            stmnt = con.prepareStatement(sql);
            rs = stmnt.executeQuery();

            if (rs.next()) {
                greeting = rs.getString("mensaje");
            }

        } catch (SQLException e) {
            //TODO EXCEPTIONS
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            this.closeConnection();

        }
        return greeting;
    }
}
