package com.example.chetan.welcomeapp;

import android.app.Activity;

import android.content.Intent;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import android.widget.Toast;

import com.example.chetan.CreditsActivity;
import com.example.chetan.WelcomeActivity;

public class MainActivity extends Activity {

    public static int count = 0;
    public static EditText et;

    public MainActivity()
    {
        Log.d("inside  MA","contrscter");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);

        Log.d("inside onCrete() of MA","msg");
        Toast.makeText(MainActivity.this,"WELCOME TO ANDROID VILLE",Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_main);
        //setContentView();
    }

    public void credits(View v)
    {
        Intent in = new Intent(this, CreditsActivity.class);
        startActivity(in);
    }
    public void sendMesseage(View v)
    {
        Log.d("in hookmethod of MA","msg");
         et = (EditText)findViewById(R.id.etName);

        String s1 = et.getText().toString();

        if (s1.isEmpty())
        {
            if (count==0)
            {
                Toast.makeText(MainActivity.this,"PLEASE ENTER YOUR NAME",Toast.LENGTH_LONG).show();
                count++;
                //break;
            }
            else if (count==1)
            {
                Toast.makeText(MainActivity.this,"YOU FOOL, SECOND TIME WARNING YOU",Toast.LENGTH_LONG).show();
                count++;
            }
            else
            {
                Toast.makeText(MainActivity.this,"THANK YOU,GOOD BYE",Toast.LENGTH_LONG).show();
                count++;
                et.setEnabled(false);
            }
        }
        else
        {

            char testChar;
            int testInt;
            for (int i = 0 ;i<s1.length();i++)
            {

                testChar = s1.charAt(i);
                testInt = (int) testChar;
                if ((testInt >= 65 && testInt <= 90) || (testInt >= 97 && testInt <= 122))
                {
                    if ((i+1)==(s1.length()))
                    {
                        et.setText("");
                        count = 0;
                        Log.d("str","data u entred is "+s1);
                        Intent in = new Intent(this, WelcomeActivity.class);
                       // in.putExtra(Intent.EXTRA_TEXT, s1);
                        in.putExtra("U_NAME",s1);
                        startActivity(in);
                    }
                    else
                    continue;
                }
                else
                {

                   Toast t = Toast.makeText(MainActivity.this, "ENTER A VALID NAME", Toast.LENGTH_LONG);
                    t.setGravity(0,0,0);
                    t.show();
                    //t.setText("ERROR");
                    //t.cancel();
                    et.setText("");
                    break;
                }
            }


         }





    }

}
