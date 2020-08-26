package com.example.chetan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.example.chetan.workoutapp.R;
import layout.WorkDetails;

public class DetailsActivity extends Activity
{
    WorkDetails workDetailsFrag ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        workDetailsFrag = (WorkDetails) getFragmentManager().findFragmentById(R.id.DetailsActivitisfragment);

        //getint
        Intent recvdIntent = getIntent() ;
        long w_id = recvdIntent.getLongExtra("wId",0);
        workDetailsFrag.setWorkId(w_id);

    }
}
