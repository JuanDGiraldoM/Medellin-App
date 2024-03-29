package co.edu.upb.appmed;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Locale;

import co.edu.upb.appmed.Utilidades.Utilities;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Locale locale;
    private Configuration config = new Configuration();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        //noinspection SimplifiableIfStatement
        switch (item.getItemId()) {
            case R.id.home:
                this.finish();
                return true;

            case R.id.action_settings:
                AlertDialog.Builder b = new AlertDialog.Builder(this);
                b.setTitle(getResources().getString(R.string.action_settings));
                String[] types = getResources().getStringArray(R.array.languages);
                b.setItems(types, new DialogInterface.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        switch (which) {
                            case 0:
                                locale = new Locale("es");
                                config.setLocale(locale);
                                break;
                            case 1:
                                locale = new Locale("en");
                                config.setLocale(locale);
                                break;
                            case 2:
                                locale = new Locale("de");
                                config.setLocale(locale);
                                break;
                        }
                        getResources().updateConfiguration(config, null);
                        Intent refresh = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(refresh);
                        finish();
                    }
                });
                b.show();
                return true;

            case R.id.about:
                Utilities.showAlert(this, "Juan David Giraldo Marín \nSara Lizeth Galvis Loaiza");
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        Intent intent = new Intent(this, ListadoSitiosActivity.class);
        // Handle navigation view item clicks here.
        switch (item.getItemId()) {
            case R.id.nav_hospital:
                intent.putExtra("activity", Utilities.HOSPITALES);
                startActivity(intent);
                return true;

            case R.id.nav_wifi:
                intent.putExtra("activity", Utilities.ESTACIONES_WIFI);
                startActivity(intent);
                return true;

            case R.id.nav_station:
                intent.putExtra("activity", Utilities.ESTACIONES_SERVICIO);
                startActivity(intent);
                return true;

            case R.id.nav_map:
                Intent intent_maps = new Intent(this, MapsActivity.class);
                startActivity(intent_maps);
                return true;

            default:
                DrawerLayout drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                return true;
        }
    }
}
