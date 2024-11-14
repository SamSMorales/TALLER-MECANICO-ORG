package pe.com.taller.Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SQLPlanilla extends Conexion {

    public void MostrarTabla(JTable tabla) {
        Connection cn = this.getconexion();

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("DNI");
        modelo.addColumn("Sueldo base");
        modelo.addColumn("Días laborados");
        modelo.addColumn("Descuento");
        modelo.addColumn("Sueldo Bruto");
        modelo.addColumn("Fecha");

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(obtenerConsultaPlanilla());

            while (rs.next()) {
                Object[] datos = obtenerDatosEmpleado(rs);
                modelo.addRow(datos);
            }

            tabla.setModel(modelo);

        } catch (SQLException e) {
            System.out.println("Error al listar los datos: " + e);
        }
    }

    private String obtenerConsultaPlanilla() {
        return "SELECT e.idempleado, e.nombre, e.dni, e.sueldo_base, "
                + "COUNT(DISTINCT ra.fecha) AS dias_laborados, MAX(ra.fecha) AS ultima_fecha "
                + "FROM empleado e "
                + "LEFT JOIN registro_asistencia ra ON e.idempleado = ra.idempl "
                + "GROUP BY e.idempleado, e.nombre, e.dni, e.sueldo_base";
    }

    private Object[] obtenerDatosEmpleado(ResultSet rs) throws SQLException {
        int id = rs.getInt("idempleado");
        String nombre = rs.getString("nombre");
        String dni = rs.getString("dni");
        double sueldoBase = rs.getDouble("sueldo_base");
        int diasLaborados = rs.getInt("dias_laborados");
        String ultimaFecha = rs.getString("ultima_fecha");

        double descuento = calcularDescuento(sueldoBase, diasLaborados);
        double sueldoBruto = sueldoBase - descuento;

        return new Object[]{id, nombre, dni, sueldoBase, diasLaborados, descuento, sueldoBruto, ultimaFecha};
    }

    public double calcularDescuento(double sueldoBase, int diasLaborados) {
        double sueldoDiario = sueldoBase / 7.0;
        return (7 - diasLaborados) * sueldoDiario;
    }

    public double calcularSueldoBruto(double sueldoBase, double descuento) {
        return sueldoBase - descuento;
    }

}
