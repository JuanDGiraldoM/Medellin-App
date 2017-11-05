package co.edu.upb.appmed;

import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

import co.edu.upb.appmed.Utilidades.Utilities;

public class ListadoSitiosActivity extends AppCompatActivity {

    private int activity;
    private String sitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_sitios);

        Bundle datos = this.getIntent().getExtras();
        activity = datos.getInt("activity");

        Geocoder geocoder = new Geocoder(this);

        switch (activity) {
            case Utilities.HOTELES:
                sitios = "Hoteles";
                break;
            case Utilities.MUSEOS:
                sitios = "Museos";
                break;
        }
        try {
            List<Address> addresses = geocoder.getFromLocationName(sitios, 100);
            Utilities.showAlert(this, "" + addresses.size());
        } catch (Exception e) {
            Utilities.showAlert(this, "Ha ocurrido un error con la búsqueda");
        }

    }

}
