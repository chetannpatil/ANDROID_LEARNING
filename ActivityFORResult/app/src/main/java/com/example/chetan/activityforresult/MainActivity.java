package com.example.chetan.activityforresult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.chetan.A1;

public class MainActivity extends Activity {

    TextView tvAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
       // setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        tvAddress = (TextView)findViewById(R.id.tvAddress);
       // tvAddress = (TextView)findViewById(R.id.tvAddress);


    }

    public void hookMA(View v)
    {
        //int reqcode=0,resulCode=0;
        Intent i = new Intent(this, A1.class);
        startActivityForResult(i,1);
       //onActivityResult(1,RESULT_OK,i);
        // onActivityResult(reqcode,resulCode,Intent.class);
       // onActivityResult(1,RESULT_OK,i);
      //  onActivityReenter(1,Intent.);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode==RESULT_OK && requestCode==1)
        {

           // =Intent.getIntent();
           // Intent i = getIntent();
            //data = getIntent();
           String resAdd= data.getStringExtra(Intent.EXTRA_TEXT);
           // String strResAddress = i.getStringExtra(Intent.EXTRA_TEXT);
           // tvAddress.setText(strResAddress);
          //  tvAddress.setText(resAdd);
            Toast.makeText(this,resAdd,Toast.LENGTH_LONG).show();
            tvAddress.setText(resAdd);
        }
        else
        {
            Toast.makeText(this,"fill address & come back pls",Toast.LENGTH_SHORT).show();
            tvAddress.setText("");
        }
    }
}
