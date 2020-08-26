package com.example.chetan.fragmenttest;


import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class Fragment1 extends Fragment
{

    EditText etName;
    Button btn;
    TextView tvName;

    public Fragment1() {
        Log.d("fragtest","in no-arg constr of Fragment1");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("fragtest","in no-arg constr of Fragment1");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("fragtest","in onCreateView() of Fragment1");
        View view = inflater.inflate(R.layout.fragment_fragment1, container, false);
        etName = (EditText) view.findViewById(R.id.etName);
        tvName = (TextView) view.findViewById(R.id.tvName);

        btn = (Button) view.findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener()
        {
                                   @Override
                                   public void onClick(View view)
                                   {
                                       tvName.setText(etName.getText().toString());
                                   }

        }
        );
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("fragtest","in onResume() of Fragment1");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("fragtest","in onPause() of Fragment1");
    }

}
