package com.example.chetan.timepickerapp;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class NextActivity extends AppCompatActivity {
// date
private static Button button_date_picker;
    int year_x,month_x,day_x;
    static final int DIALOG_ID_DATE=0;



    private static TimePicker tp;
    private static Button button_showTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        showTime();

        final Calendar cal=  Calendar.getInstance();
                //getInstance();
        year_x= cal.get(Calendar.YEAR);
        month_x = cal.get(Calendar.MONTH);
        day_x = cal.get(Calendar.DAY_OF_MONTH);
        showDate();
    }

    //date
    public void showDate()
    {
        button_date_picker = (Button)findViewById(R.id.button_date_picker);
        button_date_picker.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        showDialog(DIALOG_ID_DATE);

                    }
                }
        );
    }

    @Override
    protected Dialog onCreateDialog(int id)
    {
        if (id==DIALOG_ID_DATE)
        {
            return new DatePickerDialog(NextActivity.this,dPickerlistener,year_x,month_x,day_x);

        }
        return null;
    }


    private DatePickerDialog.OnDateSetListener dPickerlistener =
            new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                     year_x =i;
                     month_x = i1+1;
                     day_x = i2;
                 Toast.makeText(NextActivity.this,year_x+" : "+month_x+" :"+day_x,Toast.LENGTH_LONG).show();
                }
            };



    public void showTime()
    {
        tp = (TimePicker)findViewById(R.id.timePicker);
        tp.setIs24HourView(true);
        button_showTime =(Button)findViewById(R.id.button_show_time);
        button_showTime.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(NextActivity.this,tp.getCurrentHour()+" "+tp.getCurrentMinute(),Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}
