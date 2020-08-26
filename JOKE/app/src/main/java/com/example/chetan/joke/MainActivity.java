package com.example.chetan.joke;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //TextView tv;
EditText etMsg ;
    ShowDelayedMessageIntentService showDelayedMessageIntentServiceObj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      /*  Log.wtf("wtf", "MA->oncrete()");
        Log.v("er", " er MA->oncrete()");
        Log.d("d", "d- ma oncretse()");*/
        etMsg = (EditText) findViewById(R.id.etMessage);
      /*  tv = (TextView) findViewById(R.id.tvMA);

        tv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //Log.d("d", "d->ma--oncraete->oNCLIK() of Onlclistenr of setOnlcikListnr()");
                Toast.makeText(v.getContext(), tv.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });*/
    }

    public void startServiceForMessage(View v)
    {
       // showDelayedMessageIntentServiceObj = new ShowDelayedMessageIntentService();
       // Intent serviceIntent = new Intent(this,MainActivity.class);
        Intent serviceIntent = new Intent(this,ShowDelayedMessageIntentService.class);

        String msgStr = etMsg.getText().toString();
        serviceIntent.putExtra("msg",msgStr);
      //  showDelayedMessageIntentServiceObj.onHandleIntent(serviceIntent);
        startService(serviceIntent);

     /*   String textStr = "THE TEXT OG NOTIFICATION from notification manager recvd here :)";
        String textStr2 = "BTTER luck next tyme,.....she rejected ur proposol :(";
       Notification.Builder bull = new
               Notification.Builder(this);
        bull.setContentTitle("TITLE OF NOTIFICATION");
        bull.setContentText(textStr2);
              bull .setAutoCancel(true);
                bull.setDefaults(Notification.DEFAULT_VIBRATE);
                bull.setPriority(Notification.PRIORITY_MAX);
                bull.setSmallIcon(R.mipmap.ic_launcher);
      // bull.setColor(getResources().getColor(android.support.v7.appcompat.R.color.abc_background_cache_hint_selector_material_dark));
       // bull.setSound(android.support.v7.appcompat.R.bool.)

        Notification note = bull.build();


        NotificationManager nm = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        nm.notify(2,note);*/
    }

}
