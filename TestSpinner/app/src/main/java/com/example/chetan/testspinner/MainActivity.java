package com.example.chetan.testspinner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.chetan.DispMessageActivity;
import com.example.chetan.MessageActivity;

public class MainActivity extends Activity
{

    static Spinner spnItems;
    static TextView tvDisplySize;
    static EditText etMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spnItems = (Spinner) findViewById(R.id.spnrValues);
        tvDisplySize = (TextView) findViewById(R.id.tvDisplay);
        etMessage = (EditText) findViewById(R.id.etMessage);
     /*   spnItems.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                String spnItemStr = spnItems.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(),spnItemStr.toUpperCase(),Toast.LENGTH_SHORT).show();
            }
        });
        */

    }

    public void a2(View v)
    {
        Intent inA2 = new Intent(this , DispMessageActivity.class) ;
        startActivity(inA2);
    }
    public void pressMessage(View v)
    {
        String messageStr =  etMessage.getText().toString();
        String spinnerNameStr = spnItems.getSelectedItem().toString();
        String sizeStr = tvDisplySize.getText().toString();
       // Toast.makeText(this,sizeStr,Toast.LENGTH_SHORT).show();
      //  Toast.makeText(this,sizeStr.length()+" is textstr size",Toast.LENGTH_SHORT).show();
      //  int assInt = 70;
      //  if (saSize.length > 0)
          //  assInt = Integer.parseInt(saSize[2]);

       if (messageStr == null || messageStr.trim().length() == 0 )
           Toast.makeText(getApplicationContext(),"WHY DO YOU WANT TO SEE A BLANK MESSAGAE ON NEXT PAGE , NO USE..PLEASE ENTER SOMETEXT",Toast.LENGTH_LONG).show();
        else
       {
           Intent inMessageActivity = new Intent(getApplication(), MessageActivity.class);
           inMessageActivity.putExtra("MESSAGE",messageStr);
           inMessageActivity.putExtra("ToastMessage",spinnerNameStr);
           inMessageActivity.putExtra("size",sizeStr);
          // inMessageActivity.putExtra("i",assInt);
           inMessageActivity.putExtra(Intent.EXTRA_TEXT,"ANDROID + "+messageStr);
           startActivity(inMessageActivity);
       }

    }

    public void test(View v)
    {

        String nameOfItemStr = (String) spnItems.getSelectedItem();
        String commentStr ="";



        switch (nameOfItemStr)
        {
            case "Monika" :
                tvDisplySize.setText("56-32-40");
                 commentStr = Compliment.getComment(nameOfItemStr,"56-32-40");
                break;

            case "Vidya" :
                tvDisplySize.setText("42-30-39");
                commentStr = Compliment.getComment(nameOfItemStr,"42-30-39");
                break;

            case "Soujanya" :
                tvDisplySize.setText("28-24-46");
                commentStr = Compliment.getComment(nameOfItemStr,"28-24-46");
                break;

            case "Dhanashree" :
                tvDisplySize.setText("39-36-52");
                commentStr = Compliment.getComment(nameOfItemStr,"39-36-52");
                break;

            case "Sneha" :
                tvDisplySize.setText("24-18-26");
                commentStr = Compliment.getComment(nameOfItemStr,"24-18-26");
                break;

            case "Lolita" :
                tvDisplySize.setText("44-35-55");
                commentStr = Compliment.getComment(nameOfItemStr,"44-35-55");
                break;

            case "Pushpa" :
                tvDisplySize.setText("40-32-40");
                commentStr = Compliment.getComment(nameOfItemStr,"40-32-40");
                break;

            case "Divya" :
                tvDisplySize.setText("56-38-52");
                commentStr = Compliment.getComment(nameOfItemStr,"56-38-52");
                break;

            case "Anjali" :
                tvDisplySize.setText("26-42-40");
                commentStr = Compliment.getComment(nameOfItemStr,"26-42-40");
                break;

            case "Arohi" :
                tvDisplySize.setText("36-24-36");
                commentStr = Compliment.getComment(nameOfItemStr,"36-24-36");
                break;

            case "Roshni" :
                tvDisplySize.setText("26-34-60");
                commentStr = Compliment.getComment(nameOfItemStr,"26-34-60");
                break;

            case "Drushti" :
                tvDisplySize.setText("26-34-24");
                commentStr = Compliment.getComment(nameOfItemStr,"26-34-24");
                break;

            case "Rashmi" :
                tvDisplySize.setText("22-22-20");
                commentStr = Compliment .getComment(nameOfItemStr,"22-22-20");
                break;
            default:
                Toast.makeText(this,"PLEASE SELECT ANY 1 ITEM'S NAME TO KNOW HER SIZE",Toast.LENGTH_LONG).show();

        }
        if (commentStr.length() > 0)
        {
            Toast ts = Toast.makeText(this,commentStr,Toast.LENGTH_LONG);
            ts.show();
        }


    }
}
