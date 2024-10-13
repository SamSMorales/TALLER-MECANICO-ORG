package pe.com.taller.Modelo;

import java.time.LocalTime;
import java.util.Date;

public class RegistroAsistencia {

    private int id;
    private Empleado empleado;
    private Date fecha;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;

    public RegistroAsistencia(int id, Empleado empleado, Date fecha, LocalTime horaEntrada, LocalTime horaSalida) {
        this.id = id;
        this.empleado = empleado;
        this.fecha = fecha;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void marcarEntrada(LocalTime hora) {
        this.horaEntrada = hora;
    }

    public void marcarSalida(LocalTime hora) {
        this.horaSalida = hora;
    }

}
