package com.example.chetan.upbuttondemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);
    }

    public void openB(View v)
    {
        //Intent intent = new Intent("com.example.chetan.upbuttondemo.ActivityB");
        //startActivity(intent);
        startActivity(new Intent(this,ActivityB.class));
    }
}
