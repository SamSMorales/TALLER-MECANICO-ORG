package pe.com.taller.Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SqlUsuarios extends Conexion {

    public boolean registrar(Usuarios usr) {

        PreparedStatement ps = null;
        Connection con = getconexion();

        String sql = "INSERT INTO usuarios (nombre, usuario, password, idtipo_usuario) "
                + "VALUES (?, ?, ?, ?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getNombre());
            ps.setString(2, usr.getUsuario());
            ps.setString(3, usr.getPassword());
            ps.setInt(4, usr.getId_tipo());
            ps.execute();
            return true;

        } catch (SQLException ex) {

            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }

    }

    public boolean login(Usuarios usr) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getconexion();

        String sql = "SELECT idusuarios, nombre, usuario, password, idtipo_usuario FROM usuarios WHERE  usuario = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {

                if (usr.getPassword().equals(rs.getString(4))) {

                    usr.setId(rs.getInt(1));
                    usr.setNombre(rs.getNString(2));
                    usr.setId_tipo(rs.getInt(5));

                    return true;
                } else {

                    return false;
                }

            }

            return false;

        } catch (SQLException ex) {

            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }

    }

    public int existeUsuario(String usuario) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getconexion();

        String sql = "SELECT count(idusuarios) FROM usuarios WHERE  usuario = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();

            if (rs.next()) {

                return rs.getInt(1);

            }

            return 1;

        } catch (SQLException ex) {

            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return 1;

        }

    }

}
