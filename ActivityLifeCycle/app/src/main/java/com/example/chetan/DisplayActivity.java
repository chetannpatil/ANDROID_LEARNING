package com.example.chetan;

import android.app.Activity;
//import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.chetan.activitylifecycle.MainActivity;
import com.example.chetan.activitylifecycle.R;

public class DisplayActivity extends Activity {

   public DisplayActivity()
    {
        Log.d("Life Cycle Activity","DA  no-arg CONTRSTUR");
        /* cant raise a toast here
        Toast t = Toast.makeText(this,"DisplayActivity No arg CONTSCTR",Toast.LENGTH_SHORT);
        t.setGravity(1,5,5);
        t.show();
        */
}



    public void back(View v)
    {
        Log.d("Life Cycle Activity","Display BACK()");
        Toast t = Toast.makeText(this,"DisplayActivity BACK()",Toast.LENGTH_SHORT);
        t.setGravity(1,5,5);
        t.show();
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast t = Toast.makeText(this,"DisplayActivity ONCREATE()",Toast.LENGTH_SHORT);
        t.setGravity(1,5,5);
        t.show();

        Log.d("Life Cycle Activity","DisplayActivity ONCREATE()");
        setContentView(R.layout.activity_display);

        ImageView img = (ImageView)findViewById(R.id.imageView);
        img.setImageResource(R.mipmap.chetan_green);

    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast t = Toast.makeText(this,"DisplayActivity ONStART",Toast.LENGTH_SHORT);
        t.setGravity(1,5,5);
        t.show();

        Log.d("Life Cycle Activity","DisplayActivity ONSTART()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast t = Toast.makeText(this,"DisplayActivity ONRESUME()",Toast.LENGTH_SHORT);
        t.setGravity(1,5,5);
        t.show();

        Log.d("Life Cycle Activity","DisplayActivity ONRESUME()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast t = Toast.makeText(this,"DisplayActivity onPause()",Toast.LENGTH_SHORT);
        t.setGravity(1,5,5);
        t.show();

        Log.d("Life Cycle Activity","DisplayActivity onPause()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast t = Toast.makeText(this,"DisplayActivity onRestart()",Toast.LENGTH_SHORT);
        t.setGravity(1,5,5);
        t.show();

        Log.d("Life Cycle Activity","DisplayActivity onRestart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast t = Toast.makeText(this,"DisplayActivity onStop()",Toast.LENGTH_SHORT);
        t.setGravity(1,5,5);
        t.show();

        Log.d("Life Cycle Activity","DisplayActivity onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast t = Toast.makeText(this,"DisplayActivity onDestroy()",Toast.LENGTH_SHORT);
        t.setGravity(1,5,5);
        t.show();

        Log.d("Life Cycle Activity","DisplayActivity onDestroy()");
    }
}

