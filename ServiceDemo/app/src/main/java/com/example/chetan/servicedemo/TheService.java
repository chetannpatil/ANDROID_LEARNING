package com.example.chetan.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;


/**
 * Created by chetan on 10/8/16.
 */
public class TheService extends Service
{
    public class TheThread implements Runnable
    {
         int serviceID;
        TheThread(int serviceID)
        {
            this.serviceID=serviceID;
        }

        @Override
        public void run() {
            synchronized (this)
            {
                try {
                    wait(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
               // stopSelf(this.serviceID);
            }

        }
    }
    @Override
    public void onCreate()
    {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(TheService.this,"SERVICE STARTED",Toast.LENGTH_LONG).show();
      //  TheThread myThread = new TheThread(new TheThread(startId));
        Thread myThread = new Thread(new TheThread(startId));
        //myThread.run();
        myThread.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        Toast.makeText(TheService.this,"SERVICE destroyed",Toast.LENGTH_LONG).show();

    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}

