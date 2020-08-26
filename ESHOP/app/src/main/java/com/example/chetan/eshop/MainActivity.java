package com.example.chetan.eshop;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ShareActionProvider;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity
{

    // WomensFragment wF ;
    //TopFragment tF;
   // ActionBar ab;
    NDrawer nDrawerObj;
    ListView lvOfDrawer;
    DrawerLayout dl;
    ActionBarDrawerToggle abdt ;
   // int positionOfArrayOfTitleOfAbInt ;
    //String titleOfABStr ;
    ShareActionProvider sap;
    int positionOfArrayOfTitleOfABInt ;
    class NDrawer implements ListView.OnItemClickListener
    {

        @Override
        public void onItemClick(AdapterView<?> adapterView, View v, int pos, long id)
        {
            TextView tv = (TextView) v;
              Toast.makeText(v.getContext(),"in-> OnItemClick of Ndrwer with POS = "+pos,Toast.LENGTH_SHORT).show();
            Fragment fr = null;
            switch (pos)
            {

                case 1:
                    //  fr = (MensFragment)getFragmentManager().findFragmentById(R.id.contentsMAFrameLayout);
                    fr = new MensFragment();
                    break;
                case 2:
                    // fr = (WomensFragment)getFragmentManager().findFragmentById(R.id.contentsMAFrameLayout);
                    fr = new WomensFragment();
                    break;
                case 3:
                    // fr = (StoreFragment)getFragmentManager().findFragmentById(R.id.contentsMAFrameLayout);
                    fr = new StoreFragment();
                    break;
                default:
                    // fr = (TopFragment)getFragmentManager().findFragmentById(R.id.contentsMAFrameLayout);
                    fr = new TopFragment();
                    break;
            }
            if (fr != null)
            {
                positionOfArrayOfTitleOfABInt = pos;
                setTitleOfActionBar(positionOfArrayOfTitleOfABInt);
                showContents(fr);
            }




        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null )
        {
           // setTitleOfActionBar(savedInstanceState.getString("titleOfAbByBundle"));
            setTitleOfActionBar(savedInstanceState.getInt("titleOfAbByBundle"));
        }
        lvOfDrawer = (ListView) findViewById(R.id.dListView);

        String [] sa = getResources().getStringArray(R.array.arrayOfoptionsOfDrawer);
        String [] sa2 = {"a","b","c"};
        lvOfDrawer.setOnItemClickListener(new NDrawer());
     /*   ArrayAdapter<String> ad = new
                ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item,
                sa2);
        lv.setAdapter(ad);

      */

       /*  ArrayAdapter<String> arrayAdapterOptions =
                 new ArrayAdapter<String>(this, android.support.v7.appcompat.R.layout.abc_activity_chooser_view_list_item,sa2);
        lv.setAdapter(arrayAdapterOptions);*/
         dl = (DrawerLayout) findViewById(R.id.optionsDrawerLayout);


        //creating abdt
        abdt = new ActionBarDrawerToggle(this,dl,R.string.openDrawer,R.string.closeDrawer)
        {
            @Override
            public void onDrawerOpened(View drawerView)
            {
                super.onDrawerOpened(drawerView);
                invalidateOptionsMenu();
                //ActionBar ab = getActionBar();
                // MenuItem mnItem = mn.findItem(R.id.addToCart);
                //  mnItem.setVisible(false);

            }

            @Override
            public void onDrawerClosed(View drawerView)
            {
                super.onDrawerClosed(drawerView);
                invalidateOptionsMenu();
                // MenuItem mnItem = mn.findItem(R.id.addToCart);
                //mnItem.setVisible(true);

            }
        };

        dl.addDrawerListener(abdt);

        //when back button pressed baack stack
        getFragmentManager().addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener()
        {
           // FrameLayout fl = (FrameLayout) findViewById(R.id.contentsMAFrameLayout);
           // fl.
           // fl.
           // Fragment fr = getFragmentManager().;
            /*MensFragment mensFrag = new MensFragment();
            WomensFragment womenFrag = new WomensFragment();
            StoreFragment storeFrag = new StoreFragment();
            TopFragment topFrag = new TopFragment();*/

            @Override
            public void onBackStackChanged()
            {
               // setTitleOfActionBar(getFragmentManager()..toString());
                //titleOfABStr = lv.getSelectedItem().toString();
               // setTitleOfActionBar(titleOfABStr);
                Toast.makeText(getApplicationContext(),"onbackstack changed called",Toast.LENGTH_SHORT).show();
               // if (getFragmentManager().)
                int posOfArrayInt = getPositionOfCurrentFragmentOfFLOfMA();
                //getCurrentFragmentOfFLOfMA();
               // String currentFragNameStr = frag.getClass().getSimpleName();
                setTitleOfActionBar(posOfArrayInt);
                //setTitleOfActionBar(currentFragNameStr);

            }
        });

    }

    private int getPositionOfCurrentFragmentOfFLOfMA()
    {
        Fragment frag = getFragmentManager().findFragmentByTag("currentFrag");
        if (frag instanceof MensFragment)
        {
           //return new MensFragment();
            return 1;
        }
        else if (frag instanceof WomensFragment)
        {
            //return new WomensFragment();
            return 2;
        }
        else if (frag instanceof StoreFragment)
        {
           // return new StoreFragment();
            return 3;
        }
        else
            return 0;
    }
    private void showContents(Fragment frag)
    {
       /* FragmentTransaction ft = getFragmentManager().beginTransaction();

        */
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.contentsMAFrameLayout,frag,"currentFrag");
        ft.commit();
        dl.closeDrawer(lvOfDrawer);


       // FragmentTransaction ft = getFragmentManager().beginTransaction();
       // ft.replace(R.id.contentsMAFrameLayout, frag,"currentFrag");

       // ft.addToBackStack(null);
      //  ft.commit();



        //DrawerLayout dl = (DrawerLayout) findViewById(R.id.optionsDrawerLayout);
        // View lvOfDrwaer = findViewById(R.id.dListView);
        // ActionBarDrawerToggle abDT = new ActionBarDrawerToggle(this,dl,getResources().getStringArray(R.array.),2);
        // dl.closeDrawer(R.id.dListView);


    }

    private void setTitleOfActionBar(int posOfSAInt)
    {
        String titlsStr = getResources().getStringArray(R.array.arrayOfoptionsOfDrawer)[posOfSAInt];
        ActionBar ab = getActionBar();
        ab.setTitle(titlsStr);

    }

    @Override
    public boolean onCreateOptionsMenu(final Menu mn)
    {
        MenuInflater mnInf = getMenuInflater();
        mnInf.inflate(R.menu.menu, mn);
        MenuItem mItem = mn.findItem(R.id.share);
        sap = (ShareActionProvider)mItem.getActionProvider();
                //

        //mItem.getActionProvider();
        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.setType("text/plain");
        if (sap != null)
        {
            sap.setShareIntent(sendIntent);
        }
        return super.onCreateOptionsMenu(mn);
    }


        // ab= getActionBar() ;
        //ab.setDisplayHomeAsUpEnabled(true);
       // View lvOfDrwaer = findViewById(R.id.dListView);
    /*   abdt = new ActionBarDrawerToggle(this,dl,R.string.openDrawer,R.string.closeDrawer)
        {
            @Override
            public void onDrawerOpened(View drawerView)
            {
                super.onDrawerOpened(drawerView);
                invalidateOptionsMenu();
                //ActionBar ab = getActionBar();
               // MenuItem mnItem = mn.findItem(R.id.addToCart);
              //  mnItem.setVisible(false);

            }

            @Override
            public void onDrawerClosed(View drawerView)
            {
                super.onDrawerClosed(drawerView);
                invalidateOptionsMenu();
               // MenuItem mnItem = mn.findItem(R.id.addToCart);
                //mnItem.setVisible(true);

            }
        };*/

       // DrawerLayout.DrawerListener dlstner = aBDT ;

         // dlstner.
      // dl.setDrawerListener(aBDT);
    // dl.addDrawerListener(abdt);


    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        Toast.makeText(this,item.toString(),Toast.LENGTH_SHORT).show();
        if (abdt.onOptionsItemSelected(item) == true )
        {
            return true ;
        }
        return super.onOptionsItemSelected(item);


    }


    @Override
    public boolean onPrepareOptionsMenu(Menu mn)
    {
        boolean isDrawerOpenBool = dl.isDrawerOpen(lvOfDrawer);
        MenuItem mItem  = mn.findItem(R.id.share);
        if (isDrawerOpenBool == true )
        {
           mItem.setVisible(false);
        }
        else
        {
            mItem.setVisible(true);
        }


        return super.onPrepareOptionsMenu(mn);
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
    protected void onSaveInstanceState(Bundle b)
    {
        super.onSaveInstanceState(b);
        b.putInt("titleOfAbByBundle",positionOfArrayOfTitleOfABInt);
       // b.putString("titleOfAbByBundle",titleOfABStr);
    }

   // onprepare

}
