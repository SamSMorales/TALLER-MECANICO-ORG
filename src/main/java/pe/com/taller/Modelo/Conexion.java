package pe.com.taller.Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * CONEXION A LA BASE DE DATOS
 */
public class Conexion {

    private final String base = "bd_taller_mecanico";
    private final String user = "root";
    private final String password = "root";
    private final String url = "jdbc:mysql://localhost:3306/" + base;

    private Connection con = null;

    public Connection getconexion() {

        try {

            // Carga el driver JDBC para MySQL, para comunicarse con la base de datos.
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establece la conexión utilizando la URL, el usuario y la contraseña proporcionados.
            con = DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException ex) {

            System.out.println("Error: Driver JDBC no encontrado");
            ex.printStackTrace(); // Imprime el stack trace para más detalles

        } catch (SQLException ex) {

            System.out.println("Error: No se pudo establecer la conexión a la base de datos.");
            ex.printStackTrace();
        }

        return con;

    }

}
