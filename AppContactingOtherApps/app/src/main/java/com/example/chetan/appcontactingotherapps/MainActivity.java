package com.example.chetan.appcontactingotherapps;

import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private EditText etMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etMessage = (EditText) findViewById(R.id.etEnterMessage);
    }

    public void openExplicitIntent(View v)
    {
       // Intent explicitInt = new Intent("com.example.chetan.XplicitIntActivity");
        Intent exInt = new Intent(this,com.example.chetan.XplicitIntActivity.class);
        startActivity(exInt);

    }
    public void openCamera(View v)
    {
        Intent cameraIntent = new Intent(Intent.ACTION_CAMERA_BUTTON);
        cameraIntent.setType("text/plain");
        try
        {
            startActivity(cameraIntent);
        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
        }
    }
        public void sendAMessage(View v)
        {
            String msgStr = etMessage.getText().toString();
            if (msgStr == null || msgStr.trim().length() == 0)
                Toast.makeText(this,"sending a blank mesage happy?",Toast.LENGTH_SHORT).show();
            // Intent cameraIntent = new Intent(this ,Intent.ACTION_CAMERA_BUTTON.getClass());
            // Intent cameraIntent = new Intent(this , Intent.ACTION_SEND.getClass());
            //  Intent cameraIntent = new Intent(Intent.ACTION_WEB_SEARCH);

            // startActivity(cameraIntent);

            Intent messengerIntent = new Intent(Intent.ACTION_SEND);
            // Intent messengerIntent = new Intent(Intent.ACTION_SEND_MULTIPLE);
            //  Intent messengerIntent = new Intent(Intent.ACTION_SENDTO);
            messengerIntent.setType("text/plain");
            messengerIntent.putExtra(Intent.EXTRA_TEXT , "sorry "+msgStr);
            messengerIntent.putExtra(Intent.EXTRA_SUBJECT ,"a subject ");
            try {
                startActivity(messengerIntent);

            } catch (Exception e) {
                Toast.makeText(getApplicationContext(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
            }
        }

}
