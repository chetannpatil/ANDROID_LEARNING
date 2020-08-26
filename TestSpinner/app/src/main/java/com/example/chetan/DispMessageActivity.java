package com.example.chetan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.chetan.testspinner.R;

public class DispMessageActivity extends AppCompatActivity {

    TextView tvD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disp_message);

        tvD = (TextView) findViewById(R.id.tvImplInt);

        Intent rcvIn = getIntent() ;
        String rcvStr = rcvIn.getStringExtra(Intent.EXTRA_TEXT);

        tvD.setText(rcvStr);
    }
}
