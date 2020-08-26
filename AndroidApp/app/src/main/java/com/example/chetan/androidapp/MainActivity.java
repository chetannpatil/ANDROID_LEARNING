package com.example.chetan.androidapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private   TextView t1;
    private static Button button_submit;
    public static final String MY_TAG= "the_custom_message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickButtonListener();
       // listenerForRatingBar();

    }

public void onClickButtonListener()
{
    button_submit = (Button)findViewById(R.id.button);
    button_submit.setOnClickListener(

            new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent("com.example.chetan.androidapp.SecondActivity");
                    startActivity(intent);
                }
            }
    );
}
    public void onButtonClick(View v)
    {
        EditText e1 = (EditText) findViewById(R.id.editText);

        EditText e2 = (EditText) findViewById(R.id.editText2);

        TextView t1 = (TextView) findViewById(R.id.textView);


        String s1= e1.getText().toString();

        int num1 = Integer.parseInt(s1);

        int num2 = Integer.parseInt(e2.getText().toString());

        int sum = num1+num2 ;

        t1.setText(Integer.toString(sum));
    }

    public void onclick( View w)
    {

          EditText e1 = (EditText) findViewById(R.id.editText3);

        TextView t1 = (TextView) findViewById(R.id.textView);

     //   t1.setText(e1.getText());

        Toast.makeText(MainActivity.this,e1.getText(),Toast.LENGTH_SHORT).show();
    }

    public void onClickCheckBox(View a)
    {
        CheckBox c1 = (CheckBox) findViewById(R.id.checkBox_crocodile);
        CheckBox c2 = (CheckBox) findViewById(R.id.checkBox_fish);
        String croc="CrCODILE";
        String fish ="FISH";
        if (c1.isChecked())
        {
            Toast.makeText(MainActivity.this,croc,Toast.LENGTH_SHORT).show();
        }
        if (c2.isChecked())
        {
            Toast.makeText(MainActivity.this,fish,Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(MainActivity.this,"NOTHING SELECTED",Toast.LENGTH_SHORT).show();
    }

    public void radioButtonClick(View v)
    {

        RadioGroup rg = (RadioGroup) findViewById(R.id.rg1);
        RadioButton rb1 = (RadioButton)findViewById(R.id.radioButton);
        RadioButton rb2 = (RadioButton)findViewById(R.id.radioButton2);

        String radioId= Integer.toString(rg.getCheckedRadioButtonId());
/*
        if (radioId.equalsIgnoreCase("radioButton"))
        {
            Toast.makeText(MainActivity.this, "MALE", Toast.LENGTH_SHORT).show();

        }
        else if (radioId.equalsIgnoreCase("radioButton2"))
        {
            Toast.makeText(MainActivity.this, "FE_MALE", Toast.LENGTH_SHORT).show();

        }
        */
        if (rb1.isChecked())
            Toast.makeText(MainActivity.this, "MALE", Toast.LENGTH_SHORT).show();
        else if (rb2.isChecked())
            Toast.makeText(MainActivity.this, "FE_MALE", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(MainActivity.this, "NOTHING SELECTED", Toast.LENGTH_SHORT).show();

    }

  /*  public void listenerForRatingBar()
    {

       t1= (TextView)findViewById(R.id.editText3);
        RatingBar r = (RatingBar)findViewById(R.id.ratingBar);

        r.setOnRatingBarChangeListener( new RatingBar.OnRatingBarChangeListener()
        {
            @Override
            public  void onRatingChanged(RatingBar ratingbar ,float rating ,boolean b)
            {
               // TextView t1 =
                t1.setText(String.valueOf(rating));
            }
        });
    }
*/
    public void onClickRatingBar(View v)
    {
        RatingBar r = (RatingBar)findViewById(R.id.ratingBar);
       // Toast.makeText(MainActivity.this,r.getNumStars(),Toast.LENGTH_SHORT).show();
        float f =r.getRating();
        int i = r.getNumStars();
        String s1 = Integer.toString(i);
        String s2 = Float.toString(f);
        Toast.makeText(MainActivity.this,s2,Toast.LENGTH_SHORT).show();

    }
public void onclckAlert(View v)
{
    //Button b1 = (Button) findViewById(R.id.button);
    AlertDialog.Builder al= new AlertDialog.Builder(this);
    al.setMessage("Hi alrt mesage ");

    AlertDialog alert = al.create();
  //  alert.setTitle("ALERT");
    alert.show();

}

}
