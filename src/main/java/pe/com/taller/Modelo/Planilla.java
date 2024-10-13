package pe.com.taller.Modelo;

public class Planilla {

    private int idPlanilla;
    private Empleado empleado;
    private String periodo;
    private double salarioCalculado;

    public Planilla(int idPlanilla, Empleado empleado, String periodo, double salarioCalculado) {
        this.idPlanilla = idPlanilla;
        this.empleado = empleado;
        this.periodo = periodo;
        this.salarioCalculado = salarioCalculado;
    }

    public int getIdPlanilla() {
        return idPlanilla;
    }

    public void setIdPlanilla(int idPlanilla) {
        this.idPlanilla = idPlanilla;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public double getSalarioCalculado() {
        return salarioCalculado;
    }

    public void setSalarioCalculado(double salarioCalculado) {
        this.salarioCalculado = salarioCalculado;
    }

    public double calcularSalario() {
        return 0.0;
    }

    public void generarPlanilla() {

    }

}
