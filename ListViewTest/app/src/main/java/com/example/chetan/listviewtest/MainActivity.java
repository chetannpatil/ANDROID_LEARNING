package com.example.chetan.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
//import android.support.v7.appcompat.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public  List<Actor> actors;
    ActorAdapter actAdapter;

    //ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

     //   data = new ArrayList<String>();
     ////   data.add("saple1");
     //   data.add("saple2");

        //creating cdapter
      //  adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,data);

        ListView lv = (ListView)findViewById(R.id.lv);
        actors = new ArrayList<Actor>();

        Actor a1 = new Actor("shrda kapoor",198);
        Actor a2 = new Actor("pari",58);
        Actor a3 = new Actor("konkan sen",68);
        //actors.add();
        actors.add(a1);
        actors.add(a2);
        actors.add(a3);

       actAdapter = new ActorAdapter(this,R.layout.actor,actors);
        //actAdapter = new ActorAdapter()
        lv.setAdapter(actAdapter);
       // lv.setAdapter(adapter);

        //ataching click n long clicks

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {

                Toast.makeText(getApplicationContext(),"Clicked",Toast.LENGTH_LONG).show();

            }
        });

        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Long Clicked",Toast.LENGTH_LONG).show();

                return false;
            }
        });

    }
}
