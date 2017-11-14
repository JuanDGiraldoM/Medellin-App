package co.edu.upb.appmed.Holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.model.LatLng;

import co.edu.upb.appmed.R;
import co.edu.upb.appmed.Utilidades.Utilities;

/**
 * Created by Juan D Giraldo M on 13/11/2017.
 */

public class SitioHolder extends RecyclerView.ViewHolder {

    private View mView;

    public SitioHolder(View itemView) {
        super(itemView);
        this.mView = itemView;
    }

    public void setNombre(String nombre){
        TextView field = mView.findViewById(R.id.txtNombre);
        field.setText(nombre);
    }

    public void setDireccion(String direccion){
        TextView field = mView.findViewById(R.id.txtDireccion);
        field.setText(direccion);
    }

    public void setAdicional(String adicional){
        TextView field = mView.findViewById(R.id.txtDistancia);
        field.setText(adicional);
    }
}
