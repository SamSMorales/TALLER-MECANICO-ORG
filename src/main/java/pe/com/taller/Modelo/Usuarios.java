package pe.com.taller.Modelo;

public class Usuarios {

    private int idUsuarios;
    private String usuario;
    private String password;
    private String rol;

    public Usuarios(int idUsuarios, String usuario, String password, String rol) {
        this.idUsuarios = idUsuarios;
        this.usuario = usuario;
        this.password = password;
        this.rol = rol;
    }


    public int getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

}
