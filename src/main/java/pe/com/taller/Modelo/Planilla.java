package pe.com.taller.Modelo;

public class Planilla {

    private int idPlanilla;
    private Personal empleado;
    private String periodo;
    private double salarioCalculado;

    public int getIdPlanilla() {
        return idPlanilla;
    }

    public void setIdPlanilla(int idPlanilla) {
        this.idPlanilla = idPlanilla;
    }

    public Personal getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Personal empleado) {
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

    public void generarPlanilla() {

    }

}
