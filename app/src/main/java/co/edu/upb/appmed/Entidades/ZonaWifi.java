package co.edu.upb.appmed.Entidades;

/**
 * Created by Juan D Giraldo M on 13/11/2017.
 */

public class ZonaWifi {

    private String barrio;
    private String comuna;
    private String direcci_n;
    private String nombre_comuna;
    private String nombre_del_sitio;

    public ZonaWifi(){

    }

    public ZonaWifi(String barrio, String comuna, String direcci_n, String nombre_comuna, String nombre_del_sitio){
        this.barrio = barrio;
        this.comuna = comuna;
        this.direcci_n = direcci_n;
        this.nombre_comuna = nombre_comuna;
        this.nombre_del_sitio = nombre_del_sitio;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getDirecci_n() {
        return direcci_n;
    }

    public void setDirecci_n(String direcci_n) {
        this.direcci_n = direcci_n;
    }

    public String getNombre_comuna() {
        return nombre_comuna;
    }

    public void setNombre_comuna(String nombre_comuna) {
        this.nombre_comuna = nombre_comuna;
    }

    public String getNombre_del_sitio() {
        return nombre_del_sitio;
    }

    public void setNombre_del_sitio(String nombre_del_sitio) {
        this.nombre_del_sitio = nombre_del_sitio;
    }
}
