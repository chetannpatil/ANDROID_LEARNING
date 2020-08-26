package com.example.chetan.actionbardemo3;

import android.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setLogo(R.mipmap.ic_launcher);
        ab.setDisplayUseLogoEnabled(true);
        ab.setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuif = getMenuInflater();
        menuif.inflate(R.menu.main_activity_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

       public boolean onOptionsItemSelected(MenuItem item)
       {

           switch (item.getItemId()) {
               case R.id.info_id:
                   Toast.makeText(getApplicationContext(), "info id is sleected", Toast.LENGTH_SHORT).show();
                   break;
               case R.id.setting_id:
                   Toast.makeText(getApplicationContext(), "settings id is sleected", Toast.LENGTH_SHORT).show();
                   break;
               case R.id.search_bar_id:
                   Toast.makeText(getApplicationContext(), "search id is sleected", Toast.LENGTH_SHORT).show();
                   break;
               case R.id.scrollView_id:
                   Toast.makeText(getApplicationContext(), "scroll id is sleected", Toast.LENGTH_SHORT).show();
                 break;
               default:
           }
           return super.onOptionsItemSelected(item);

       }
}
