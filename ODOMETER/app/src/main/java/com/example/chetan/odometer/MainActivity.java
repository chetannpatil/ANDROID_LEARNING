package com.example.chetan.odometer;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    OdometerService odometerServiceObj ;
    EditText etRes ;
    boolean onBoolean ;
    ServiceConnection serviceConnectionObj = new Connection();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etRes = (EditText) findViewById(R.id.etDisplay);


        watchMilage();


        /*if (onBoolean== true)
        {
            //etRes.setText(odometerServiceObj.getLuckyNumber()+"");
            etRes.setText(odometerServiceObj.getDistanceInMeterDobl()+""+"Metres");
        }*/
    }

    public void click(View v)
    {
        Toast.makeText(this,"thanks",Toast.LENGTH_LONG).show();
      /*  Intent boundInetnt = new Intent(this,OdometerService.class);
        //startService(boundInetnt);
        //start bound service by
        bindService(boundInetnt,new Connection(), Context.BIND_AUTO_CREATE);
       // odometerServiceObj = new OdometerService();
        if (onBoolean== true)
        {
            //etRes.setText(odometerServiceObj.getLuckyNumber()+"");
            etRes.setText(odometerServiceObj.getDistanceInMeterDobl()+""+"Metres");
        }*/

       //cant set ints???hmmmmm etRes.setText(1);
    }
    public class Connection implements ServiceConnection
    {

        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder)
        {
            OdometerService.OdometerBinder  odometerBinderObj = (OdometerService.OdometerBinder)iBinder;
            odometerServiceObj = odometerBinderObj.getOdometer();
            onBoolean = true ;

        }

        @Override
        public void onServiceDisconnected(ComponentName componentName)
        {
            onBoolean = false ;

        }
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        if (onBoolean == true)
        {
            unbindService(serviceConnectionObj);
            onBoolean = false ;
        }
    }

    public void watchMilage()
    {
        final Handler handlerObj = new Handler();
       handlerObj.post(new Runnable()
       {
           double dsitDbl = 0.0 ;
           @Override
           public void run()
           {
               if (odometerServiceObj != null)
               {
                   dsitDbl = odometerServiceObj.getDistanceInMeterDobl();
                   etRes.setText(dsitDbl+"   Metres");

               }

               handlerObj.postDelayed(this,1000);
           }

       });
    }

    @Override
    protected void onStart()
    {
        super.onStart();
            Intent boundInetnt = new Intent(this,OdometerService.class);

        bindService(boundInetnt,serviceConnectionObj, Context.BIND_AUTO_CREATE);

    }
}
