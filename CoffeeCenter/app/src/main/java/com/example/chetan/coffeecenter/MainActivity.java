package com.example.chetan.coffeecenter;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.chetan.DrinksActivity;
import com.example.chetan.Ice_Creams;

import java.util.LinkedList;

public class MainActivity extends Activity
{
    ListView lvCheeses;
    EditText etOptions;
    String [] sa ;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Toast.makeText(this,"inside  onCreate(Bundle savedInstanceState) of MA",Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_main);

        //getListView();
        lvCheeses = (ListView) findViewById(R.id.lvCheeze);

        sa =  new String[4];
        sa[0] ="Drinks";
        sa[1] ="Food";
        sa[2]= "Ice-Creams" ;
        sa[3] ="Store";
        ArrayAdapter<String> arrayAdapterOfCheeses  = new ArrayAdapter<String>(this, android.support.v7.appcompat.R.layout.support_simple_spinner_dropdown_item,sa);
     //   ArrayAdapter<String> aa = new ArrayAdapter<String>(this,R.layout.adaplayoutfromxml,sa);
        lvCheeses.setAdapter(arrayAdapterOfCheeses);
        etOptions = (EditText) findViewById(R.id.etChoice);
       lvCheeses.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int pos, long id)
            {
                TextView lvTxt = (TextView)v;
                String lvTextStr = lvTxt.getText().toString();
               // Toast.makeText(getApplicationContext(),lvTextStr.toUpperCase(),Toast.LENGTH_SHORT).show();
                etOptions.setText(lvTextStr.toUpperCase());
                Intent inCategary = new Intent(getApplicationContext(), DrinksActivity.class);
                String [] saCategory = null ;
                if (lvTextStr.equalsIgnoreCase("Ice-Creams") == true )
            {
               // Toast.makeText(getApplicationContext(),lvTextStr.toUpperCase(),Toast.LENGTH_SHORT).show();

                String [] saIceCreams  = {"buuter scotch","venilla","chocolate","strawaberry","mangao","fileapple","plane","lemon-flavoured"};
               saCategory = saIceCreams ;
               // inCategary.putExtra("saIce",saIceCreams);

               // startActivity(inIceCreams);
            }
                if(lvTextStr.equalsIgnoreCase("store") == true )
                {
                   // Toast.makeText(getApplicationContext(),lvTextStr.toUpperCase(),Toast.LENGTH_SHORT).show();
                   // Intent inDrinks = new Intent(getApplicationContext(),DrinksActivity.class);
                    //startActivity(inDrinks);
                    String [] saStore = {"iPhone","lungeri","data-cable","cup","ribbon","tie","sooes","chappal","napkins","skore","masti",
                    "laxury","KS"};
                   // inCategary.putExtra("saStr",saStore);
                    saCategory = saStore ;
                }
              if (lvTextStr.equalsIgnoreCase("drinks") == true )
              {
                  String [] saDrinks = {"coffee","Tea","capacina","cold coffee","ice coffe","leonn tea","kashaya","badam milk","keshar milk",
                  "hot coffe","black tea","orange tea"};
                  //inCategary.putExtra("saD",saDrinks);
                  saCategory = saDrinks ;
              }
                if ( lvTextStr.equalsIgnoreCase("food") == true )
                {
                    String [] saFood = {"north meals","south meals","japnesse meals","rat fry","klmi kabab"};
                   // inCategary.putExtra("saF",saFood);
                    saCategory = saFood ;
                }
                inCategary.putExtra("saC",saCategory);
                startActivity(inCategary);

            }
        });

    }

    public void options(View v)
    {
        String [] saOptions = null ;
        saOptions = etOptions.getText().toString().trim().split(" ");
        LinkedList<String> ll = new LinkedList<String>();
        for (String str:saOptions)
        {
            if (str.trim().length() > 0 )
                ll.add(str.trim().toUpperCase());
        }
       // ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.support.v7.appcompat.R.layout.support_simple_spinner_dropdown_item,saOptions);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.support.v7.appcompat.R.layout.support_simple_spinner_dropdown_item,ll);
       // ArrayAdapter<String> aa = new ArrayAdapter<String>(this,R.layout.adaplayoutfromxml,ll);
       lvCheeses.setAdapter(aa);
    }

    public void toDrinksScreen(View v)
    {
        Intent inDrinks =new Intent(this, DrinksActivity.class);
        String [] sa2 = {"vicky","ram","samy"};
        inDrinks.putExtra("saC",sa2);
        startActivity(inDrinks);

    }

/*    public void toNextScreen(View v)
    {
        Toast.makeText(this,"inside  toNextScreen(View v)",Toast.LENGTH_LONG).show();
       String selectedItemStr =  lvCheeses.getSelectedItem().toString();
        if(selectedItemStr.equalsIgnoreCase("drinks") == true )
        {
            Intent inDrinks = new Intent(this,DrinksActivity.class);
            startActivity(inDrinks);
        }
        else if (selectedItemStr.equalsIgnoreCase("Ice-Creams") == true )
        {
            Intent inIceCreams = new Intent(this, Ice_Creams.class);
            startActivity(inIceCreams);
        }
        else
            Toast.makeText(this,"WE ll WORK ONLY FOR ICECREAMS & DRINKS ,REST ARE UNDER PROGRESS",Toast.LENGTH_LONG).show();
    }
    */

/*
    public void showLVSelectedItem(View v)
    {
        String slItemStr="";
       // if (lvCheeses.getSelectedItem() != null)
        slItemStr = lvCheeses.getSelectedItem().toString();
        Toast.makeText(this,slItemStr.toUpperCase(),Toast.LENGTH_SHORT).show();
        if(slItemStr.equalsIgnoreCase("drinks") == true )
        {
            Intent inDrinks = new Intent(this,DrinksActivity.class);
            startActivity(inDrinks);
        }
        else if (slItemStr.equalsIgnoreCase("Ice-Creams") == true )
        {
            Intent inIceCreams = new Intent(this, Ice_Creams.class);
            startActivity(inIceCreams);
        }
        else
            Toast.makeText(this,"WE ll WORK ONLY FOR ICECREAMS & DRINKS ,REST ARE UNDER PROGRESS",Toast.LENGTH_LONG).show();
    }
    */


}
