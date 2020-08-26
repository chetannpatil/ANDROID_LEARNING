package com.example.chetan;


import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.chetan.coffeecenter.R;

public class SpecialActivity extends ListActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Toast.makeText(this,"inside SpEcial act's onCreate()",Toast.LENGTH_LONG).show();
        Intent recvIntent = getIntent() ;
        String [] saRcv = recvIntent.getStringArrayExtra("saSp");
        ListView lvInBuilt = null ;
        try
        {
            lvInBuilt = getListView() ;
            ArrayAdapter<String> arryAd = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,saRcv);
            lvInBuilt.setAdapter(arryAd);
            lvInBuilt.setOnItemClickListener(new AdapterView.OnItemClickListener()
            {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View vw, int pos, long id)
                {
                    TextView tv = (TextView) vw;

                    Toast.makeText(getApplicationContext(),tv.getText().toString().toUpperCase()+" is waste body",Toast.LENGTH_SHORT).show();
                }
            });
        }
        catch (Exception e)
        {
            Toast.makeText(this,e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
        }


    }

  /*  @Override
    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        super.onListItemClick(l, v, position, id);
        TextView tv = (TextView) v;

        Toast.makeText(this,tv.getText().toString().toUpperCase(),Toast.LENGTH_LONG).show();
    }
*/
}
