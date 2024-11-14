package pe.com.taller.Controlador;

import javax.swing.JOptionPane;
import pe.com.taller.Modelo.SqlUsuarios;
import pe.com.taller.Modelo.Usuarios;

public class ControladorRegistro extends SqlUsuarios {

    Usuarios modelo = new Usuarios();

    public void agregar(String nombre, String contraseña, String tipo) {

        modelo.setUsuario(nombre);
        modelo.setPassword(contraseña);
        modelo.setTipo(tipo);

        try {
            
            insertarUsuarios(modelo);
            JOptionPane.showMessageDialog(null, "Registro Guardado");

        } catch (Exception ex) {
            
            System.out.println("Error : " + ex);
        
        }

    }

}
