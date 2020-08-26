package com.example.chetan.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.chetan.DisplayActivity;


public class MainActivity extends Activity {

   public MainActivity()
    {
         Log.d("Life Cycle Activity","MA no-arg CONTRSTUR");
    }

    public void hookMethod(View v)
    {
        Log.d("Life Cycle Activity","MA HOOK MEtHOD()");
        Toast t = Toast.makeText(this,"MA HOOK MEtHOD()",Toast.LENGTH_SHORT);
        t.setGravity(1,5,5);
        t.show();
        Intent i = new Intent(this, DisplayActivity.class);
        startActivity(i);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

       Log.d("Life Cycle Activity","MA onCREATE");

        Toast t = Toast.makeText(this,"MA oNcreate()",Toast.LENGTH_SHORT);
        t.setGravity(1,5,5);
        t.show();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(android.support.v7.appcompat.R);
       // setContentView(R.layout.activity_main);
      /*  Button bt = new Button(this);
       bt.setText("clik");
       // bt.setWidth(1);
       // bt.setHeight(2);
        bt.setBackgroundColor(10164505);
        setContentView(bt);*/
   }


    @Override
    protected void onStart() {
        super.onStart();
        Toast t = Toast.makeText(this,"MA ONStART",Toast.LENGTH_SHORT);
        t.setGravity(1,5,5);
        t.show();

        Log.d("Life Cycle Activity","MA ONSTART()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast t = Toast.makeText(this,"MA ONRESUME()",Toast.LENGTH_SHORT);
        t.setGravity(1,5,5);
        t.show();

        Log.d("Life Cycle Activity","MA ONRESUME()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast t = Toast.makeText(this,"MA onPause()",Toast.LENGTH_SHORT);
        t.setGravity(1,5,5);
        t.show();

        Log.d("Life Cycle Activity","MA onPause()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast t = Toast.makeText(this,"MA onRestart()",Toast.LENGTH_SHORT);
        t.setGravity(1,5,5);
        t.show();

        Log.d("Life Cycle Activity","MA onRestart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast t = Toast.makeText(this,"MA onStop()",Toast.LENGTH_SHORT);
        t.setGravity(1,5,5);
        t.show();

        Log.d("Life Cycle Activity","MA onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast t = Toast.makeText(this,"MA onDestroy()",Toast.LENGTH_SHORT);
        t.setGravity(1,5,5);
        t.show();

        Log.d("Life Cycle Activity","MA onDestroy()");
    }

}
