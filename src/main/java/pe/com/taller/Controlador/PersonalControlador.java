package pe.com.taller.Controlador;

import javax.swing.JOptionPane;
import pe.com.taller.Modelo.Personal;
import pe.com.taller.Modelo.SQLPersonal;

public class PersonalControlador extends SQLPersonal {

    Personal modelo = new Personal();

    public void guardar(String nombre, String apellido, String dni, String puesto, double sueldo) {

        if (!nombre.isEmpty() && !apellido.isEmpty() && !dni.isEmpty()) {

            modelo.setNombre(nombre);
            modelo.setApellido(apellido);
            modelo.setDni(dni);
            modelo.setPuesto(puesto);

            try {
                
                modelo.setSalarioBase(sueldo);

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(null, "El sueldo debe ser un número válido.");
                return; // Salir del método si hay un error

            }

            if (registrar(modelo)) {
                
                JOptionPane.showMessageDialog(null, "Registro Guardado");


            } else {
                
                JOptionPane.showMessageDialog(null, "Error al Guardar");

            }
        } else {
            
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos requeridos.");

        }

    }

    public void modificar(int idpersonal, String nombre, String apellido, String dni, String puesto, double sueldo) {

        try {

            modelo.setId_empleado(idpersonal);
            modelo.setNombre(nombre);
            modelo.setApellido(apellido);
            modelo.setDni(dni);
            modelo.setPuesto(puesto);

            try {
                modelo.setSalarioBase(sueldo);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El sueldo debe ser un número válido.");
                return; // Salir del método si hay un error

            }
            
            modelo.setEstado(1);

            modificarPersona(modelo);
            JOptionPane.showMessageDialog(null, "Registro Modificado");


        } catch (Exception ex) {
            
            System.out.println(ex);

        }

    }

    public void eliminar(int idpersonal) {

        try {

            modelo.setId_empleado(idpersonal);

            int SioNo = JOptionPane.showConfirmDialog(null, "Desea eliminar?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (SioNo == JOptionPane.YES_OPTION) {

                // Llama al método de eliminación lógica
                if (eliminar(modelo)) {

                    JOptionPane.showMessageDialog(null, "Registro Eliminado");

                } else {

                    JOptionPane.showMessageDialog(null, "Error al eliminar");

                }
            }
        } catch (Exception e) {

            e.printStackTrace();

        }
    }

}
