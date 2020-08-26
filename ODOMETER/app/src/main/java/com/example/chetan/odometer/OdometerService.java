package com.example.chetan.odometer;

import android.Manifest;
import android.app.LoaderManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.app.ActivityCompat;

public class OdometerService extends Service {
    Location lastlocation = null;
    double distanceInMeterDobl;

    public OdometerService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();

        final LocationListener locListenerObj = new
                LocationListener() {
                    @Override
                    public void onLocationChanged(Location cuurentlocation) {
                        //add new location
                        if (lastlocation == null) {
                            lastlocation = cuurentlocation;
                        }
                        //distanceInMeterDobl = distanceInMeterDobl+ cuurentlocation.distanceTo(locationListenerObj);
                        distanceInMeterDobl = distanceInMeterDobl + (cuurentlocation.distanceTo(lastlocation));
                        lastlocation = cuurentlocation;
                    }

                    @Override
                    public void onStatusChanged(String s, int i, Bundle bundle) {

                    }

                    @Override
                    public void onProviderEnabled(String s) {

                    }

                    @Override
                    public void onProviderDisabled(String s) {

                    }
                };

        //get LM and attach ll to it
        LocationManager lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);


        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED)
        {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000, 1, locListenerObj);

    /*    try {

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }*/

    }

    public class OdometerBinder extends Binder
    {
        public OdometerService getOdometer()
        {
            return OdometerService.this;
            //return this;
        }
    }
    @Override
    public IBinder onBind(Intent intent)
    {
       // throw new UnsupportedOperationException("Not yet implemented");
        return new OdometerBinder();
    }

    public int getLuckyNumber()
    {
        int x = (int)(Math.random()*10);
        return x;
    }

    public double getDistanceInMeterDobl()
    {
        //distanceInMeterDobl = (distanceInMeterDobl /1609.344);
        return distanceInMeterDobl ;
    }
}
