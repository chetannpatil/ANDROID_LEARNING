package com.example.chetan.servicedemo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends ActionBarActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startService(View v)
    {
        Intent intent = new Intent(this,TheService.class);
        startService(intent);
    }
    public void stopService(View v)
    {
        Intent intent = new Intent(this,TheService.class);
        stopService(intent);
    }
}
