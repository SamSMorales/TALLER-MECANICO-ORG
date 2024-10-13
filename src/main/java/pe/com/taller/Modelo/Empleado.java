package pe.com.taller.Modelo;

import java.util.Date;

public class Empleado {

    private int id_empleado;
    private String nombre;
    private String apellido;
    private int dni;
    private String puesto;
    private double salarioBase;
    private Date fechaContratacion;

    public Empleado(int id_empleado, String nombre, String apellido, int dni, String puesto, double salarioBase, Date fechaContratacion) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.puesto = puesto;
        this.salarioBase = salarioBase;
        this.fechaContratacion = fechaContratacion;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
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
