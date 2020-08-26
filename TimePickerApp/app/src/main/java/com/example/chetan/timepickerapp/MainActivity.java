package com.example.chetan.timepickerapp;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //date


    private static  Button stpd;
    static final int dilog_id=0;
    int hour_x;
    int minute_x;
    private  static Button button_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nextButton();
        showTimePickerDilog();
    }




    //dilog timpe picker
    public void showTimePickerDilog()
    {
        stpd = (Button)findViewById(R.id.button_show_time_picker_dialog);
        stpd.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        showDialog(dilog_id);

                       // on//C
                    }
                }
        );
    }
    @Override
    protected Dialog onCreateDialog(int id)
    {

        if (id==dilog_id)

            return new TimePickerDialog(MainActivity.this,kTimePickerListener,hour_x,minute_x,false);
        return null;
    }

    protected TimePickerDialog.OnTimeSetListener kTimePickerListener =
            new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker timePicker, int i, int i1) {

                    hour_x=i;
                    minute_x =i1;
                    Toast.makeText(MainActivity.this,hour_x+" : "+minute_x,Toast.LENGTH_LONG).show();
                }
            };

    public void nextButton()
    {
        button_next = (Button)findViewById(R.id.button);
        button_next.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent in = new Intent("com.example.chetan.timepickerapp.NextActivity");
                        startActivity(in);
                    }
                }
        );
    }
}
