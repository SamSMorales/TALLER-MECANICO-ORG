
package pe.com.taller.Modelo;

import pe.com.taller.Controlador.PersonalControlador;
import pe.com.taller.Vista.AdmPersonalRegistrado;
import pe.com.taller.Vista.GestionPersonal;
import pe.com.taller.Vista.Login;
import pe.com.taller.Vista.RegistroAsistencia;



public class mvcPrincipal {
    
    
    public static void main(String[] args) {
        
        Login.main(args);
        
        Personal p = new Personal();
        SQLPersonal sqlp = new SQLPersonal();
        GestionPersonal frmpersonal = new GestionPersonal();
        
        AdmPersonalRegistrado apr = new AdmPersonalRegistrado();
        PersonalControlador controlador = new PersonalControlador();
        
        Asistencia a = new Asistencia();
        SQLAsistencia asistencia = new SQLAsistencia();
        RegistroAsistencia frmasistencia = new RegistroAsistencia();
       
        
    }
    
}
