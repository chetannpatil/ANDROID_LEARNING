package com.example.chetan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.chetan.messagepassing.MainActivity;
import com.example.chetan.messagepassing.R;

public class Credits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
    }

    public void back(View v)
    {
        Intent inBackToMain = new Intent(this, MainActivity.class);
        startActivity(inBackToMain);
    }
}
