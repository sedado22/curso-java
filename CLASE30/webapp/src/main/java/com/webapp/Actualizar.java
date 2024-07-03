package com.webapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Actualizar {
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
            String sqlActualizar = "UPDATE usuarios SET nombre = ?, apellido = ?,"+
            "email = ?, fkPais = ? WHERE idUsuario = ?";
            // preparamos la interface para pasar la consulta
            declaracion = conexion.prepareStatement(sqlActualizar);
            // seteo de campos o campo
            declaracion.setString(1, "Nuevo Nombre-01");
            declaracion.setString(2, "Nuevo Apellido-01");
            declaracion.setString(3, "nuevomail@nuevomail.com");
            declaracion.setInt(4, 3);
            //Pasamos el ID del usuario que queremos actualizar
            declaracion.setInt(5, 1);

            // Ejecutamos la actualizacion
            int filaActualizada = declaracion.executeUpdate();

            // Estructura if que avisa si se actualizo o no
            if (filaActualizada>0) {
                System.out.println("Actualizacion exitosa");               
            } else {
                System.out.println("No se encontro registro para el ID");
                
            }

        } catch (Exception e) {
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
