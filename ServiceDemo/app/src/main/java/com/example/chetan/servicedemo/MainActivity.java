package com.example.chetan.servicedemo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

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
