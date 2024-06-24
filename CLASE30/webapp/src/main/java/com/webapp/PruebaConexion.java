package com.webapp;

import java.sql.*;

public class PruebaConexion {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mis_usuarios_24250";
        String usuario = "root";
        String pass = "root";

        Connection conexion = null;
        // establecemos conexion
        try {
            // cargamos el drv
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, pass);
            System.out.println("Conexion Exitosa al workbench");

        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        } finally {

            // Cerrar los recursos
            try {
                if (conexion != null) {
                    conexion.close();
                    System.out.println("Conexión cerrada");
                }
            } catch (SQLException e) {
                System.out.println("Error:" + e);
                e.printStackTrace();
            }

        }
    }
}