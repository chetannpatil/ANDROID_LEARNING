package com.example.chetan.apptwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class A4 extends AppCompatActivity {

    ListView lv ;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a4);

        String [] sa = getResources().getStringArray(R.array.sa);
        int [] ia = getResources().getIntArray(R.array.ia2);

        ArrayAdapter ada  = new ArrayAdapter(this,
                R.layout.support_simple_spinner_dropdown_item,
                sa);
        lv = (ListView) findViewById(R.id.a4LV);
        lv.setAdapter(ada);
       // ArrayAdapter adaa = new ArrayAdapter()



    }
}
