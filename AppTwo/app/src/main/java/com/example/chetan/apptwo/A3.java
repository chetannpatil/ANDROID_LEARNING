package com.example.chetan.apptwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class A3 extends AppCompatActivity
{

    ImageView img ;
    TextView tv ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3);

        img = (ImageView)findViewById(R.id.a3ImageView);
        tv = (TextView) findViewById(R.id.a3TVInfo) ;

        Intent reInt = getIntent();
        long n = reInt.getLongExtra("num",0);
        if (n == 0)
        {
            img.setImageResource(R.mipmap.chetan);
            tv.setText("CHETAN @ VILLAGE");
        }
        else
        {
            img.setImageResource(R.mipmap.chetan_green);
            tv.setText("CHETAN @ BANGALORE");
        }


    }

    public void toA4(View v)
    {
        Intent a4Int = new Intent(this,A4.class);
        startActivity(a4Int);
    }
}
