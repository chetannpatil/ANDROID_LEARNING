package com.example.chetan;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

import com.example.chetan.workoutapp.R;
import com.example.chetan.workoutapp.SampleListFragment;

public class Activity2 extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        SampleListFragment samLFrag = new SampleListFragment() ;
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.a2sFrameLayout,samLFrag);
        ft.commit() ;

    }
}
