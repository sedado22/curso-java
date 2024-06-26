package com.webapp;
import java.sql.*;

public class CrearBdyTabla {
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
            connection = DriverManager.getConnection(url, user, password);
            // Inicializamos statement
            statement = connection.createStatement(); //statement nos ayuda con las declaraciones sql
            // creamos la base de datos
            String sql = "CREATE DATABASE IF NOT EXISTS mis_usuarios";
            // ejecutamos la sentencia
            statement.executeUpdate(sql);
            // mensaje de exito
            System.out.println("Se Creo el esquema de base de datos o ya existia");
            // nos conectamos a la base de datos creada 
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url + schema , user , password);
            System.out.println("Conectado a la base de datos: "+ schema + " Creando Tablas solicitadas ");
            statement = connection.createStatement();
            // Creamos la tabla paises si no existe
            // Clausula sql
            String crearTableSql = "CREATE TABLE IF NOT EXISTS paises ("
                    + "idPais INT AUTO_INCREMENT PRIMARY KEY, "
                    + "nombrePais VARCHAR(150) NOT NULL"
                    + ")";
            //Ejecutamos la clausula sql
            statement.executeUpdate(crearTableSql);
            System.out.println("Se creo la tabla paises exitosamente o la misma ya existia");
            // Creamos la tabla de usuarios
            String crearTableSql2 = "CREATE TABLE IF NOT EXISTS usuarios ("
                    + "idUsuario INT AUTO_INCREMENT PRIMARY KEY, "
                    + "nombre VARCHAR(255) NOT NULL, "
                    + "apellido VARCHAR(255) NOT NULL, "
                    + "email VARCHAR(100) NOT NULL, "
                    + "fkPais INT, "
                    + "FOREIGN KEY (fkPais) REFERENCES paises(idPais)"
                    + ")";
            //Ejecutamos la clausula sql
            statement.executeUpdate(crearTableSql2);
            System.out.println("Se creo la tabla usuarios exitosamente o la misma ya existia");          
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
