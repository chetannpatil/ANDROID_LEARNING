package com.example.chetan.eshop;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MensFragment extends Fragment
{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment

        //return inflater.inflate(R.layout.fragment_mens, container, false);
        return super.onCreateView(inflater,container,savedInstanceState);
    }

  /*  @Override
    public void onStart()
    {
        super.onStart();
        ListView lw = getListView();
       // lw.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_END);

        String []saW = getResources().getStringArray(R.array.arrayOfMensWear);

        ArrayAdapter<String> ad = new
                ArrayAdapter<String>(lw.getContext(), android.support.v7.appcompat.R.layout.support_simple_spinner_dropdown_item,saW);
        setListAdapter(ad);
    }*/
}
