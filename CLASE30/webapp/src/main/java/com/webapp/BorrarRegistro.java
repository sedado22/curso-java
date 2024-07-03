package com.webapp;

import java.sql.*;

public class BorrarRegistro {
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
            String sqlBorrar = "DELETE FROM usuarios WHERE idUsuario = ?";
            //Preparamos la declaracion
            declaracion = conexion.prepareStatement(sqlBorrar);
            //Ejecutamos
            declaracion.setInt(1, 1);
            int filaEliminada = declaracion.executeUpdate();

            // Estructura if que avisa si se actualizo o no
            if (filaEliminada>0) {
                System.out.println("Fila eliminada");               
            } else {
                System.out.println("No se encontro registro para el ID");
                
            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            try {
                if (declaracion != null) declaracion.close();
                if (conexion != null) conexion.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
