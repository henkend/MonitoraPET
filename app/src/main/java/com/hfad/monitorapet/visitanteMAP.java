package com.hfad.monitorapet;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class visitanteMAP extends FragmentActivity implements OnMapReadyCallback {

    double lat = -15.614597;
    double longi = -56.070941;
    LatLng ll = new LatLng(lat, longi);

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitante_map);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        assert mapFragment != null;
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


        //Lugares de atividades
        mMap.addMarker(new MarkerOptions().position(new LatLng(lat,longi)).title("Credenciamento(FAMEVZ)"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-15.612655,-56.067532)).title("Assembléias e Mesas redondas"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-15.613699, -56.069170)).title("Apresentações e Banners (ICHS)"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-15.612553, -56.068925)).title("Encontro de Discentes e Docente"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-15.608296, -56.066127)).title("Restaurante Universitário(Refeições)"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-15.608269, -56.064817)).title("Auditório da FAET (Mofão)"));
        //lUGARES AUXILIARES
        mMap.addMarker(new MarkerOptions().position(new LatLng(-15.608809, -56.065735)).title("Praça do restaurante Universitário"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-15.612218, -56.073231)).title("Pegue um cineminha e faça compras"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-15.593254, -56.104591)).title("Que tal dançar um pouco?"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-15.567847, -56.079925)).title("Um parque tranquilo com natureza e pistas de corrida"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-15.613473, -56.068237)).title("Bar do Zapatta"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-15.622497, -56.069597)).title("Taverna Corvo Negro"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-15.605482, -56.073950)).title("Poltrona Nerd"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-15.613086, -56.067620)).title("Espeto do João"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-15.613140, -56.066954)).title("Natural Club"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-15.607720, -56.072595)).title("Nossa Pizza Restaurante"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-15.612364, -56.066298)).title("Subway"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-15.614165, -56.073927)).title("Mc Donald’s"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-15.613157, -56.060742)).title("Recreio da UFMT(Bar do arcanjo)"));

        CameraUpdate location = CameraUpdateFactory.newLatLngZoom(ll, 15);
        CameraUpdate zoom = CameraUpdateFactory.zoomTo((float)17);
        mMap.moveCamera(location);
        mMap.animateCamera(zoom, 3000, null);
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

    }
}
