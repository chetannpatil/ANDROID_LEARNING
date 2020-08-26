package com.example.chetan.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    public static String a="Chetan";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  ImageView imageView = (ImageView)findViewById(R.id.imageView);
        //imageView.setImageResource(R.mipmap.IMG_20160730_WA0004);

        TextView tx = (TextView)findViewById(R.id.textView);
        tx.setText(R.string.app_name);
        Log.d(a,"CREATED");

    }

 /*   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    } */

    public void onService(View view)
    {
        Intent in  = new Intent(this,MyHelloService.class);
        startService(in);
    }
    public  void offService(View view)
    {
        Intent off  = new Intent(this,MyHelloService.class);
        stopService(off);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(a,"onpause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(a,"STARTED");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(a,"RSUMD");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(a,"STOP");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(a,"RESYTART");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(a,"destroy");

    }
}
