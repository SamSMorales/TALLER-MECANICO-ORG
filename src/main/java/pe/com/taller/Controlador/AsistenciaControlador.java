package pe.com.taller.Controlador;

import javax.swing.JOptionPane;
import pe.com.taller.Modelo.Asistencia;
import pe.com.taller.Modelo.SQLAsistencia;

public class AsistenciaControlador extends SQLAsistencia {

    Asistencia modelo = new Asistencia();

    public void agregar(String evento, String dni) {

        modelo.setEvento(evento);
        modelo.setPersonal(dni.split(" ")[0]);

        try {
            insertarAsistencia(modelo);
            JOptionPane.showMessageDialog(null, "Registro Guardado");

        } catch (Exception ex) {
            System.out.println("Error : " + ex);
        }

    }

    public void modificar(int id, String evento, String dni) {

        try {

            modelo.setId(id);
            modelo.setEvento(evento);
            modelo.setPersonal(dni.split(" ")[0]);

            modificarAsistencia(modelo);
            JOptionPane.showMessageDialog(null, "Registro Modificado");


        } catch (Exception ex) {
            System.out.println(ex);

        }

    }

    public void eliminar(int idAsistencia) {

        try {

            modelo.setId(idAsistencia);
            int SioNo = JOptionPane.showConfirmDialog(null, "Desea eliminar?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (SioNo == JOptionPane.YES_OPTION) {

                if (eliminarAsistencia(modelo)) {

                    JOptionPane.showMessageDialog(null, "Registro Eliminado");

                } else {

                    JOptionPane.showMessageDialog(null, "Error al eliminar");

                }
            }
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }

    }

}
