package pe.com.taller.Modelo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        
        } catch (ClassNotFoundException ex) {
        
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;

    }

}
