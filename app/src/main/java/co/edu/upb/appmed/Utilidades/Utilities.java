package co.edu.upb.appmed.Utilidades;

import android.content.Context;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.IntDef;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.maps.model.LatLng;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * Created by Juan D Giraldo M on 2/11/2017.
 */

public class Utilities {

    public static final int ESTACIONES_SERVICIO = 0;
    public static final int HOSPITALES = 1;
    public static final int HOTELES = 2;
    public static final int MUSEOS = 3;
    public static final int PARQUES = 4;
    public static final int ESTACIONES_WIFI = 5;
    public static final int RESTAURANTES = 6;
    public static LatLng posicion_actual;
    private @Activity
    int activity;

    public static boolean hasConnection(Context context) {
        ConnectivityManager manager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = manager.getActiveNetworkInfo();
        boolean state = networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnected();
        if (!state)
            showAlert(context, "Comprueba tu conexión de red");
        return state;
    }

    public static void showAlert(Context context, String message) {
        Toast alert = Toast.makeText(context, message, Toast.LENGTH_LONG);
        alert.show();
    }

    public static boolean isServicesOk(Context context) {
        int available = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);

        if (available == ConnectionResult.SUCCESS)
            return true;
        else
            showAlert(context, "Ha ocurrido un error con Google Play Services");
        return false;
    }

    public int getActivity() {
        return activity;
    }

    public void setActivity(int activity) {
        this.activity = activity;
    }

    public double calcularDistaciaKms(LatLng coordenadas) {
        double radioTierra = 6371;
        double dLat = Math.toRadians(coordenadas.latitude - posicion_actual.latitude);
        double dLng = Math.toRadians(coordenadas.longitude - posicion_actual.longitude);
        double sindLat = Math.sin(dLat / 2);
        double sindLng = Math.sin(dLng / 2);
        double va1 = Math.pow(sindLat, 2) + Math.pow(sindLng, 2)
                * Math.cos(Math.toRadians(posicion_actual.latitude)) * Math.cos(Math.toRadians(coordenadas.latitude));
        double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));
        double distancia = radioTierra * va2;

        return distancia;
    }

    @Retention(SOURCE)
    @IntDef({
            ESTACIONES_SERVICIO,
            HOSPITALES,
            HOTELES,
            MUSEOS,
            PARQUES,
            ESTACIONES_WIFI,
            RESTAURANTES
    })

    public @interface Activity {
    }
}
