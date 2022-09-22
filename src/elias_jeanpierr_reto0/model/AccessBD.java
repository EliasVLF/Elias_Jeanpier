/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elias_jeanpierr_reto0.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class AccessBD {

    private PreparedStatement stmnt;
    private Connection con;

    ResourceBundle bundle = ResourceBundle.getBundle("config.properties");

    private String url = bundle.getString("URL");
    private String user = bundle.getString("USER");
    private String pass = bundle.getString("PASS");

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
}
