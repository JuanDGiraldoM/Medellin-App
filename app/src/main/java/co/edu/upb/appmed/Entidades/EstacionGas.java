package co.edu.upb.appmed.Entidades;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Juan D Giraldo M on 13/11/2017.
 */

public class EstacionGas {

    private String ciudad;
    private String direccion;
    private String estacion;
    private String ubicacion;
    private LatLng coordenadas;

    public EstacionGas() {

    }

    public EstacionGas(String ciudad, String direccion, String estacion, String ubicacion, LatLng coordenadas) {
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.estacion = estacion;
        this.ubicacion = ubicacion;
        this.coordenadas = coordenadas;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public LatLng getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(LatLng coordenadas) {
        this.coordenadas = coordenadas;
    }
}
