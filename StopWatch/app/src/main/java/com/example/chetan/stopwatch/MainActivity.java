package com.example.chetan.stopwatch;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    TextView tvShowTime;
    private static boolean startTimerBool ;
    private static int secondsInt ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvShowTime = (TextView) findViewById(R.id.tvTime);

      if(savedInstanceState != null)
        {
            startTimerBool = savedInstanceState.getBoolean("startTimerBoolBundle");
            secondsInt = savedInstanceState.getInt("secondsIntBundle");
        }

        runTimer();
    }
    @Override
    protected void onSaveInstanceState(Bundle bndl)
    {
        Toast.makeText(this,"onSaveInstanceState(Bundle bndl) called",Toast.LENGTH_SHORT).show();
        bndl.putInt("secondsIntBundle",secondsInt);
        bndl.putBoolean("startTimerBoolBundle",startTimerBool);
    }

   public void runTimer ()
    {
        final Handler hand = new Handler();

        Runnable runnableObj = new Runnable()
        {
            @Override
            public void run()
            {
                int hourInt = secondsInt / 3600 ;
                int minutesInt = (secondsInt % 3600) / 60 ;

                int secInt = secondsInt % 60 ;

                String timeStr = hourInt+" : "+minutesInt+" : "+secInt ;
                tvShowTime.setText(timeStr);

                if (startTimerBool == true )
                {
                    secondsInt ++;
                }
                hand.postDelayed(this ,1000);
            }

        } ;

        hand.post(runnableObj);

    }


    public void startTimer(View v)
    {
        startTimerBool = true;
    }




    public void stopTimer(View v)
    {
        startTimerBool = false ;

    }

    public void  reSetTimer(View v)
    {
        secondsInt = 0 ;
        startTimerBool = false ;

    }


    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this,"onPause() called",Toast.LENGTH_SHORT).show();
        startTimerBool = false ;
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(this,"onStop()  called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        startTimerBool = true ;
        Toast.makeText(this,"onRestart()  called",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(this," onResume() called",Toast.LENGTH_SHORT).show();
        startTimerBool = true ;


    }
}
