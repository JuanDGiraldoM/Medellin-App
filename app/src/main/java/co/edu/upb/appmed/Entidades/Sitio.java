package co.edu.upb.appmed.Entidades;

/**
 * Created by Juan D Giraldo M on 3/11/2017.
 */

public class Sitio {

    protected String nombre;
    protected String direccion;
    protected String ubicacion;
    protected double distancia;

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

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Sitio(String nombre) {
        this.nombre = nombre;
    }
}
