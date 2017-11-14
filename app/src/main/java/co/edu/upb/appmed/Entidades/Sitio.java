package co.edu.upb.appmed.Entidades;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Juan D Giraldo M on 3/11/2017.
 */

public class Sitio {

    protected String nombre;
    protected String direccion;
    protected LatLng coordenadas;

    public Sitio() {

    }

    public Sitio(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LatLng getUbicacion() {
        return coordenadas;
    }

    public void setUbicacion(LatLng ubicacion) {
        this.coordenadas = ubicacion;
    }
}
