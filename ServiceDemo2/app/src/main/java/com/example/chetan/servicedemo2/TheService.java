package com.example.chetan.servicedemo2;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
//import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by chetan on 10/8/16.
 */
public class TheService extends Service {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(TheService.this, "SERVIE STARTED", Toast.LENGTH_LONG).show();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        Toast.makeText(TheService.this, "SERVIE DESTROYED", Toast.LENGTH_LONG).show();
    }

    //@Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
