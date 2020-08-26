package com.example.chetan.sampleloginapp;

import android.content.Intent;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import android.view.MotionEvent;
import android.gesture.Gesture;
import static android.view.GestureDetector.*;

public class Login extends AppCompatActivity  {
//implements OnGestureListener,OnDoubleTapListener
    // time picker
    private TimePicker time_picker;
    private Button button_show_time;
    // autocomple text vw
    AutoCompleteTextView actext_view;
    String country_array [] = { "INDIA"
            ,"Israil","Islamia","Igoslavia","irope","Istralia","Irelend"} ;
    // gesture
    private static TextView text_view;
   // private GestureDetectorCompat gesturedetector;


    private static EditText username;
    private static EditText password;
    private static TextView attempts;
    private static Button login_button;
    int attempt_counter=5;

    //seekbar
    private static SeekBar seek_bar;
    private static TextView text_view_seek_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //time picker

        timePicker();
        loginButton();
        seekbar();

        text_view = (TextView)findViewById(R.id.textView_gesture);
   //       gesturedetector = new GestureDetectorCompat(this,this);
   //     gesturedetector.setOnDoubleTapListener(this);

        actext_view = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.select_dialog_item,country_array);
        actext_view.setThreshold(1);
        actext_view.setAdapter(adapter);
    }

    // tim epicker
    public  void timePicker()
    {
        time_picker = (TimePicker)findViewById(R.id.timePicker);
        button_show_time = (Button)findViewById(R.id.button_show_time);

        button_show_time.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Toast.makeText(Login.this, time_picker.getCurrentHour()+" "+time_picker.getCurrentMinute(), Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
    //seekbar
    public void seekbar()
    {

        seek_bar = (SeekBar)findViewById(R.id.seekBar);
        text_view_seek_bar =(TextView)findViewById(R.id.textView_seek_bar);

        text_view_seek_bar.setText("covered :"+seek_bar.getProgress()+"/"+seek_bar.getMax());
        seek_bar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    int progress_value;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                        progress_value = i;
                        text_view_seek_bar.setText("covered :"+i+"/"+seek_bar.getMax());
                        Toast.makeText(Login.this,"seekbar in prgress",Toast.LENGTH_LONG).show();

                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        Toast.makeText(Login.this,"seekbar in strat tracking",Toast.LENGTH_LONG).show();

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_view_seek_bar.setText("covered :"+progress_value+"/"+seek_bar.getMax());

                        Toast.makeText(Login.this,"seekbar in stop tracking",Toast.LENGTH_LONG).show();

                    }
                }
        );
    }
    public void  loginButton()
    {
        username = (EditText)findViewById(R.id.editText_user);
        password = (EditText)findViewById(R.id.editText_password);
        attempts = (TextView) findViewById(R.id.textView_attempts);
        login_button= (Button)findViewById(R.id.button_login);

        attempts.setText(Integer.toString(attempt_counter));

        login_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if (username.getText().toString().equalsIgnoreCase("CHETAN") &&
                                password.getText().toString().equalsIgnoreCase("c"))
                        {
                            Toast.makeText(Login.this, "COngratulations crrct usrname name & passrwd", Toast.LENGTH_SHORT).show();

                            Intent intent = new Intent("com.example.chetan.sampleloginapp.User");
                            startActivity(intent);
                        }
                        else
                        {
                            Toast.makeText(Login.this,"WRONG credentials , enter again pls",Toast.LENGTH_SHORT).show();
                            attempt_counter--;
                            attempts.setText(Integer.toString(attempt_counter));
                            if (attempt_counter==0)
                            {
                                login_button.setEnabled(false);
                            }
                        }

                    }
                }
        );
    }

  /*  @Override
    public boolean onTouchEvent(MotionEvent event) {

        gesturedetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
       text_view.setText("onSingleTapConfirmed()" +motionEvent.toString());
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
       text_view.setText("onDoubleTap()"+motionEvent.toString());
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        text_view.setText("onDoubleTapEvent()"+motionEvent.toString());
        return false;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        text_view.setText("onDown()"+motionEvent.toString());
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

        text_view.setText("onShowPress();"+motionEvent.toString());
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        text_view.setText("onSingleTapUp"+motionEvent.toString());
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        text_view.setText("onScroll()"+motionEvent.toString()+" " +motionEvent1.toString());
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
       text_view.setText("onLongPress()"+motionEvent.toString());
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        text_view.setText("onFling()"+motionEvent.toString()+" " +motionEvent1.toString());
        return false;
    }
    */
}
