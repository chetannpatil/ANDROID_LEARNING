package com.example.chetan.intentservicedemo;

import android.app.IntentService;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by chetan on 11/8/16.
 */
public class Myservice extends IntentService {


    public Myservice() {
        super("intenet servie");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(Myservice.this,"SERVICE STARTED",Toast.LENGTH_LONG).show();

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Toast.makeText(Myservice.this,"SERVICE destroyed",Toast.LENGTH_LONG).show();
        super.onDestroy();
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        synchronized (this)
        {

            try {
                wait(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            //no need of stopSelf(); bcs intent service handle self ...it will stop service by itself
        }
    }
}
