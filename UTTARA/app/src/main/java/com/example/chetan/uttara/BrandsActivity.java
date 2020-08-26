package com.example.chetan.uttara;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BrandsActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_brands);
        setFrag();
       //ListView lvBrands = getListView();


   /*     String [] saFeat = {"alpha","q","u"};//getResources().getStringArray(R.array.featuresSA);
        ArrayAdapter<String> ada =
                new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,saFeat);
        setListAdapter(ada);*/


    }

 /*   @Override
    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        super.onListItemClick(l, v, position, id);
        //setFrag();
        //Intent buyAcIntent = new Intent(this,BuyListActivity.class);
       // startActivity(buyAcIntent);
    }*/

    private void setFrag()
    {
       // BrandsFragment bf = new BrandsFragment();
        SadaFragment sF = new SadaFragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.brandsFrameLayout,sF);
        ft.addToBackStack(null);
        ft.commit();
       // BrandsFragment bf = (BrandsFragment) getFragmentManager().findFragmentById(R.id.brandsFrag);
    }
}
