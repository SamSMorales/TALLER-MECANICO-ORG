package pe.com.taller.Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsultaUsuarios {

    public boolean login(Usuarios usr) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = null;

        // Verifica que usr no sea null
        if (usr == null || usr.getUsuario() == null || usr.getPassword() == null) {
            
            System.err.println("El objeto Usuarios o sus atributos son nulos.");
            return false;
        
        }


        String sql = "SELECT idusuarios, usuario, contraseña, rol FROM usuarios WHERE usuario = ?";

        try {
            
            Conexion conexion = new Conexion();
            
            con = null;
            
            if (con == null) {
                
            System.err.println("No se pudo establecer la conexión a la base de datos.");
            return false; // Manejo de error si la conexión es nula
        
            }
            
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {
                 // Compara la contraseña
                 
                if (usr.getPassword().equals(rs.getString("contraseña"))) {

                    usr.setIdUsuarios(rs.getInt("idusuarios"));
                    usr.setUsuario(rs.getString("usuario"));
                    usr.setRol(rs.getString("rol"));

                    return true; // login exitoso

                } else {

                    return false; // Contraseña incorrecta
                }

            }

            return false; // Usuario no encontrado

        } catch (SQLException e) {

            Logger.getLogger(ConsultaUsuarios.class.getName()).log(Level.SEVERE, null, e);
            return false;

        } finally {
            // Cierra los recursos en el bloque finally
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                Logger.getLogger(ConsultaUsuarios.class.getName()).log(Level.SEVERE, null, e);
            }

        }
    }

}
