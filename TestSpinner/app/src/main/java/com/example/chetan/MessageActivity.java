package com.example.chetan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.chetan.testspinner.R;

public class MessageActivity extends AppCompatActivity {

    private static TextView tvShowMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        tvShowMessage = (TextView) findViewById(R.id.tvDisplayMessage);

        Intent recvdIntent  = getIntent() ;
        String recvdMessage  = recvdIntent.getStringExtra("MESSAGE");

        String toastMesageStr = recvdIntent.getStringExtra("ToastMessage");
         String sizeStr = recvdIntent.getStringExtra("size");

           String [] saSize = sizeStr.split("-");




        int sizeInt =0 ;
        if (sizeStr == null )
            Toast.makeText(this,"yes string passed is null ",Toast.LENGTH_SHORT).show();
        if (sizeStr != null && sizeStr.trim().length() > 0)
        sizeInt = Integer.parseInt(saSize[saSize.length - 1]);


       // int recvInt = recvdIntent.getIntExtra("i",1000);
        tvShowMessage.setText(recvdMessage);

        String extrStr = recvdIntent.getStringExtra(Intent.EXTRA_TEXT);
        if (toastMesageStr.equalsIgnoreCase("items") == true )
            Toast.makeText(this,"SELECT 1 ITEM IN PREVOIUS SCREEN TO KNOW HER a** SIZE",Toast.LENGTH_LONG).show();
        else
        Toast.makeText(this,toastMesageStr+" has "+sizeInt+" sized bigg a**",Toast.LENGTH_LONG).show();

    }
}
