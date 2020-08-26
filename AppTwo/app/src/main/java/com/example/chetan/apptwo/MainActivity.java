package com.example.chetan.apptwo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String str ;
    EditText et;
    TextView tv;
    RatingBar rtb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"A1 ",Toast.LENGTH_SHORT).show();
        tv = (TextView) findViewById(R.id.textView);
        et = (EditText) findViewById(R.id.etNum);
        if (savedInstanceState != null )
        tv.setText(savedInstanceState.getString("bStr"));
        rtb = (RatingBar) findViewById(R.id.ratBarFeedback);
        rtb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener()
        {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b)
            {
                float ratInt =  rtb.getRating();  //.getNumStars();
                et.setText((ratInt*10)+"  %");
                float f = rtb.getStepSize();
                Toast.makeText(ratingBar.getContext(),f+" step size",Toast.LENGTH_LONG);
            }
        });

    }

    public void openActivityFromApptwo(View view)
    {
        Intent intent = new Intent("com.example.chetan.appone.ActivityOneAppOne");

        startActivity(intent);
    }
    public void toA2(View v)
    {
        Intent a3Intent = new Intent(this,A3.class);

       String str = et.getText().toString();
      long num = 0 ;
        if (str != null && str.trim().length() > 0)
        {
           // num = Integer.parseInt(str);
            num = Long.parseLong(str);

        }
        a3Intent.putExtra("num",num);
        startActivity(a3Intent);
    }

    @Override
    public void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        str = et.getText().toString();
        if (str != null )
        outState.putString("bStr",str);
    }

    public void onRatBarClick(View v)
    {
        int ratInt =  rtb.getNumStars();
        et.setText((ratInt*10)+"  %");
        showAllert();
     /*   final Handler handlerObj = new Handler();
        handlerObj.post(new Runnable()
        {
            @Override
            public void run()
            {
                synchronized (this)
                {
                    for (int i =0 ;i<25;i++)
                    {

                       // handlerObj.postDelayed(this,10000);
                        try
                        {
                            showAllert();
                           // wait(10000);

                            //handlerObj.

                        }
                        catch (Exception e)
                        {
                            e.printStackTrace();
                        }
                    }
                }

               // handlerObj.postDelayed(this,10000);
            }
        });*/



       // Toast.makeText(this,ratInt+" stars",Toast.LENGTH_LONG);



      /*  bull.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
            {
                TextView tv1 = (TextView)view;
                tv.setText(tv1.getText().toString());// = ()
                Toast.makeText(view.getContext(),tv1.getText().toString()+" is selected",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });*/
    /*    bull.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialogInterface)
            {
                Toast.makeText(getApplicationContext(),"cancelled",Toast.LENGTH_LONG).show();
            }
        });*/

     /*   View.OnClickListener okay = new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                TextView tv = (TextView)view;
                String s = tv.getText().toString();
                Toast.makeText(view.getContext(),s+" is selected as okay",Toast.LENGTH_LONG).show();

            }
        };*/

   /*     DialogInterface.OnClickListener cancell = new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface d, int i)
            {
               // TextView tv = (TextView)view;
               // String s = tv.getText().toString();
                Toast.makeText(getApplicationContext(),i+" is selected as canecll",Toast.LENGTH_LONG).show();


            }
        };*/



       // al.create();
    }

    void showAllert()
    {
        AlertDialog.Builder bull = new AlertDialog.Builder(this) ;
        bull.setTitle("EN-DANGERED SITE");
        bull.setIcon(R.mipmap.chetan);
        bull.setCancelable(true);
        bull.setMessage("this is alrt dilago hushhar R u above 18 ??? !!:)");


        DialogInterface.OnClickListener okay = new
                DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        if (i == -1)
                        Toast.makeText(getApplicationContext(),i+" is okay's i value",Toast.LENGTH_LONG).show();
                        else if (i == -2)
                        {
                            Toast.makeText(getApplicationContext(),i+" is cancelld value ",Toast.LENGTH_LONG).show();
                           // dialogInterface.cancel();
                            finish();
                        }

                    }
                };
      /*  DialogInterface.OnClickListener cancellAl = new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                // TextView tv = (TextView)view;
                // String s = tv.getText().toString();
                Toast.makeText(getApplicationContext(),i+" is cancelld value ",Toast.LENGTH_LONG).show();
            }
        };*/

        bull.setPositiveButton("YES M READY",  okay);
        bull.setNegativeButton("NO M A KID :(",okay);
        //bull.set
        AlertDialog al = bull.create();
        al.show();

    }//showal() ends

    @Override
    public boolean onCreateOptionsMenu(Menu m)
    {
        MenuInflater mI = getMenuInflater();
        mI.inflate(R.menu.menu_main,m);
        return super.onCreateOptionsMenu(m);
    }
}//class ends
