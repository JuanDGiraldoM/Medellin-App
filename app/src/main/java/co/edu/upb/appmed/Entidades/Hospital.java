package co.edu.upb.appmed.Entidades;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Juan D Giraldo M on 1/11/2017.
 */

public class Hospital{

    private String direcci_n;
    private String direcci_n_correo_electr_nico;
    private String n_mero_tel_fono;
    private String nombre_municipio;
    private String nombre_sede;

    public Hospital(){

    }

    public Hospital(String direcci_n, String direcci_n_correo_electr_nico, String n_mero_tel_fono, String nombre_municipio, String nombre_sede){
        this.direcci_n = direcci_n;
        this.direcci_n_correo_electr_nico = direcci_n_correo_electr_nico;
        this.n_mero_tel_fono = n_mero_tel_fono;
        this.nombre_municipio = nombre_municipio;
        this.nombre_sede = nombre_sede;
    }

    public String getDirecci_n() {
        return direcci_n;
    }

    public void setDirecci_n(String direcci_n) {
        this.direcci_n = direcci_n;
    }

    public String getDirecci_n_correo_electr_nico() {
        return direcci_n_correo_electr_nico;
    }

    public void setDirecci_n_correo_electr_nico(String direcci_n_correo_electr_nico) {
        this.direcci_n_correo_electr_nico = direcci_n_correo_electr_nico;
    }

    public String getN_mero_tel_fono() {
        return n_mero_tel_fono;
    }

    public void setN_mero_tel_fono(String n_mero_tel_fono) {
        this.n_mero_tel_fono = n_mero_tel_fono;
    }

    public String getNombre_municipio() {
        return nombre_municipio;
    }

    public void setNombre_municipio(String nombre_municipio) {
        this.nombre_municipio = nombre_municipio;
    }

    public String getNombre_sede() {
        return nombre_sede;
    }

    public void setNombre_sede(String nombre_sede) {
        this.nombre_sede = nombre_sede;
    }
}

