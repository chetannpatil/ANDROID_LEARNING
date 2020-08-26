package com.example.chetan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.chetan.appcontactingotherapps.R;

public class InBuiltMessanger extends AppCompatActivity
{
    TextView tvDisplay ,tvSubj;
    Button btnDynamic;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_in_built_messanger);
        Intent recvdIntent = getIntent() ;
        String recvdStr = recvdIntent.getStringExtra(Intent.EXTRA_TEXT);
        String recvdSubStr = recvdIntent.getStringExtra(Intent.EXTRA_SUBJECT);

        tvDisplay = (TextView) findViewById(R.id.tv);
        tvSubj = (TextView) findViewById(R.id.tvSubj);

        btnDynamic = (Button) findViewById(R.id.btnDisp);

     /*   tvDisplay = new TextView(this);
       /// setContentView(tvDisplay);



        tvSubj = new TextView(this);
       // setContentView(tvSubj);

        btnDynamic = new Button(this);
        btnDynamic.setMaxHeight(10);
        btnDynamic.setMaxWidth(20);

        setContentView(btnDynamic);
*/
         // R.layout.activity_in_built_messanger

       // btnDynamic.setText(recvdStr);




        tvDisplay.setText("MESSAGE IS = "+recvdStr);
        tvSubj.setText("subect = "+recvdSubStr);
        Toast.makeText(this,"sub = "+recvdSubStr,Toast.LENGTH_LONG).show();
    }

    public void t1(View v)
    {
        Toast.makeText(this,"A1 ",Toast.LENGTH_LONG).show();
    }
}
