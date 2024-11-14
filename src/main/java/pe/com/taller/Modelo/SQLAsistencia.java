package pe.com.taller.Modelo;

//Import para elaborar los reportes en PDF
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SQLAsistencia extends Conexion {

    Connection con = getconexion();

    public void insertarAsistencia(Asistencia asist) throws Exception {

        try {

            this.getconexion();
            String sql = "INSERT INTO registro_asistencia (evento, hora, fecha, idempl) "
                    + "VALUES (?, CURRENT_TIMESTAMP, CURRENT_DATE, (SELECT idempleado FROM empleado WHERE nombre=?))";

            // Crear un objeto PreparedStatement para ejecutar la consulta SQL
            PreparedStatement pre = this.con.prepareStatement(sql);

            //Establecemos los parametros de la consulta SQL
            pre.setString(1, asist.getEvento());
            pre.setString(2, asist.getPersonal());
            pre.executeUpdate();

        } catch (Exception e) {

            throw e;

        }

    }

    public void modificarAsistencia(Asistencia asist) throws Exception {
        try {

            this.getconexion();

            String sql = "UPDATE registro_asistencia SET evento = ?, hora = CURRENT_TIMESTAMP, fecha = CURRENT_DATE, "
                    + "idempl = (SELECT idempleado FROM empleado WHERE nombre=?) WHERE idregistro=?";

            PreparedStatement pre = this.con.prepareStatement(sql);

            pre.setString(1, asist.getEvento());
            pre.setString(2, asist.getPersonal());
            pre.setInt(3, asist.getId());

            pre.executeUpdate();

        } catch (Exception e) {
            throw e;
        }
    }

    public boolean eliminarAsistencia(Asistencia asist) throws Exception {
        try {

            this.getconexion();

            String sql = "DELETE FROM registro_asistencia WHERE idregistro=?";

            PreparedStatement pre = this.con.prepareStatement(sql);
            pre.setInt(1, asist.getId());

            pre.executeUpdate();

            return true;

        } catch (SQLException e) {

            e.printStackTrace();
            return false;
        }

    }

    public void MostrarTabla(JTable tabla) {

        Connection cn = this.getconexion();

        //Creamos un objeto de tipo de tipo DefaultTableModel
        DefaultTableModel modelo = new DefaultTableModel();

        //Columnas de la tabla
        modelo.addColumn("ID");
        modelo.addColumn("Evento");
        modelo.addColumn("hora");
        modelo.addColumn("fecha");
        modelo.addColumn("empleado");
        modelo.addColumn("DNI");

        String consultasql = "SELECT ra.idregistro, ra.evento, ra.hora, ra.fecha, e.nombre, e.dni FROM registro_asistencia ra JOIN empleado e ON ra.idempl = e.idempleado";

        Statement st;

        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(consultasql);

            //Itera los registros devueltos por la consulta SQL
            while (rs.next()) {

                //Arreglo de objetos con los valores de cada registro
                Object[] lista = {
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6)};

                modelo.addRow(lista);
            }

            tabla.setModel(modelo);

        } catch (Exception e) {

            System.out.println("Error al listar los datos " + e);

        }

    }

    public void buscarAsistencia(String input, JTable tabla) {

        Connection cn = this.getconexion();

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID");
        modelo.addColumn("Evento");
        modelo.addColumn("hora");
        modelo.addColumn("fecha");
        modelo.addColumn("empleado");
        modelo.addColumn("DNI");

        String sql = "SELECT ra.idregistro, ra.evento, ra.hora, ra.fecha, e.nombre, e.dni FROM registro_asistencia ra JOIN empleado e ON ra.idempl = e.idempleado WHERE ra.evento LIKE ? OR e.nombre LIKE ?";

        try ( PreparedStatement pst = cn.prepareStatement(sql)) {

            // Se establecen los parámetros de la consulta SQL preparada.
            pst.setString(1, "%" + input + "%");
            pst.setString(2, "%" + input + "%");

            ResultSet rs = pst.executeQuery();

            modelo.setRowCount(0); // Limpia el modelo antes de agregar nuevos resultados

            while (rs.next()) {

                Object[] lista = {
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6)
                };

                modelo.addRow(lista);
            }

            tabla.setModel(modelo);

        } catch (SQLException e) {

            System.err.println("Error al buscar datos: " + e);

        }
    }

    public void reporte() {

        Document documento = new Document();

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Downloads/reporte_asistencia.pdf"));

            Image header = Image.getInstance("src/main/java/pe/com/taller/img/banner.jpg");
            header.scaleToFit(650, 180);
            header.setAlignment(Chunk.ALIGN_CENTER);

            Paragraph parrafo1 = new Paragraph();
            parrafo1.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo1.add("Reporte de Asistencia del Personal \n\n");
            parrafo1.setFont(FontFactory.getFont("Tahoma", 20, Font.BOLD, BaseColor.DARK_GRAY));

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_LEFT);
            parrafo.add("Taller Mecanico ChikiCard \n\n");
            parrafo.add("RUC: 1212121212 \n\n");
            parrafo.add("Dirección: Av. Nuevo - Piura \n\n");
            Date date = new Date();
            parrafo.add("Fecha : " + new SimpleDateFormat("dd-mm-yyyy").format(date) + "\n\n");
            parrafo.setFont(FontFactory.getFont("Roboto", 16, Font.BOLD, BaseColor.DARK_GRAY));

            documento.open();
            documento.add(header);
            documento.add(parrafo1);
            documento.add(parrafo);

            PdfPTable tabla = new PdfPTable(6);
            tabla.addCell("ID");
            tabla.addCell("Evento");
            tabla.addCell("Hora");
            tabla.addCell("Fecha");
            tabla.addCell("Nombre Empleado");
            tabla.addCell("NRO. DNI");

            try {

                PreparedStatement ps = null;
                ResultSet rs = null;
                Connection con = this.getconexion();
                String sql = "SELECT ra.idregistro, ra.evento, ra.hora, ra.fecha, e.nombre, e.dni FROM registro_asistencia ra JOIN empleado e ON ra.idempl = e.idempleado";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();

                if (rs.next()) {

                    do {

                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        tabla.addCell(rs.getString(6));

                    } while (rs.next());

                    documento.add(tabla);

                }

            } catch (DocumentException | HeadlessException | SQLException e) {

            }

            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado");

        } catch (DocumentException | HeadlessException | FileNotFoundException e) {

        } catch (IOException e) {

            System.out.println("Error en la Imagen" + e);

        }

    }

}
