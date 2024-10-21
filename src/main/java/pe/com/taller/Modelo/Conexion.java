package pe.com.taller.Modelo;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * CONEXION A LA BASE DE DATOS
 */
public class Conexion {

    public static String url = "jdbc:mysql://localhost/bd_taller_mecanico";
    public static String user = "root";
    public static String password = "root";

    public static Connection conectar() {

        Connection conexion = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, user, password);
            
            System.out.println("Conexion establecida mensaje en consola para comprobar");

        } catch (HeadlessException | ClassNotFoundException | SQLException e) {

            System.out.println("Error de conexión: " + e);

        }

        return conexion;

    }
    
        public static void desconectar(){
            
            Connection conexion = null;
            if (conexion == null) {
                
                System.out.println("La variable de conexion ha sido puesta en null");
                
            }
            
        }
        

}
