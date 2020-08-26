package com.example.chetan.appone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityOneAppOne extends AppCompatActivity
{

    SeekBar skb;
    TextView tv;
    AutoCompleteTextView nationaActv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_one_app_one);
        skb = (SeekBar) findViewById(R.id.a2SeekBAr);
        tv = (TextView) findViewById(R.id.a2tv);
        nationaActv = (AutoCompleteTextView) findViewById(R.id.a2CountryACTV);
        skb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b)
            {
                Toast.makeText(getApplicationContext(),i+" is i & "+b+" is blean in onProgressChanged()",Toast.LENGTH_SHORT).show();
                tv.setText(i+"");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {
                Toast.makeText(getApplicationContext(),"in  onStartTrackingTouch(SeekBar seekBar)",Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {
                Toast.makeText(getApplicationContext(),"in  onStopTrackingTouch(SeekBar seekBar))",Toast.LENGTH_SHORT).show();

            }
        });

       // nationaActv.set

        String [] countrySa = getResources().getStringArray(R.array.countyArray);
        ArrayAdapter<String> arrayAdapterCountry =  new ArrayAdapter<String>(
                getApplicationContext(),
                R.layout.support_simple_spinner_dropdown_item,
                countrySa);
        nationaActv.setThreshold(1);
        nationaActv.setAdapter(arrayAdapterCountry);



    }

    public void submit(View v)
    {
       int prgInt = skb.getProgress();
        tv.setText(prgInt+"");
        int maxInt = skb.getMax();

        Toast.makeText(this,maxInt+" is max of seek bar",Toast.LENGTH_LONG).show();


    }

    public void broadcastintent(View v)
    {
        Intent custIntent = new Intent();
        custIntent.setAction("com.example.chetan.CUSTOM_INTENT");
        //sendBroadcast(custIntent);
        sendStickyBroadcast(custIntent);
    }
}
