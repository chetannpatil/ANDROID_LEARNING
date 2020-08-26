package com.example.chetan.intentservicedemo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void startService(View view)
    {
        Intent intent = new Intent(this,Myservice.class);
        startService(intent);
       // startService(view);
    }
    public void stopService(View view)
    {
        Intent intent = new Intent(this,Myservice.class);
        stopService(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuif = getMenuInflater();
        menuif.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        return super.onOptionsItemSelected(item);
    }
}
