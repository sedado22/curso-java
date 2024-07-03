package com.webapp;

import java.sql.*;

public class LeerTabla {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "root";
        String schema = "mis_usuarios";

        // Declaramos interfaces que nos ayudan con conexiones y sentencias SQL

        Connection conexion = null;
        Statement declaracion = null;

        try {
            // cargamos el driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // establecemos la conexion
            conexion = DriverManager.getConnection(url + schema, user, password);

            System.out.println("conexion a la db exitosa");
            declaracion = conexion.createStatement();
            // Creamos la consulta
            String sqlTabla = "SELECT * FROM usuarios";
            
            // Procesamiento de los resultados
            ResultSet resultado = declaracion.executeQuery(sqlTabla);

            while (resultado.next()) {
                int id = resultado.getInt("iDUsuario");
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                String email = resultado.getString("email");
                int fkPais = resultado.getInt("fkPais");
                // Imprimimos datos
                System.out.println("ID: " + id);
                System.out.println("Nombre: " + nombre);
                System.out.println("apellido: " + apellido);
                System.out.println("fkPais: " + fkPais);
                System.out.println("-----------------------------------------------");

            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            // cerramos recursos
            try {
                if (declaracion != null)
                    declaracion.close();
                if (conexion != null)
                    conexion.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}