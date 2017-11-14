package co.edu.upb.appmed.Entidades;

/**
 * Created by Juan D Giraldo M on 13/11/2017.
 */

public class EstacionServicio {

    private String bandera;
    private String direccion;
    private String municipio;
    private String nombrecomercial;
    private String precio;
    private String producto;

    public  EstacionServicio(){

    }

    public EstacionServicio(String bandera, String direccion, String municipio, String nombrecomercial, String precio, String producto){
        this.bandera = bandera;
        this.direccion = direccion;
        this.municipio = municipio;
        this.nombrecomercial = nombrecomercial;
        this.precio = precio;
        this.producto = producto;
    }

    public String getBandera() {
        return bandera;
    }

    public void setBandera(String bandera) {
        this.bandera = bandera;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNombrecomercial() {
        return nombrecomercial;
    }

    public void setNombrecomercial(String nombrecomercial) {
        this.nombrecomercial = nombrecomercial;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
}
