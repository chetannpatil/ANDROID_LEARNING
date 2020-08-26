package com.example.chetan.upbuttondemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void openA(View v)
    {
       // Intent intent = new Intent("com.example.chetan.upbuttondemo.ActivityA");
       // startActivity(intent);
        startActivity(new Intent(this,ActivityA.class));

    }

}
