/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapos;

import java.sql.*;
import javax.swing.JOptionPane;

/*import java.swing.JOptionPane;*/

/**
 *
 * @author Peter
 */
public class configDB {

    Connection con;

    public static Connection ConnectDb() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            //  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/javastore", "root", "Admin");

            String JdbcURL = "jdbc:mysql://localhost:3306/javastore?" + "autoReconnect=true&useSSL=false";
            String Username = "root";
            String password = "Admin";
            Connection con = DriverManager.getConnection(JdbcURL, Username, password);

            return con;

        } catch (ClassNotFoundException | SQLException e) {

            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }

}
