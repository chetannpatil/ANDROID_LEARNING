package com.example.chetan.joke;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

public class ShowDelayedMessageIntentService extends IntentService
{
    private String mStr;
    Handler mAsHandler ;
    boolean running ;
    public ShowDelayedMessageIntentService()
    {
        super("DELAYEDMESSAGEINTENTSERVICE");
    }

  /*  @Override
    public IBinder onBind(Intent intent)
    {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }*/

    @Override
    protected void onHandleIntent(Intent intent)
    {
        //String messageStr = intent.getStringExtra("msg");
        mStr = intent.getStringExtra("msg");
       synchronized (this)
        {

            for (int i =0 ; i<1500;i++)
            {
                try
                {
                    wait(1000);

                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
              //  Log.d("messageFromIS",mStr+" "+i);
              showNotification(i);
               // Toast.makeText(getApplicationContext(),"FROM BC THREAD"+mStr.toUpperCase(),Toast.LENGTH_LONG).show();

            }
          /*  for (int k=0;k<10;k++)
            {
                showNotification();
            }*/

       // }//syn ends
      /*  synchronized (this)
        {
            mAsHandler.post(new Runnable()
            {
                @Override
                public void run()
                {
                    Toast.makeText(getApplicationContext(),mStr,Toast.LENGTH_LONG).show();
                }
            });

            //call
            if (running == true)
                showNotification();*/
        }


    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        running = true ;
        mAsHandler = new Handler();

        return super.onStartCommand(intent, flags, startId);
    }

    private void showNotification(int i)
    {
        String textStr = "THE TEXT OG NOTIFICATION from notification manager recvd here :)";
        String textStr3 = i+" th waring switch off phone";
        String textStr2 = i+" Viruses found & activated";

        //crete pending inttent
        TaskStackBuilder tsb = TaskStackBuilder.create(this);
        //create activity 's intent which u wanna open
        Intent maIntent = new Intent(this,FullscreenActivity.class);
        Intent msgerActInent = new Intent(Intent.ACTION_SEND);
        msgerActInent.setType("text/plain");
        msgerActInent = Intent.createChooser(msgerActInent,"sorry");
        tsb.addNextIntent(msgerActInent);
       // tsb.addNextIntent(maIntent);
        tsb.addParentStack(MainActivity.class);
        PendingIntent pndIntent = tsb.getPendingIntent(143,PendingIntent.FLAG_UPDATE_CURRENT);


        Notification.Builder bull = new
                Notification.Builder(this);
        bull.setContentTitle("WARNING");
        bull.setContentText(textStr2);
      //  bull .setAutoCancel(true);
        bull.setAutoCancel(false);
        bull.setDefaults(Notification.DEFAULT_SOUND);
        bull.setPriority(Notification.PRIORITY_MAX);
        bull.setSmallIcon(R.mipmap.ic_launcher);

        //set pending intent
        bull.setContentIntent(pndIntent);

        Notification note = bull.build();


        NotificationManager nm = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        nm.notify(1,note);
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        running = false ;

    }
}
