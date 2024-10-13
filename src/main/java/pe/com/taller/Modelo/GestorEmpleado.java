package pe.com.taller.Modelo;

import java.util.ArrayList;
import java.util.List;

public class GestorEmpleado {

    private List<Empleado> listaempleados = new ArrayList<>();

    public void registrarEmpleado(Empleado empleado) {

        listaempleados.add(empleado);
    }

    public void eliminarEmpleado(int id) {

        listaempleados.removeIf(e -> e.getId_empleado() == id);
    }

    public Empleado buscarEmpleado(int id) {

        return listaempleados.stream().filter(e -> e.getId_empleado() == id)
                .findFirst().orElse(null);
    }

    public List<Empleado> listarEmpleados() {
        return listaempleados;
    }

}
