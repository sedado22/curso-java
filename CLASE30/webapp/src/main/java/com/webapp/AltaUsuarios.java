package com.webapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AltaUsuarios {
        public static void main(String[] args) {
                    String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "root";
        String schema = "mis_usuarios";

        // Declaramos interfaces que nos ayudan con conexiones y sentencias SQL

        Connection conexion = null;
        PreparedStatement declaracion = null;
        try {
            
            //cargamos el driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //establecemos la conexion
            conexion = DriverManager.getConnection(url + schema, user, password);
            System.out.println("conexion a la db exitosa");
            //creamos la sentencia sql
            String sqlUsuarios = "INSERT INTO usuarios (nombre, apellido, email, fkPais)"+
            "VALUES (?, ?, ?, ?)";
            //cargamos los datos en la tabla
            declaracion = conexion.prepareStatement(sqlUsuarios);
            declaracion.setString(1, "Nombre 4");
            declaracion.setString(2, "Apellido 4");
            declaracion.setString(3, "email@email4.com");
            declaracion.setInt(4, 1);
            //ejecutamos
            int filasInsertadas = declaracion.executeUpdate();

            //validamos if-else
            if (filasInsertadas>0) {
                    System.out.println("Insercion Exitosa");
                
            } 
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            //cerramos recursos
            try {
                if (declaracion != null) declaracion.close();
                if (conexion != null) conexion.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}