package com.example.chetan.appone;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.widget.Toast;

public class BlueToothReceiver extends BroadcastReceiver
{
    public BlueToothReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent)
    {
       // int onOffInt = intent.getIntExtra(PhoneStateListener.)
        Toast.makeText(context,"aeroplane mode  on/off",Toast.LENGTH_LONG).show();
    }
}
