package com.example.chetan.eshop;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class TopFragment extends Fragment
{

TextView tvToA2;
    public TopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_top, container, false);
    }

    @Override
    public void onStart()
    {
        super.onStart();
        tvToA2 = (TextView) getView().findViewById(R.id.tvTopFrag);

        tvToA2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent activity2Intent = new Intent(v.getContext(),Activity_2.class);
                startActivity(activity2Intent);
            }
        });
    }



}
