package com.example.chetan.layouttest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.chetan.GridLayOutActivity;
import com.example.chetan.HybridLayOutActivity;
import com.example.chetan.LinearHorizontalActivity;
import com.example.chetan.LinearVerticalActivity;
import com.example.chetan.WeightACtivity;

public class MainActivity extends Activity
{
    CheckBox cbSmoke ,cbDrink;
    TextView tvSmoke , tvDrink ;
    RadioGroup rgSkinTone ;
    RadioButton rbFair ,rbWheat ,rbDark ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbSmoke = (CheckBox) findViewById(R.id.cbSmoking) ;
        cbDrink  = (CheckBox) findViewById(R.id.cbDrinking);
        tvSmoke = (TextView) findViewById(R.id.tvSMoking) ;
        tvDrink = (TextView) findViewById(R.id.tvDrinking) ;

        rgSkinTone = (RadioGroup) findViewById(R.id.rgSkinTon);

        rbFair = (RadioButton) findViewById(R.id.rbFairSkin);
        rbWheat = (RadioButton) findViewById(R.id.rbWheatishSkin);
        rbDark = (RadioButton) findViewById(R.id.rbDarkSkin);

    }

    public  void linearVertical(View v)
    {
        Intent inLV = new Intent(this, LinearVerticalActivity.class);
        startActivity(inLV);
    }

    public  void linearHorizonatl(View v)
    {
        Intent inLH = new Intent(this , LinearHorizontalActivity.class);
        startActivity(inLH);
    }

    public void gridLayOut(View v)
    {
        Intent inGrid = new Intent(this , GridLayOutActivity.class);
        startActivity(inGrid);
    }

    public void hybridLayOut(View v)
    {
        Intent inHybrid = new Intent(this , HybridLayOutActivity.class);
        startActivity(inHybrid);
    }

    public void weightActivity(View v)
    {
        Intent inWe = new Intent(this , WeightACtivity.class);
        startActivity(inWe);
    }

    public  void habits(View v)
    {
        int idInt = v.getId() ;
        switch ( idInt )
        {
            case R.id.cbSmoking :
                if (cbSmoke.isChecked() == true )
                tvSmoke.setText("Yes he smokes");
                else
                    tvSmoke.setText("No,He never smokes");
               Toast ts = Toast.makeText(this,"smoking option is under progress",Toast.LENGTH_SHORT);
                ts.setGravity(1,5,5);
                ts.show();
                break;

            case R.id.cbDrinking :
                if ( cbDrink.isChecked() == true )
                    tvDrink.setText("Yes he;s alchoholic");
                else
                    tvDrink.setText("no he's not alchoholic");
              Toast ts2 =  Toast.makeText(this,"DRINKINg option is under progress",Toast.LENGTH_SHORT);
                ts2.setGravity(0,1,1);
                ts2.show();

                break;
            default:
                tvSmoke.setText("------");
                tvDrink.setText("------");
        }
    }//habits () ends

    public void skinTone(View v)
    {
        int idInt = rgSkinTone.getCheckedRadioButtonId();
        switch (idInt)
        {
            case R.id.rbFairSkin :
                tvSmoke.setText("she's very beauifull gilr");
                Toast.makeText(this,"she's very beauifull gilr",Toast.LENGTH_SHORT).show();
                break;
            case  R.id.rbDarkSkin :
                tvSmoke.setText("she's very ugly looking gilr vyak vyak");
                Toast.makeText(this,"she's very ugly looking gilr vyak vyak",Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbWheatishSkin :
                tvSmoke.setText("she's averga looking gilr");
                Toast.makeText(this,"she's averga looking gilr hmmm",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void skinTone2(View v)
    {
        int idInt = v.getId();
        switch (idInt) {
            case R.id.rbFairSkin:
                if (rbFair.isChecked() == true) {
                    tvSmoke.setText("she's very beauifull gilr");
                    Toast.makeText(this, "she's very beauifull gilr", Toast.LENGTH_SHORT).show();
                } else {
                    tvSmoke.setText("she's not beauifull gilr");
                    Toast.makeText(this, "she's not a beauifull gilr", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.rbDarkSkin:
                if (rbDark.isChecked() == true) {
                    tvSmoke.setText("she's very ugly looking gilr vyak vyak");
                    Toast.makeText(this, "she's very ugly looking gilr vyak vyak", Toast.LENGTH_SHORT).show();
                } else {
                    tvSmoke.setText("she's not ugly looking gilr");
                    Toast.makeText(this, "she's not lkking gilr", Toast.LENGTH_SHORT).show();
                }

                break;
            case R.id.rbWheatishSkin:
                if (rbWheat.isChecked() == true) {
                    tvSmoke.setText("she's averga looking gilr");
                    Toast.makeText(this, "she's averga looking gilr hmmm", Toast.LENGTH_SHORT).show();
                } else
                {
                    tvSmoke.setText("she's not averga looking gilr");
                    Toast.makeText(this,"she's not a averga looking gilr hmmm",Toast.LENGTH_SHORT).show();
                }



                break;
        }
    }


}
