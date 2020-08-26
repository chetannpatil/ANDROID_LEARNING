package com.example.chetan.appone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  Intent rcvInt = getIntent() ;
        //int a = rcvInt.getIntExtra("int",0);
    }

    public void openActivityOneAppOne(View view)
    {


       Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
       // startActivity(intent);

        Intent popupIntent = Intent.createChooser(intent ,"U ALWAYS C THIS WINDOW :)");
      //  popupIntent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,"THE MESSAGE PASSED BY DEFAULT ALWAYS & U DO NOT HAVE CONTROL TO CHANGE IT, AN IN BUILT MESSAGE IN OTHER WORDS");
       // popupIntent.putExtra(Intent.EXTRA_SUBJECT,"THE SUBJECT PASSED BY DEFAULT");
      //  popupIntent.putExtra(Intent.EXTRA_PACKAGE_NAME,"THE PACKAGE NAME");
        startActivity(popupIntent);
      /*
 Intent intent = new Intent("com.example.chetan.appone.ActivityOneAppOne");

        startActivity(intent);

        */
    }


    public void openCamera(View v)
    {
        Intent intentImplicit = new Intent(Intent.ACTION_CAMERA_BUTTON);
        intentImplicit.setType("text/plain");
        Intent chsInt = Intent.createChooser(intentImplicit ,"TRY CAMERA");
        startActivity(chsInt);

    }

    public void toA2(View v)
    {
        Intent a2Inten = new Intent(this,ActivityOneAppOne.class);
        startActivity(a2Inten);

    }




}
