package com.example.chetan.messagepassing;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.chetan.Credits;


public class MainActivity extends AppCompatActivity {
    public static  EditText sendMessage ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"WELCOME TO ANDROID VILLE",Toast.LENGTH_LONG).show();
    }


public  void credits(View v)
{
    // message();
    sendMessage = (EditText)findViewById(R.id.editText_sendMsaage);

    String s1=sendMessage.getText().toString();


    /*  explixityle= clling explict intet
    Intent in = new Intent(this,ReceiveActivity.class);
   */
    //implicityl calllg explict intent
    Intent in1 = new Intent(this, Credits.class);
    startActivity(in1);
}

    public void moveToMessage(View v)
    {
        Toast.makeText(this,"Courtesy CHETAN PATIL",Toast.LENGTH_LONG).show();
        //message();
           sendMessage = (EditText)findViewById(R.id.editText_sendMsaage);

        String s1=sendMessage.getText().toString();


        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,s1+"\n\n"+"With LOL from CHETAN PATIL");
        Intent choseIntent = Intent.createChooser(intent,"Send message");
        //startActivity(intent);
        startActivity(choseIntent);

    }
}
