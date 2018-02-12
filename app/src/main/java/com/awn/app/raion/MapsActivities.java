package com.awn.app.raion;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivities extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private String fakultas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_activities);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng hukum = new LatLng(-7.951096, 112.613453);
        LatLng feb = new LatLng(-7.951638, 112.614155);
        LatLng fia = new LatLng(-7.949436, 112.614394);
        LatLng fp = new LatLng(-7.953874, 112.611492);
        LatLng fapet = new LatLng(-7.951537, 112.611291);
        LatLng ft = new LatLng(-7.948881, 112.613839);
        LatLng fk = new LatLng(-7.953877, 112.613590);
        LatLng fpik = new LatLng(-7.953141, 112.611486);
        LatLng mipa = new LatLng(-7.953467, 112.612629);
        LatLng ftp = new LatLng(-7.952238, 112.615108);
        LatLng fisip = new LatLng(-7.950249, 112.612045);
        LatLng fib = new LatLng(-7.952766, 112.612481);
        LatLng fkh = new LatLng(-7.948358, 112.613552);
        LatLng fkg = new LatLng(-7.951681, 112.612804);
        LatLng filkom = new LatLng(-7.953747, 112.614845);

        mMap.addMarker(new MarkerOptions().position(filkom).title("Fakultas Ilmu Komputer"));
        mMap.addMarker(new MarkerOptions().position(hukum).title("Fakultas Hukum"));
        mMap.addMarker(new MarkerOptions().position(feb).title("Fakultas Ekonomi dan Bisnis"));
        mMap.addMarker(new MarkerOptions().position(fia).title("Fakultas Ilmu Administrasi"));
        mMap.addMarker(new MarkerOptions().position(fp).title("Fakultas Pertanian"));
        mMap.addMarker(new MarkerOptions().position(fapet).title("Fakultas Peternakan"));
        mMap.addMarker(new MarkerOptions().position(ft).title("Fakultas Teknik"));
        mMap.addMarker(new MarkerOptions().position(fk).title("Fakultas Kedokteran"));
        mMap.addMarker(new MarkerOptions().position(fpik).title("Fakultas Perikanan dan Ilmu Kelautan"));
        mMap.addMarker(new MarkerOptions().position(mipa).title("Fakultas Matematika dan Ilmu Pengetahuan Alam"));
        mMap.addMarker(new MarkerOptions().position(ftp).title("Fakultas Teknologi Pertanian"));
        mMap.addMarker(new MarkerOptions().position(fisip).title("Fakultas Ilmu Sosial dan Ilmu Politik"));
        mMap.addMarker(new MarkerOptions().position(fib).title("Fakultas Ilmu Budaya"));
        mMap.addMarker(new MarkerOptions().position(fkh).title("Fakultas Kedokteran Hewan"));
        mMap.addMarker(new MarkerOptions().position(fkg).title("Fakultas Kedokteran Gigi"));
        mMap.addMarker(new MarkerOptions().position(filkom).title("Fakultas Ilmu Komputer"));


        Bundle bundle = getIntent().getExtras();
        fakultas = bundle.getString("fakultas");

        if (fakultas.equalsIgnoreCase("Hukum")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hukum,19.0F));
        } else if (fakultas.equalsIgnoreCase("Ekonomi dan Bisnis")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(feb,19.0F));
        } else if (fakultas.equalsIgnoreCase("Ilmu Administrasi")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(fia,19.0F));
        } else if (fakultas.equalsIgnoreCase("Pertanian")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(fp,19.0F));
        } else if (fakultas.equalsIgnoreCase("Peternakan")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(fapet,19.0F));
        } else if (fakultas.equalsIgnoreCase("Teknik")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ft,19.0F));
        } else if (fakultas.equalsIgnoreCase("Kedokteran")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(fk,19.0F));
        } else if (fakultas.equalsIgnoreCase("Perikanan dan Ilmu Kelautan")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(fpik,19.0F));
        } else if (fakultas.equalsIgnoreCase("Matematika dan Ilmu Pengetahuan Alam")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mipa,19.0F));
        } else if (fakultas.equalsIgnoreCase("Teknologi Pertanian")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ftp,19.0F));
        } else if (fakultas.equalsIgnoreCase("Ilmu Sosial dan Ilmu Politik")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(fisip,19.0F));
        } else if (fakultas.equalsIgnoreCase("Ilmu Budaya")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(fib,19.0F));
        } else if (fakultas.equalsIgnoreCase("Kedokteran Hewan")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(fkh,19.0F));
        } else if (fakultas.equalsIgnoreCase("Kedokteran Gigi")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(fkg,19.0F));
        } else if (fakultas.equalsIgnoreCase("Ilmu Komputer")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(filkom,19.0F));
        }
    }
}
