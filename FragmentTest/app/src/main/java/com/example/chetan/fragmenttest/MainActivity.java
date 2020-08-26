package com.example.chetan.fragmenttest;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("fragtest","in onCreate() before setContentView()");
        setContentView(R.layout.activity_main);

        Log.d("fragtest","in onCreate() before setContentView()");
        Log.d("fragtest","in onCreate() of MA");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("fragtest","in onPause() of MA");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("fragtest","in onResume() of MA");
    }
}
