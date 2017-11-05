package co.edu.upb.appmed.Entidades;

/**
 * Created by Juan D Giraldo M on 1/11/2017.
 */

public class Hospital extends Sitio {

    private String nombre_municipio;
    private String email;
    private String telefono;

    public Hospital(String nombre, String nombre_municipio, String email, String telefono) {
        super(nombre);
    }
}

