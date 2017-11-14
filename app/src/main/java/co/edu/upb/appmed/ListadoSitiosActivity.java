package co.edu.upb.appmed;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

import co.edu.upb.appmed.Entidades.EstacionServicio;
import co.edu.upb.appmed.Entidades.Hospital;
import co.edu.upb.appmed.Entidades.ZonaWifi;
import co.edu.upb.appmed.Holders.SitioHolder;
import co.edu.upb.appmed.Utilidades.Utilities;

public class ListadoSitiosActivity extends AppCompatActivity {

    FirebaseRecyclerAdapter mAdapter;

    private int activity;
    private String sitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_sitios);

        Bundle datos = this.getIntent().getExtras();
        activity = datos.getInt("activity");

        switch (activity) {
            case Utilities.HOSPITALES:
                Query dbHospitales = FirebaseDatabase.getInstance().getReference()
                        .child("3")
                        .orderByChild("nombre_sede");

                RecyclerView recycler = findViewById(R.id.listado_sitios);
                recycler.setHasFixedSize(true);
                recycler.setLayoutManager(new LinearLayoutManager(this));

                mAdapter =
                        new FirebaseRecyclerAdapter<Hospital, SitioHolder>(
                                Hospital.class, R.layout.registro, SitioHolder.class, dbHospitales) {

                            @Override
                            protected void populateViewHolder(SitioHolder viewHolder, Hospital model, int position) {
                                viewHolder.setNombre(model.getNombre_sede());
                                viewHolder.setDireccion(model.getDirecci_n());
                                viewHolder.setAdicional(model.getNombre_municipio());
                            }
                        };
                recycler.setAdapter(mAdapter);
                break;
            case Utilities.ESTACIONES_SERVICIO:
                Query dbEstacionesServicio = FirebaseDatabase.getInstance().getReference()
                        .child("2")
                        .orderByChild("nombrecomercial");

                recycler = findViewById(R.id.listado_sitios);
                recycler.setHasFixedSize(true);
                recycler.setLayoutManager(new LinearLayoutManager(this));

                mAdapter =
                        new FirebaseRecyclerAdapter<EstacionServicio, SitioHolder>(
                                EstacionServicio.class, R.layout.registro, SitioHolder.class, dbEstacionesServicio) {

                            @Override
                            protected void populateViewHolder(SitioHolder viewHolder, EstacionServicio model, int position) {
                                viewHolder.setNombre(model.getNombrecomercial());
                                viewHolder.setDireccion(model.getDireccion());
                                viewHolder.setAdicional(model.getProducto());
                            }
                        };
                recycler.setAdapter(mAdapter);
                break;
            case Utilities.ESTACIONES_WIFI:
                Query dbZonasWifi = FirebaseDatabase.getInstance().getReference()
                        .child("4")
                        .orderByChild("nombre_del_sitio");

                recycler = findViewById(R.id.listado_sitios);
                recycler.setHasFixedSize(true);
                recycler.setLayoutManager(new LinearLayoutManager(this));

                mAdapter =
                        new FirebaseRecyclerAdapter<ZonaWifi, SitioHolder>(
                                ZonaWifi.class, R.layout.registro, SitioHolder.class, dbZonasWifi) {

                            @Override
                            protected void populateViewHolder(SitioHolder viewHolder, ZonaWifi model, int position) {
                                viewHolder.setNombre(model.getNombre_del_sitio());
                                viewHolder.setDireccion(model.getDirecci_n());
                                viewHolder.setAdicional(model.getNombre_comuna());
                            }
                        };
                recycler.setAdapter(mAdapter);
                break;
        }

        /*Geocoder geocoder = new Geocoder(this);



        try {
            List<Address> addresses = geocoder.getFromLocationName(sitios, 100);
            Utilities.showAlert(this, "" + addresses.size());
        } catch (Exception e) {
            Utilities.showAlert(this, "Ha ocurrido un error con la búsqueda");
        }
        */
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mAdapter.cleanup();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_place, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.control_map:
                Intent intent_maps = new Intent(this, MapsActivity.class);
                startActivity(intent_maps);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
