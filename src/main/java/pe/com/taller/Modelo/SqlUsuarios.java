package pe.com.taller.Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlUsuarios extends Conexion {

    Connection con = getconexion();

    public void insertarUsuarios(Usuarios usua) throws Exception {

        try {

            this.getconexion();

            String sql = "INSERT INTO usuarios (usuario, password, idtipo_usuario) "
                    + "VALUES (?, ?, (SELECT idtipo_usuario FROM tipo_usuario WHERE tipo=?))";

            // Crear un objeto PreparedStatement para ejecutar la consulta SQL
            PreparedStatement pre = this.con.prepareStatement(sql);

            //Establecemos los parametros de la consulta SQL
            pre.setString(1, usua.getUsuario());
            pre.setString(2, usua.getPassword());
            pre.setString(3, usua.getTipo());

            pre.executeUpdate();

        } catch (SQLException e) {

            throw e;

        }

    }

    public boolean login(Usuarios usr) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getconexion();

        String sql = "SELECT idusuarios, usuario, password, idtipo_usuario FROM usuarios WHERE usuario = ?";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {

                if (usr.getPassword().equals(rs.getString(3))) {

                    usr.setId(rs.getInt(1));
                    usr.setId_tipo(rs.getInt(4));

                    return true;

                } else {

                    return false;
                }

            }

            return false;

        } catch (SQLException ex) {

            System.out.println("Error:" + ex);
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

            // Establece el valor del parámetro en la consulta
            ps.setString(1, usuario);

            // Ejecuta la consulta
            rs = ps.executeQuery();

            if (rs.next()) {

                // Devuelve el conteo de usuarios encontrados
                return rs.getInt(1);

            }

            return 1;

        } catch (SQLException ex) {

            System.out.println("Error : " + ex);
            return 1;

        }

    }

}
