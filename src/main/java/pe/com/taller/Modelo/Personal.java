package pe.com.taller.Modelo;

import java.util.Date;

public class Personal {

    private int id_empleado;
    private String nombre;
    private String apellido;
    private String dni;
    private String puesto;
    private double salarioBase;
    private Date fechaContratacion;
    private int estado;

    public Personal(String nombre, String apellido, String dni, String puesto, double salarioBase, Date fechaContratacion, int estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.puesto = puesto;
        this.salarioBase = salarioBase;
        this.fechaContratacion = fechaContratacion;
        this.estado = estado;
    }

    public Personal() {
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void RegistrarEntrada() {

    }

    public void RegistrarSalida() {

    }

    public Double CalcularSalario() {
        return 0.0;
    }

    public String GenerarPerfil() {
        return "";
    }

}
