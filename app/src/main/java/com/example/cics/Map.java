package com.example.cics;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

public class Map extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    SearchView searchView;
    Location mlocation;
    FusedLocationProviderClient fusedLocationProviderClient;
    private static final int Request_code = 101;

    SupportMapFragment MapFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_new = new Intent(Map.this,CropName.class);
                startActivity(intent_new);
             }
        });
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
        GetLastLocation();      //jump to getlastlocation function
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.

        //   searchView=(SearchView)findViewById(R.id.search);
        MapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
           /* searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {

                String location = searchView.getQuery().toString();
                List<Address> addressList=null;
                if(mlocation !=null || !mlocation.equals("")){
                  Geocoder geocoder = new Geocoder(MapsActivity.this);
                    try {
                        addressList=geocoder.getFromLocationName(location,1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Address address = addressList.get(0);
                    LatLng latLng1 = new LatLng(address.getLatitude(),address.getLongitude());
                    Map.addMarker(new MarkerOptions().position(latLng1).title(location));
                    Map.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng1,10));

                }

                return false;

            }


            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
*/
//        MapFragment.getMapAsync(this);

    }

    private void GetLastLocation() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,new String[]
                    {android.Manifest.permission.ACCESS_FINE_LOCATION},Request_code);

            return;
        }
        Task<Location> task = fusedLocationProviderClient.getLastLocation();
        task.addOnSuccessListener(new OnSuccessListener<Location>() {
            @Override
            public void onSuccess(Location location) {
                if (location != null){
                    mlocation=location;
                    //Toast.makeText(getApplicationContext(),location.getLatitude()+""+location.getLongitude(),
                    //      Toast.LENGTH_SHORT).show();

                    SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                            .findFragmentById(R.id.map);
                    mapFragment.getMapAsync(Map.this);



                }
            }
        });
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
        LatLng latLng = new LatLng(mlocation.getLatitude(),mlocation.getLongitude());
/*        mMap.addMarker(new MarkerOptions().position(India).title("India"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(India));
*/
        MarkerOptions markerOptions = new MarkerOptions().position(latLng).title("You are here");
        googleMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));  //zoom camera
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,12));
        googleMap.addMarker(markerOptions);

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        switch (requestCode){

            case Request_code:
                if(grantResults.length>0 && grantResults[0] ==PackageManager.PERMISSION_GRANTED){
                    GetLastLocation();
                }
                break;
        }

    }
}
