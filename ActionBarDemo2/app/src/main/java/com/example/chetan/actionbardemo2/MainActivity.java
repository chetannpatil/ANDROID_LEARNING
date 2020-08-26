package com.example.chetan.actionbardemo2;



import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ActionBar ab = getActionBar();
        //ActionBar ab = getActionBar();
        ActionBar ab = getSupportActionBar();
        ab.setLogo(R.mipmap.ic_launcher);
        ab.setDisplayUseLogoEnabled(true);
        ab.setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater = getMenuInflater();
       // getMenuInflater().inflate(R.menu.menu_main ,menu);
       // return true;
        menuInflater.inflate(R.menu.main_activity_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

 /*   public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        if (id==R.id.action_settings)
        {
            return true;
        }
    return super.onOptionsItemSelected(item);
    }
*/
}
