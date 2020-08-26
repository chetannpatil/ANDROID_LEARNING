package com.example.chetan.uttara;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity
{

   // ListView lv ;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
        BrandsFragment bf = (BrandsFragment)getFragmentManager().findFragmentById(R.id.brandsFragment);

        //lv =(ListView) findViewById(android.supp)
      /*  String [] saSamples = getResources().getStringArray(R.array.sampleSA);
        ListView lv = getListView();
        ArrayAdapter<String> ad = new
                ArrayAdapter<String>(this, android.support.v7.appcompat.R.layout.support_simple_spinner_dropdown_item,saSamples);
        lv.setAdapter(ad);
       // setListAdapter(ad);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
               // Toast.makeText(this,((TextView)v).getText().toString().toUpperCase(),Toast.LENGTH_SHORT).show();
                Intent brandsActIntent = new Intent(view.getContext(),BrandsActivity.class);
                startActivity(brandsActIntent);

            }
        });*/
    }

  /*  @Override
    public boolean onCreateOptionsMenu(Menu m)
    {
        MenuInflater mnInfl = getMenuInflater();
        mnInfl.inflate(R.menu.menu_main,m);
        return super.onCreateOptionsMenu(m);

    }*/

 /*   @Override
    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        super.onListItemClick(l, v, position, id);
        Toast.makeText(this,((TextView)v).getText().toString().toUpperCase(),Toast.LENGTH_SHORT).show();
        Intent brandsActIntent = new Intent(this,BrandsActivity.class);
        startActivity(brandsActIntent);

    }*/
}
