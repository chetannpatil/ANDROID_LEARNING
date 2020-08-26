package com.example.chetan;

import android.app.Activity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.chetan.coffeecenter.R;

public class Ice_Creams extends Activity
{
   Spinner spnr ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice__creams);
        Toast.makeText(this,"In ICE CREAMS onCreate()",Toast.LENGTH_SHORT).show();
        spnr = (Spinner) findViewById(R.id.spnrIceCreams);
        String [] saIceCreams = {"buuter scotch","venilla","chocolate","strawaberry","mangao","fileapple","plane","lemon-flavoured"};
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.support.v7.appcompat.R.layout.support_simple_spinner_dropdown_item,saIceCreams);

        spnr.setAdapter(aa);

   /*     spnr.setOnItemClickListener(
                new AdapterView.OnItemClickListener()
                {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                String spnItemStr = spnr.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(),spnItemStr.toUpperCase(),Toast.LENGTH_SHORT).show();
            }
        });
        */
    }

   /* public void showItem(View v)
    {
        String spnItemStr = spnr.getSelectedItem().toString();
        Toast.makeText(this,spnItemStr.toUpperCase(),Toast.LENGTH_SHORT).show();
    }
    */
}
