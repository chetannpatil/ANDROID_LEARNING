package com.example.chetan.fragmentapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import layout.FragmentOne;
import layout.FragmentTwo;

public class MainActivity extends AppCompatActivity {

    DatabassHelper objDatabaseHelper;
  //notify
    private static Button button_notify;
    private static Button button_redirec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //certinf object of databse helper lass
        objDatabaseHelper = new DatabassHelper(this);

        buttonRedirectToTimePicker();
        button_notify = (Button)findViewById(R.id.button_notify_me);
        button_notify.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent();
                        PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity.this,0,intent,0);
                        Notification noti = new Notification.Builder(MainActivity.this).
                                setTicker("Ticker Title")
                                .setContentTitle(" contnt title")
                                .setContentText("content text will appera")
                                .setSmallIcon(R.mipmap.ic_launcher)
                             //   .addAction(R.mipmap.ic_launcher,"ACtIon 1",pendingIntent)
                             //   .addAction(R.mipmap.ic_launcher,"ACtIon 2",pendingIntent)
                                .setContentIntent(pendingIntent).getNotification();
                        noti.flags = Notification.FLAG_AUTO_CANCEL;
                        NotificationManager nm = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
                        nm.notify(0,noti);
                    }
                }
        );
    }

    public void buttonRedirectToTimePicker()
    {
        button_redirec = (Button)findViewById(R.id.button_redirect);
        button_redirec.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent("com.example.chetan.fragmentapp.TimePickerActivity");
                        startActivity(intent);
                    }
                }
        );

    }

    public void changeFragment(View v)
    {
        Fragment fragment;
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();

        if (v==findViewById(R.id.button_fragment1))
        {
            fragment = new FragmentOne();

            ft.replace(R.id.fragment_place,fragment);
         }

        if (v==findViewById(R.id.button_fragment2))
        {
            fragment = new FragmentTwo();
            ft.replace(R.id.fragment_place,fragment);

        }
        ft.commit();
    }
}
