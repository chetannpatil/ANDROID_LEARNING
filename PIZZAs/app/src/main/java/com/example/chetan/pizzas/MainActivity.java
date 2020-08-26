package com.example.chetan.pizzas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ShareActionProvider;
import android.widget.Toast;

import com.example.chetan.Activity2;

public class MainActivity extends AppCompatActivity
{
    //Menu mn ;
    int idOfActionSettingsInt ;
    int idOfCreateOrder ;
    ShareActionProvider sap ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        idOfActionSettingsInt = R.id.action_settings ;
        idOfCreateOrder = R.id.create_order ;

      //  mn = (Menu) findViewById(R.id.action_settings);
      /*  MenuInflater mI = new MenuInflater(this);
        //mI.inflate(R.id.action_settings,R.menu.menu);
        mn = (Menu) findViewById(R.id.action_settings);
        //mn = (Menu) findViewById(R.menu.menu);
       // mI.inflate(R.menu.menu,mn);
        mI.inflate(R.menu.menu,mn);*/
    }


    public void tvClick(View v)
    {
        Intent inA2 = new Intent(this, Activity2.class);
        startActivity(inA2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu mn)
    {
       /* mn = (Menu) findViewById(R.id.action_settings);
        MenuInflater mnInf = new MenuInflater(this);
        mnInf.inflate(R.menu.menu,mn);*/
      //  getMenuInflater().inflate(R.menu.menu,mn);
        MenuInflater mnInf = getMenuInflater();
        mnInf.inflate(R.menu.menu,mn);
        MenuItem mnItem = mn.findItem(R.id.action_share);

      sap = (ShareActionProvider)  mnItem.getActionProvider() ;


        Intent actionIntent = new Intent(Intent.ACTION_SEND);
        actionIntent.setType("text/plain");

        sap.setShareIntent(actionIntent);

        return super.onCreateOptionsMenu(mn);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {

        int idOfItemInt = item.getItemId() ;
        if ( idOfItemInt == idOfActionSettingsInt )
        {
            Toast.makeText(this,"SEETINGS SELECTED & id = "+idOfActionSettingsInt,Toast.LENGTH_LONG).show();
        }
        if (idOfItemInt == idOfCreateOrder )
        {
            Toast.makeText(this,"CreateOrder SELECTED & id = "+idOfCreateOrder,Toast.LENGTH_SHORT).show();
            Intent inCreateOrder = new Intent(this,Activity2.class);
            startActivity(inCreateOrder);

        }
       /* if ( idOfItemInt == R.id.action_share)
        {
            Intent actionIntent = new Intent(Intent.ACTION_SEND);
            actionIntent.setType("text/plain");

          //  startActivity(Intent.createChooser(actionIntent,"NO always optoions ...:)"));
            sap = (ShareActionProvider) item.getActionProvider() ;
            sap.setShareIntent(actionIntent);
           // Toast.makeText(this,"SHERED......:))))) = ",Toast.LENGTH_LONG).show();
        }*/

        return super.onOptionsItemSelected(item);
    }
}
