package com.example.chetan.workoutapp;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.chetan.Activity2;
import com.example.chetan.DetailsActivity;
import layout.WNamesListFragment;
import layout.WorkDetails;

public class MainActivity extends Activity implements WInterface
{

   // WorkDetailsFrameLayout lay ;
    //private static long idOfClickedItemLong ;
    //Fragment frag ;
  //  View v;
    //TextView tvTitle, tvDesc;
   // EditText etUserInput ;
   // WorkDetails fragWork ;
    //WorkOutListFragment fragWList;

    WNamesListFragment fragWNameList;



    @Override
    protected void onCreate(Bundle bd)
    {
        super.onCreate(bd);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"in MA onCreate(Bundle bd) ", Toast.LENGTH_SHORT).show();
        //Toast.makeText(this,"in MA oncreate()",Toast.LENGTH_SHORT).show();
       /* if ( bd != null )
        {
            Toast.makeText(this,"in MA onCreate(Bundle bd) when bd!= null with idoclick = "+idOfClickedItemLong, Toast.LENGTH_SHORT).show();
           idOfClickedItemLong= bd.getInt("fId");
            //onItemClick(idOfClickedItemLong);
           // WorkDetails wrkFrag = new WorkDetails() ;
           // wrkFrag.setWorkId(posLong);

            //FragmentTransaction ft  = getFragmentManager().beginTransaction();

            //ft.replace(R.id.WorkDetailsFrameLayout,wrkFrag);
           // ft.commit() ;


        }*/
       // etUserInput = (EditText) findViewById(R.id.etInput);

      //  fragWork = (WorkDetails) getFragmentManager().findFragmentById(R.id.fragmentWork);
       // fragWork.setWorkId(fragWork.getWorkId());
/*
        Intent rcvIntnt = getIntent();
        int indexInt = rcvIntnt.getIntExtra("intVar",2);
        fragWork.setWorkId(indexInt);

        */
        //fragWork = ( WorkDetails) getFragmentManager().findFragmentById(R.id.fragmentWork);
        //(WorkDetails) getFragmentManager().findFragmentById(R.id.fragmentWork);
       // WorkDetails workDetailsFrag = (WorkDetails)getFragmentManager().findFragmentById(R.id.fragmentWork);
      //  tvTitle = (TextView) findViewById(R.id.tvTitle);
      //  tvDesc = (TextView) findViewById(R.id.tvDesc);

       // Activity a = new Activity();


   // fragWList = (WorkOutListFragment) getFragmentManager().findFragmentById(R.id.fragmentWList);
    //fragWNameList = (WNamesListFragment) getFragmentManager().findFragmentById(R.id.fragOfFramLayOut);


    }

   /*
    public void onClickEditText(View v)
    {

        try
        {
            if (etUserInput.getText() != null )
            {
                String inputStr = etUserInput.getText().toString();
                if (inputStr.trim().length() == 0)
                    Toast.makeText(this,"PLEASE DO NOT LEAVE EDITTEXT BOX EMPTY, WE CAN NOT PROCEED",Toast.LENGTH_SHORT).show();
                else
                {
                    //int arrayIndexInt = 0;
                   int  arrayIndexInt= Integer.parseInt(etUserInput.getText().toString());
                    if (arrayIndexInt > 2 || arrayIndexInt < 0 )
                        throw new IllegalArgumentException("PLEASE ENTER NUMBER FROM ONLY 0 TO 2");
                    WorkOut workOutObj = WorkOut.modelsWorkArray[arrayIndexInt];
                    tvTitle.setText(workOutObj.getNameStr());
                    tvDesc.setText(workOutObj.getDescriptionStr());
                }


            }
            else
                Toast.makeText(this,"PLEASE ENTER A NUMBER  ",Toast.LENGTH_LONG).show();
        }
       catch (Exception e)
       {
           Toast.makeText(this,e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
       }

    }

    */

  /*  @Override
    public void clickItem(long id)
    {
        Toast.makeText(this,"in MA clickItem(long id)",Toast.LENGTH_SHORT).show();
        //fragWork.setWorkId(id);
        // getFragmentManager().beginTransaction();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        WorkDetails wrkFrag = new WorkDetails() ;
        wrkFrag.setWorkId(id);
        //ft.add(R.id.WorkDetailsFrameLayout,wrkFrag);
        ft.replace(R.id.WorkDetailsFrameLayout,wrkFrag);
        ft.addToBackStack(null);
       // ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();

    }
*/

    @Override
    public void onItemClick(long id)
    {
       // Toast.makeText(this,"in MA onItemClick(long id) with id = "+id, Toast.LENGTH_SHORT).show();
        View fLView = findViewById(R.id.WorkDetailsFrameLayout);
        if ( fLView != null )
        {
            WorkDetails wrkFrag = new WorkDetails() ;
            FragmentTransaction ft  = getFragmentManager().beginTransaction();
            wrkFrag.setWorkId(id);
            ft.replace(R.id.WorkDetailsFrameLayout,wrkFrag);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            // ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            ft.addToBackStack(null);
            // ft.addToBackStack(FragmentTransaction.)
            // ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
            // ft.setTransition(FragmentTransaction.TRANSIT_NONE);

            // idOfClickedItemLong = id ;
            // Toast.makeText(this,"in MA onItemClick(long id) aftre setting idoclick = "+idOfClickedItemLong, Toast.LENGTH_SHORT).show();
            ft.commit();
            // ft.commitAllowingStateLoss() ;
            // ft.commitNowAllowingStateLoss();
            //ft.commitNow();
        }
        else
        {
            Intent detailsActivityIntent = new Intent(this, DetailsActivity.class);
            detailsActivityIntent.putExtra("wId",id);
            startActivity(detailsActivityIntent);
        }


    }
  /*  @Override
    protected void onSaveInstanceState(Bundle b)
    {
        super.onSaveInstanceState(b);
        Toast.makeText(this,"in MA onSaveInstanceState(Bundle b) with idoclick = "+idOfClickedItemLong, Toast.LENGTH_SHORT).show();
      // Fragment f =  getFragmentManager().findFragmentById(R.id.);
      //  WNamesListFragment w = new WNamesListFragment();

      //  ListView lv =  w.getListView();
      //  b.putInt("fragId",lv.getSelectedItemPosition());
       b.putLong("fId",idOfClickedItemLong);
       // b.putLong("",wo);



    }*/


   /* @Override
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(this,"in MA  onStart() with idoclick = "+idOfClickedItemLong, Toast.LENGTH_SHORT).show();
        onItemClick(idOfClickedItemLong);
    }*/

    public void toActivity2(View v)
    {
        Intent a2Intent = new Intent(this, Activity2.class);
        startActivity(a2Intent);
    }
}
