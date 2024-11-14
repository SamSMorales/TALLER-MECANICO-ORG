package pe.com.taller.Modelo;

import java.time.LocalTime;
import java.util.Date;

public class Asistencia {

    private int id;
    private String evento;
    private LocalTime hora;
    private Date fecha;
    private String personal;

    public Asistencia(int id, String evento, LocalTime hora, Date fecha, String personal) {
        this.id = id;
        this.evento = evento;
        this.hora = hora;
        this.fecha = fecha;
        this.personal = personal;
    }

    public Asistencia() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPersonal() {
        return personal;
    }

    public void setPersonal(String personal) {
        this.personal = personal;
    }

}
