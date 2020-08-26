package com.example.chetan.appone;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class EarPhoneChangesReceiver extends BroadcastReceiver {
    public EarPhoneChangesReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent)
    {
        Toast.makeText(context,"EAR PHON HAAKONDL ",Toast.LENGTH_LONG).show();
    }
}
