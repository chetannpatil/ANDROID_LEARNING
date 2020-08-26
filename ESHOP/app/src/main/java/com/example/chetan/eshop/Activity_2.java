package com.example.chetan.eshop;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_2 extends Activity
{

    ListView lvOfDL ;
    DrawerLayout dlOfA2;
    private ActionBarDrawerToggle abdt ;
    String titStr ="E-SHOP";
    ListView lvOfDisp;
    int positionInt;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_2);
        dlOfA2 = (DrawerLayout) findViewById(R.id.activity2sDrwerLayout);
        lvOfDL = (ListView)findViewById(R.id.lvOfDlOfA2);

        //lv of dsip
        lvOfDisp = (ListView) findViewById(R.id.displyOfA2ListView);

        lvOfDisp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                String s = ((TextView)view).getText().toString().toUpperCase();
                Toast.makeText(view.getContext(),s,Toast.LENGTH_SHORT).show();
            }
        });
        if (savedInstanceState != null )
        {
            ActionBar ab = getActionBar();
            titStr = savedInstanceState.getString("t"); //tv.getText().toString();
            ab.setTitle(titStr);
        }

        String saA2 [] = getResources().getStringArray(R.array.arrayOfStore);
     /*   ArrayAdapter<String> ada = new
                ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,saA2);
        lvOfDL.setAdapter(ada);*/
        lvOfDL.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int posInt, long l)
            {
                TextView tv = (TextView)v;
                Toast.makeText(tv.getContext(),posInt+"",Toast.LENGTH_SHORT).show();
                ActionBar ab = getActionBar();
                titStr = tv.getText().toString();
                ab.setTitle(titStr);


              positionInt = posInt ;
                dlOfA2.closeDrawer(lvOfDL);
            }
        });

        //create ABDT

        abdt = new
                ActionBarDrawerToggle(this,dlOfA2,R.string.openDrawer,R.string.closeDrawer)
                {

                    @Override
                    public void onDrawerOpened(View drawerView)
                    {
                        super.onDrawerOpened(drawerView);

                        invalidateOptionsMenu();


                    }

                    @Override
                    public void onDrawerClosed(View drawerView)
                    {
                        super.onDrawerClosed(drawerView);
                       // giveContentsForLV(positionInt);
                        invalidateOptionsMenu();


                    }
                };

        dlOfA2.addDrawerListener(abdt);

    }

    @Override
    public boolean onCreateOptionsMenu(final Menu m)
    {
        MenuInflater mnInfl = getMenuInflater();
        mnInfl.inflate(R.menu.menu_a2,m);
        return super.onCreateOptionsMenu(m);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        //DrawerLayout.DrawerListener dlf = abdt;
        Toast.makeText(this,item.toString().toUpperCase(),Toast.LENGTH_SHORT).show();
        if (abdt.onOptionsItemSelected(item) == true )
        {
            return true ;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState)
    {
        super.onPostCreate(savedInstanceState);
        abdt.syncState();
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig)
    {
        super.onConfigurationChanged(newConfig);
        abdt.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu mn)
    {
           final MenuItem paymentMenItm = mn.findItem(R.id.payMent);

           final MenuItem feeedMenItm = mn.findItem(R.id.feedback);

           final  MenuItem helpMenIte = mn.findItem(R.id.help);

        //check dl is open or not
        boolean isDrawerOpenBool = dlOfA2.isDrawerOpen(lvOfDL);



        if (isDrawerOpenBool == true )
        {
            paymentMenItm.setVisible(false);
            feeedMenItm.setVisible(true);
            helpMenIte.setVisible(false);
        }
        else
        {
            paymentMenItm.setVisible(true);
            feeedMenItm.setVisible(false);
            helpMenIte.setVisible(true);
        }
        return super.onPrepareOptionsMenu(mn);
    }

    @Override
    protected void onSaveInstanceState(Bundle b)
    {
        super.onSaveInstanceState(b);
        b.putString("t",titStr);
    }

 /*   private void  giveContentsForLV(int posInt)
    {

        Toast.makeText(this,"giveContentsForLV(int posInt) og A2",Toast.LENGTH_LONG).show();
        String [] sa = {"we","have","not","yet","added","anything","for","this","option"};
        switch (posInt)
        {
            case 1:
                sa = getResources().getStringArray(R.array.arrayOfMensWear);
                break;
            case 2:
                sa = getResources().getStringArray(R.array.arrayOfWomensWear);
                break;
            case 3:
                sa = getResources().getStringArray(R.array.arrayOfStore);
               break;

        }
        ArrayAdapter<String> arrayAdapterOfLv = new
                ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,sa);
        lvOfDisp.setAdapter(arrayAdapterOfLv);
    }*/

/*    private void setFrag(int pos)
    {
        Fragment fr = null ;

    }*/
}
