package com.example.chetan.androidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.DigitalClock;

public class SecondActivity extends AppCompatActivity {

    private static Button button_submit;
    private  static AnalogClock analog;
    private  static DigitalClock digital;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        onButtonClickListener();
    }

    public  void onButtonClickListener()
    {
        button_submit = (Button)findViewById(R.id.button2);
        analog = (AnalogClock)findViewById(R.id.analogClock);
        digital = (DigitalClock)findViewById(R.id.digitalClock);

        button_submit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (digital.getVisibility()==DigitalClock.GONE)
                        {
                            digital.setVisibility(DigitalClock.VISIBLE);
                            analog.setVisibility(AnalogClock.GONE);
                        }
                        else
                        {
                            digital.setVisibility(DigitalClock.GONE);
                            analog.setVisibility(AnalogClock.VISIBLE);
                        }
                    }
                }
        );
    }
}
