package com.example.chetan;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.chetan.layouttest.R;

public class WeightACtivity extends Activity
{
   ToggleButton tb ;
    TextView tvVicky ;
    Switch swtc;
    EditText etSwtc ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_activity);
        tb = (ToggleButton) findViewById(R.id.toggleButton);
        tvVicky = (TextView) findViewById(R.id.tvVicky);
        swtc = (Switch) findViewById(R.id.switch1);
        etSwtc = (EditText) findViewById(R.id.etSw);
    }

    public void toggle(View v)
    {
        if (tb.isChecked() == true )
        {
            tvVicky.setText("VIKRAM");
        }
        else if ( tb.isChecked() == false )
            tvVicky.setText("SHaSrty");
    }

    public void switchPuzzles(View v)
    {
        if (swtc.isChecked() == true )
        {
            Toast.makeText(this,"swutched ..is oNNN",Toast.LENGTH_SHORT).show();
            etSwtc.setEnabled(true);
            tvVicky.setText("swicthed on");
        }
        else if(swtc.isChecked() == false )
        {
            Toast.makeText(this,"swutched ..is OFFF",Toast.LENGTH_SHORT).show();
            etSwtc.setEnabled(false);
            tvVicky.setText("swicthed of");
        }



    }
}
