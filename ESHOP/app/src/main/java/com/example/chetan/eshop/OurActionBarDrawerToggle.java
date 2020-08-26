package com.example.chetan.eshop;

import android.app.ActionBar;
import android.app.Activity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by chetan on 14/3/17.
 */
public class OurActionBarDrawerToggle extends ActionBarDrawerToggle
{
    ActionBar ab ;
    //MenuItem mnItem ;
   public OurActionBarDrawerToggle(Activity a, DrawerLayout dl, int s1, int s2)
    {
        super(a,dl,s1,s2);
        ab = a.getActionBar();

    }

    @Override
    public void onDrawerOpened(View drawerView)
    {
        super.onDrawerOpened(drawerView);
       // MenuItem mnItem = new Menu(R.menu.menu_a2).findItem(R.id.payMent);
       /* Menu m  = new Menu()
        {
        };*/
    }

    @Override
    public void onDrawerClosed(View drawerView)
    {
        super.onDrawerClosed(drawerView);
    }

    /*@Override
    public void onDrawerStateChanged(int newState) {
        super.onDrawerStateChanged(newState);
    }*/
}
