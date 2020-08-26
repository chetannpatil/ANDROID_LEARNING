package com.example.chetan.boundservicedemo;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity{

    MyService objMyservice;
    boolean isBound = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this,MyService.class);
        bindService(intent,sercnn, Context.BIND_AUTO_CREATE);
    }
    public void getRandomNumber(View view)
    {
        TextView txtvw = (TextView) findViewById(R.id.textView);
        txtvw.setText(Integer.toString(objMyservice.getRandom()));

    }

    ServiceConnection sercnn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            MyService.LocalBinder binder = (MyService.LocalBinder) iBinder;
            objMyservice= binder.getService();
            isBound=true;
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

            isBound=false;
        }
    };

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
