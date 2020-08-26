package com.example.chetan.uttara;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class BuyListActivity extends ListActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Character  ca [] = new Character[100];
        for (int i= 0,k=65 ;i<ca.length; i++,k++)
        {
            ca[i] = (char) k;
        }
        String [] sa = new String[100];
        for (int i =0 ;i<sa.length;i++)
        {
            sa[i] = "CHETAN";
        }
       //  getListView().setDividerHeight(1);
      //  getListView().setItemsCanFocus(true);
        String sa2 [] = getResources().getStringArray(R.array.buySA);
        ArrayAdapter<String> ada = new
                ArrayAdapter<String>
                (getApplicationContext(), android.support.v7.appcompat.R.layout.support_simple_spinner_dropdown_item,sa2);
        setListAdapter(ada);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        TextView tv = (TextView) v;

        Toast.makeText(this,"index = "+position+" & value "+tv.getText().toString().toUpperCase(),Toast.LENGTH_LONG).show();
    }
}
