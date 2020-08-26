package layout;


import android.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.chetan.workoutapp.R;


public class NestedFragment extends Fragment implements View.OnClickListener
{
    Button btnShowMessage;
    EditText et;
    String sOfEt ="";
    public NestedFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        if (savedInstanceState != null )
        {
          sOfEt = savedInstanceState.getString("s");
        }
        // Inflate the layout for this fragment
        View v  = inflater.inflate(R.layout.fragment_nested, container, false);
        btnShowMessage = (Button) v.findViewById(R.id.btnNsFrag);
        btnShowMessage.setOnClickListener(this);
        et = (EditText) v.findViewById(R.id.etOfNsFrag);
       // if (sOfEt != null )
            et.setText(sOfEt);

       // btnShowMessage = (Button) inflater.
      /*  btnShowMessage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                Toast.makeText(vw.getContext(),"MESSAGE FROM NS FRAG   HII",Toast.LENGTH_LONG).show();
            }
        });*/
       /* if (savedInstanceState != null )
        {
             sOfEt = savedInstanceState.getString("s");
            //et.setText(s);
        }*/

        return v;
    }

   /* @Override
    public void onStart()
    {
        super.onStart();
        View v = getView() ;
        btnShowMessage = (Button) v.findViewById(R.id.btnNsFrag);
        btnShowMessage.setOnClickListener(this);

       *//* btnShowMessage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View vw)
            {
                Toast.makeText(vw.getContext(),"MESSAGE FROM NS FRAG   HII",Toast.LENGTH_LONG).show();
            }
        });*//*
    }*/

    /*  public void showMessage(View v)
    {
        Toast.makeText(v.getContext(),"MESSAGE FROM NS FRAG   HII",Toast.LENGTH_LONG).show();
    }*/

    @Override
    public void onClick(View v)
    {
        Toast.makeText(v.getContext(),"MESSAGE FROM NS FRAG   HII",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        outState.putString("s",et.getText().toString());
    }
}
