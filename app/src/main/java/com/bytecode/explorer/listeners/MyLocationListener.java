package com.bytecode.explorer.listeners;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.widget.Toast;

import com.bytecode.explorer.ExploraApp;

/**
 * Created by Rakshith on 26-07-2015.
 */
public class MyLocationListener implements LocationListener {


    @Override
    public void onLocationChanged(Location location) {
        // Initialize the location fields


        Toast.makeText(ExploraApp.getInstance(), "" + location.getLatitude() + location.getLongitude(),
                Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
        Toast.makeText(ExploraApp.getInstance(), provider + "'s status changed to " + status + "!",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onProviderEnabled(String provider) {
        Toast.makeText(ExploraApp.getInstance(), "Provider " + provider + " enabled!",
                Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onProviderDisabled(String provider) {
        Toast.makeText(ExploraApp.getInstance(), "Provider " + provider + " disabled!",
                Toast.LENGTH_SHORT).show();

    }
}

