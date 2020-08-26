package com.example.chetan.apptwo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class Activity2 extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"in A2's onCreate()",Toast.LENGTH_LONG).show();
    }
}
