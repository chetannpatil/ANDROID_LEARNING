package com.example.chetan.eshop;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class StoreFragment extends Fragment
{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
       /* String []saW = getResources().getStringArray(R.array.arrayOfStore);

        ArrayAdapter<String> ad =
                new ArrayAdapter<String>(inflater.getContext(), android.support.v7.appcompat.R.layout.support_simple_spinner_dropdown_item,saW);
        setListAdapter(ad);*/
        return super.onCreateView(inflater,container,savedInstanceState);
    }

}
