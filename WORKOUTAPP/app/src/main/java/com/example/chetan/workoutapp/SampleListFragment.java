package com.example.chetan.workoutapp;


import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class SampleListFragment extends ListFragment
{


    public SampleListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {

        return super.onCreateView(inflater,container,savedInstanceState);
    }

    @Override
    public void onStart()
    {
        super.onStart();
       // ListView lv = getListView();

        String []sa = getResources().getStringArray(R.array.a2StringArray);
        ArrayAdapter<String> arrayAdapterSamples = new
                ArrayAdapter<String>(getListView().getContext(),R.layout.support_simple_spinner_dropdown_item,sa);
        setListAdapter(arrayAdapterSamples);
    }
}
