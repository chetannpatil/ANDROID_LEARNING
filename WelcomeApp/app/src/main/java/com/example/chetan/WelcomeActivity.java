package com.example.chetan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;



public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_welcome);

        //recvg inttent with infrmation

        Log.d("in onCrete() of welcmeA","in onCrete methd of welcmeA");
        String s2;
        Intent in = getIntent();
        s2=in.getStringExtra(Intent.EXTRA_TEXT);
        s2=in.getStringExtra("U_NAME");
        //String s3= String.format(s2,"%s" );
        Toast.makeText(WelcomeActivity.this,"CONGRATULATIONS "+s2,Toast.LENGTH_LONG).show();
        TextView tv = new TextView(this);
        tv.setText(s2);

        setContentView(tv);
    /*
        TextView tv = (TextView) findViewById(R.id.tvName);
        tv.setText("Hi "+s2);

        int ranNum= 10;
        ranNum = (int)(Math.random()*ranNum);
        TextView tv_Quote = (TextView)findViewById(R.id.tvQuote);
        TextView tv_Quote_by =(TextView)findViewById(R.id.tvQuoteBy);
        switch (ranNum) {
            case 0:
                tv_Quote.setText("Love your job,Not your company. ");
                tv_Quote_by.setText("->Abdul Kalam");
                break;
            case 1:
                tv_Quote.setText("Never read other's quotes,Be yourself.");
                tv_Quote_by.setText("->CHETAN PATIL");
                break;
            case 2:
                tv_Quote.setText("Knoweledge is Power.");
                tv_Quote_by.setText("->Educated");
                break;
            case 3:
                tv_Quote.setText("There is nothing worser than attending own GF's wedding.");
                tv_Quote_by.setText("->Disappointed boy");
                break;
            case 4:
                tv_Quote.setText("Be happy for no reason,You will be happy for ever.");
                tv_Quote_by.setText("->Vikram Shastry");
                break;
            case 5:
                tv_Quote.setText("Never regret for any wrong decesion taken by you in life even if you are solely resposible for it.");
                tv_Quote_by.setText("->An Optimist ");
                break;
            case 6:
                tv_Quote.setText("Helping hands are better than praying lips.");
                tv_Quote_by.setText("->Anonymous");
                break;
            case 7:
                tv_Quote.setText("Never leave a true relationship for small reasons,Nobody is perfect,Affection is greater than perfection.");
                tv_Quote_by.setText("->Anonymous");
                break;
            case 8:
                tv_Quote.setText("The person reading this quote will die in a weekdays.");
                tv_Quote_by.setText("->Anonymous");
                break;
            case 9:
                tv_Quote.setText("Do you know ,why are you looking for other's quote?.Beacuse you are hopelessfellow & you dont have any work.");
                tv_Quote_by.setText("->A hard worker");
                break;
            default:
                tv_Quote.setText("Greate God Grant Me Twice Two Not Be Four.");
                tv_Quote_by.setText("->Anonymous");
                break;
        }

*/
    }
}
