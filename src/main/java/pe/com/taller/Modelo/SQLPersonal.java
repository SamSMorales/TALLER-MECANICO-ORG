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

public class SQLPersonal extends Conexion {

    public boolean registrar(Personal pers) {
        PreparedStatement ps = null;
        Connection con = getconexion();

        String sql = "INSERT INTO empleado (nombre, apellido, dni, puesto, sueldo_base, fecha_contratacion) VALUES(?,?,?,?,?, CURRENT_DATE)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pers.getNombre());
            ps.setString(2, pers.getApellido());
            ps.setString(3, pers.getDni());
            ps.setString(4, pers.getPuesto());
            ps.setDouble(5, pers.getSalarioBase());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;

        } finally {

            try {
                con.close();

            } catch (SQLException e) {
                System.err.println(e);

            }
        }
    }

    public void modificarPersona(Personal pers) throws Exception {
        try {
            Connection con = getconexion();

            String sql = "update empleado set nombre=?, apellido=?, dni=?,puesto=?, sueldo_base=?, activo=?  where idempleado=?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, pers.getNombre());
            pre.setString(2, pers.getApellido());
            pre.setString(3, pers.getDni());
            pre.setString(4, pers.getPuesto());
            pre.setDouble(5, pers.getSalarioBase());
            pre.setInt(6, 1);
            pre.setInt(7, pers.getId_empleado());
            pre.executeUpdate();

        } catch (Exception e) {
            throw e;
        }
    }

    public boolean eliminar(Personal pers) throws Exception {

        try {

            Connection con = getconexion();
            String sql = "UPDATE empleado SET activo = FALSE WHERE idempleado = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, pers.getId_empleado());
            ps.executeUpdate();
            return true;

        } catch (SQLException e) {

            e.printStackTrace();
            return false;

        }
    }

    public void buscar(String input, JTable tabla) {

        Connection cn = this.getconexion();

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("DNI");
        modelo.addColumn("Puesto");
        modelo.addColumn("Sueldo Base");

        //String sql = "SELECT * FROM empleado WHERE nombre LIKE ? OR puesto LIKE ?";
        
        String sql = "SELECT * FROM empleado WHERE (nombre LIKE ? OR puesto LIKE ?) AND activo = TRUE";
        
        try ( PreparedStatement pst = cn.prepareStatement(sql)) {
            
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
                    rs.getDouble(6)
                        
                };
                
                modelo.addRow(lista);
                
            }
            tabla.setModel(modelo);
            
        } catch (SQLException e) {
            
            System.err.println("Error al buscar datos: " + e);
            
        }
    }

    public void MostrarTable(JTable tabla) {

        Connection cn = this.getconexion();

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("DNI");
        modelo.addColumn("Puesto");
        modelo.addColumn("Sueldo Base");

        String consultasql = "SELECT * FROM empleado WHERE activo = TRUE";

        Statement st;

        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(consultasql);

            while (rs.next()) {

                Object[] lista = {
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getDouble(6)};

                modelo.addRow(lista);
            }

            tabla.setModel(modelo);

        } catch (Exception e) {

            System.out.println("Error al listar los datos " + e);

        }

    }

    public void reporte() {

        Document documento = new Document();

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Downloads/reporte_personal.pdf"));

            Image header = Image.getInstance("src/main/java/pe/com/taller/img/banner.jpg");
            header.scaleToFit(650, 180);
            header.setAlignment(Chunk.ALIGN_CENTER);

            Paragraph parrafo1 = new Paragraph();
            parrafo1.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo1.add("Reporte de Personal Registrado \n\n");
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

            PdfPTable tabla = new PdfPTable(7);
            tabla.addCell("ID");
            tabla.addCell("Nombre");
            tabla.addCell("Apellido");
            tabla.addCell("DNI");
            tabla.addCell("Puesto");
            tabla.addCell("Sueldo Base");
            tabla.addCell("Fecha contratación");

            try {

                PreparedStatement ps = null;
                ResultSet rs = null;
                Connection con = this.getconexion();
                String sql = "SELECT idempleado, nombre, apellido, dni, puesto, sueldo_base, fecha_contratacion FROM empleado";
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
                        tabla.addCell(rs.getString(7));

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
