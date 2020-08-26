package com.example.chetan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.example.chetan.coffeecenter.R;

public class DrinksActivity extends Activity
{
  ListView lvDrinks ;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
       // gv = (GridView) findViewById(R.id.gdVDrinks);
        Toast.makeText(this,"in DRINKS ACTIVITY onCreate()",Toast.LENGTH_SHORT).show();

        lvDrinks = (ListView) findViewById(R.id.lvDrinks);
        Intent inRec = getIntent();
        String [] saC = inRec.getStringArrayExtra("saC");

        Toast.makeText(getApplicationContext(),"length of rcvd sa = "+saC.length,Toast.LENGTH_SHORT).show();
       /* String [] saIc = inRec.getStringArrayExtra("saIce");
        String [] saFd = inRec.getStringArrayExtra("saF");
        String [] saStr = inRec.getStringArrayExtra("saStr");
        String [] saD =inRec.getStringArrayExtra("saD");
        */
      //  for(String s:saC)
      //  Toast.makeText(this,s,Toast.LENGTH_SHORT).show();

       // String [] saSample = {"s1","s2","s3","s4","s5","s2","s3","s4","s5"};
        ArrayAdapter<String> arryAdapCategry = new ArrayAdapter<String>(this, android.support.v7.appcompat.R.layout.support_simple_spinner_dropdown_item,saC);
        //ArrayAdapter<String> arryAdapCategry = new ArrayAdapter<String>(this, android.support.v7.appcompat.R.layout.support_simple_spinner_dropdown_item,saSample);
  /*  if (saIc != null )
    {
        Toast.makeText(getApplicationContext()," saIce not null ",Toast.LENGTH_LONG).show();
        arryAdapCategry =  new ArrayAdapter<String>(getApplicationContext(), android.support.v7.appcompat.R.layout.support_simple_spinner_dropdown_item,saIc);
    }
    else if ( saD != null )
    {
        Toast.makeText(getApplicationContext()," saDiNks not null ",Toast.LENGTH_LONG).show();
        arryAdapCategry =  new ArrayAdapter<String>(getApplicationContext(), android.support.v7.appcompat.R.layout.support_simple_spinner_dropdown_item,saD);
    }
    else if ( saFd != null )
    {
        Toast.makeText(getApplicationContext()," sa fod not null ",Toast.LENGTH_LONG).show();
        arryAdapCategry =  new ArrayAdapter<String>(getApplicationContext(), android.support.v7.appcompat.R.layout.support_simple_spinner_dropdown_item,saFd);
    }
        else if ( saStr != null )
    {
        Toast.makeText(getApplicationContext()," sa store not null ",Toast.LENGTH_LONG).show();
        arryAdapCategry =  new ArrayAdapter<String>(getApplicationContext(), android.support.v7.appcompat.R.layout.support_simple_spinner_dropdown_item,saStr);
    }
        */
        lvDrinks.setAdapter(arryAdapCategry);
       // if (arryAdapCategry == null )
         //   Toast.makeText(getApplicationContext(),"array add ref is till null ",Toast.LENGTH_LONG).show();
       // else

        lvDrinks.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long id)
            {
                String [] saTimePass = null ;
                if ( pos == 0)
                {
                    String [] saInts = {"12","123123","4","36-24-36","45","67","89"};
                    saTimePass = saInts;
                }
                else if ( pos == 1)
                {
                    String [] saChars = {"v","i","d","y","a","b","L","A","C","K","Y"};
                    saTimePass = saChars ;
                }
                else
                {
                    saTimePass = new String[4];
                    saTimePass[0] = "Bnglore";
                    saTimePass[1]= "ram nagara";
                    saTimePass[2]= "giriyapur";
                    saTimePass[3] ="kadur";
                }
                try
                {
                    Intent inSpl = new Intent(getApplicationContext(),SpecialActivity.class);
                    inSpl.putExtra("saSp",saTimePass);
                    startActivity(inSpl);
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
