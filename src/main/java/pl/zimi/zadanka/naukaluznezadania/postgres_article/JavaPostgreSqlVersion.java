package pl.zimi.zadanka.naukaluznezadania.postgres_article;

import javax.swing.*;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

public class JavaPostgreSqlVersion {
    public static void main(String[] args) {
//        String url = "jdbc:postgresql://localhost:5432/baza_test";
//        String user = "postgres";
//        String password = "komandos";
//
//        try {
//            Connection con = DriverManager.getConnection(url,user,password );
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//
//    }
        try {
            Enumeration<Driver> drivers = DriverManager.getDrivers();
            while (drivers.hasMoreElements()) {
                Driver nextElement = drivers.nextElement();
                JOptionPane.showMessageDialog(null, nextElement.acceptsURL("jdbc:postgresql://localhost:5432/postgres"));
                JOptionPane.showMessageDialog(null, nextElement.acceptsURL("Jdbc:postgresql://localhost:5432/postgres"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
