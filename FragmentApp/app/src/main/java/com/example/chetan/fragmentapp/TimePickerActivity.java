package com.example.chetan.fragmentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class TimePickerActivity extends AppCompatActivity {


    private static TimePicker time_picker;
    private static Button button_showtime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
        showTime();
    }

    public void showTime()
    {
        time_picker = (TimePicker)findViewById(R.id.timePicker2);
        button_showtime = (Button)findViewById(R.id.button_time_show);
        time_picker.setIs24HourView(true);

        button_showtime.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                        Toast.makeText(TimePickerActivity.this,time_picker.getCurrentHour()+" "+time_picker.getCurrentMinute(),Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }

}
