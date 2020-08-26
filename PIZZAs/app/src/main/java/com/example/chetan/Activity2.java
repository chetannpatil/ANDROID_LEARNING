package com.example.chetan;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

import com.example.chetan.pizzas.R;

public class Activity2 extends Activity {

    private static ActionBar ab;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        ab = getActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
       // ab.show();
    }
}
