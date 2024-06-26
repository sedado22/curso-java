package com.webapp;

import java.sql.*;

public class AltaPaises {
    public static void main(String[] args) {
        //declaramos variables para la conexion
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "root";
        String schema = "mis_usuarios";

        // Declaramos objetos que nos ayudan con la conexion y sentencias SQL
        Connection connection = null;
        Statement statement = null;

        //establecemos la conexion
        try {
            // cargamos el drv
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url + schema, user, password);
            // Inicializamos statement
            statement = connection.createStatement(); //statement nos ayuda con las declaraciones sql
            System.out.println("conexion a la db exitosa");
            //Generamos la consulta
            String instertarPaisesSQL = "INSERT INTO paises (nombrePais) VALUES "
                    + "('Argentina'), "
                    + "('Uruguay'), "
                    + "('Chile'), "
                    + "('Perú'), "
                    + "('Bolivia'), "
                    + "('Paraguay')";
            statement.executeUpdate(instertarPaisesSQL);
            System.out.println("Datos de paises insertados exitosamente");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            // Cerrar los recursos
            try {
               { if (statement != null)
                    statement.close();
                if (connection != null) 
                    connection.close();
                    System.out.println("Conexión cerrada");
                }
            } catch (SQLException e) {
                System.out.println("Error:" + e);
                e.printStackTrace();
            }

        }
    }
}