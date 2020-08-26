package com.example.chetan.appone;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {
    public CustomReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent)
    {
        Toast.makeText(context,intent.toString().toUpperCase(),Toast.LENGTH_LONG).show();
    }
}
