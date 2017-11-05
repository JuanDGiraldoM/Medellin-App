package co.edu.upb.appmed.Utilidades;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.IntDef;
import android.widget.Toast;

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

    private @Activity
    int activity;

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

    public int getActivity() {
        return activity;
    }

    public void setActivity(int activity) {
        this.activity = activity;
    }

    public static boolean hasConnection(Context context) {
        ConnectivityManager manager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = manager.getActiveNetworkInfo();
        boolean state = networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnected();
        return state;
    }

    public static void showAlert (Context context, String message){
        Toast alert = Toast.makeText(context, message, Toast.LENGTH_LONG);
        alert.show();
    }
}
