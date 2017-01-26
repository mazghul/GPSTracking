package com.vuedata.gpstracking;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    protected LocationManager locationManager;
    protected LocationListener locationListener;
    EditText email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        /*TextView text= (TextView) findViewById(R.id.txtview);
        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        myLocationListerner locationListener = new myLocationListerner(this);
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 10, 10, locationListener);
        if(locationListener.canGetLocation){
            locationListener.getLocation();
            text.setText("Lat"+locationListener.getLatitude()+"Lon"+locationListener.getLongitude());
        }else{
            text.setText("Unabletofind");
            System.out.println("Unable");
        }*/
        email= (EditText) findViewById(R.id.email);
        password= (EditText) findViewById(R.id.password);
    }

    public  void login(View view){
         if((email.getText().toString().equals("janani@plc.com") )&& (password.getText().toString().equals("Maziya"))){
             Intent i = new Intent(this, MapsActivity.class);
             startActivity(i);
             return;
         }
    }
}

