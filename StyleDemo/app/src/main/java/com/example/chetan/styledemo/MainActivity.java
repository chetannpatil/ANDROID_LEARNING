package com.example.chetan.styledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public  static TextView textName;
    public static EditText editing;
    public static  String [] arrayOfNames={"priya","sandya","smitha","bhavya"};
    public static int i =0;
    public static int toggle= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeTextView(View view)
    {

        textName = (TextView)findViewById(R.id.textView);
       if(i<arrayOfNames.length)
         {
            textName.setText(arrayOfNames[i]);
            Toast.makeText(this,i+"th GF name",Toast.LENGTH_SHORT).show();
            i++;
        }
            else {
            i = 0;
            textName.setText("all they  are my x GFs, wnna c again clickon");

        }
    }

    public void changeEditetext(View view)
    {

     editing = (EditText)findViewById(R.id.editText);
        if (toggle ==0) {
            editing.setText("what u have entered is clered,click again to clean textbox ");
        toggle=1;
        }else {
            Toast.makeText(this,"NETER UR TEXT NOW",Toast.LENGTH_SHORT).show();
            editing.setText("");
            toggle=0;
        }
    }
}
