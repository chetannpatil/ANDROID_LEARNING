package com.example.chetan.uttara;


import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


public class SadaFragment extends ListFragment
{

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
        Character  ca [] = new Character[100];
        for (int i= 0,k=0 ;i<ca.length; i++,k++)
        {
            ca[i] = (char) k;
        }
        ArrayAdapter<Character> ada =
                new ArrayAdapter<Character>(getView().getContext(),R.layout.support_simple_spinner_dropdown_item,ca);
        setListAdapter(ada);

    }
}
