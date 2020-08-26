package com.example.chetan;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.chetan.welcomeapp.MainActivity;
import com.example.chetan.welcomeapp.R;

public class CreditsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        ImageView ivCredits = (ImageView)findViewById(R.id.imageView_credits);
        //ivCredits.setImageLevel(4);

        ivCredits.setImageResource(R.mipmap.chetan);
    }
    public  void back(View v)
    {
        Intent in = new Intent(this, MainActivity.class);
        startActivity(in);
    }
}
