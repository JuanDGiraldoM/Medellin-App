package co.edu.upb.appmed.Entidades;

import android.net.Uri;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Juan D Giraldo M on 6/11/2017.
 */

public class PlaceInfo {

    private String nombre;
    private String direccion;
    private String telefono;
    private String id;
    private Uri websiteUri;
    private LatLng latLng;
    private float rating;
    private String attributions;

    public PlaceInfo() {

    }

    public PlaceInfo(String nombre, String direccion, String telefono, String id, Uri websiteUri, LatLng latLng, float rating, String attributions) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.id = id;
        this.websiteUri = websiteUri;
        this.latLng = latLng;
        this.rating = rating;
        this.attributions = attributions;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Uri getWebsiteUri() {
        return websiteUri;
    }

    public void setWebsiteUri(Uri websiteUri) {
        this.websiteUri = websiteUri;
    }

    public LatLng getLatLng() {
        return latLng;
    }

    public void setLatLng(LatLng latLng) {
        this.latLng = latLng;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getAttributions() {
        return attributions;
    }

    public void setAttributions(String attributions) {
        this.attributions = attributions;
    }
}
