package com.example.chetan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.chetan.activityforresult.MainActivity;
import com.example.chetan.activityforresult.R;

public class A1 extends Activity {

    EditText etAddress ;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);
        etAddress = (EditText) findViewById(R.id.etAddress);
        //setContentView(R.layout.activity_a1);
     //   (R.id.etAddress);
    }

    public void hookOfA1(View v)
    {
        String strAddress = etAddress.getText().toString();
        Toast.makeText(this,strAddress,Toast.LENGTH_SHORT).show();
        Intent iData = new Intent(this, MainActivity.class);
        //data added t intnt
        iData.putExtra(Intent.EXTRA_TEXT,strAddress);
        if (strAddress.isEmpty() || strAddress==null)
        {
            setResult(RESULT_CANCELED,iData);
        }

        else
            setResult(RESULT_OK,iData);

        finish();

    }
}
