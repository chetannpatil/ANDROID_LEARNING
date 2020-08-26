package com.example.chetan.uttara;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;


public class BrandsFragment extends Fragment
{
TextView tv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment

        Toast.makeText(inflater.getContext(),"BF's oncreteview()",Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.fragment_brands, container, false);


       // return super.onCreateView(inflater,container,savedInstanceState);
    }

    @Override
    public void onStart()
    {
        super.onStart();
        Toast.makeText(getView().getContext(),"BF's onSTART()",Toast.LENGTH_SHORT).show();
        tv = (TextView)getView().findViewById(R.id.tvOfLayOutOfBf);
        String []sa = getResources().getStringArray(R.array.buySA);
     /*   ArrayAdapter<String> ada =
                new ArrayAdapter<String>(getView().getContext(),R.layout.support_simple_spinner_dropdown_item,sa);*/
       tv.setText(sa.toString().toUpperCase());
        //getListView().setAdapter(ada);
      // setListAdapter(ada);

    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        //Toast.makeText(getView().getContext(),"BF's onDestroy()",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        Toast.makeText(getView().getContext(),"BF's onDestroyView()",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);
        Toast.makeText(context.getApplicationContext(),"BF's onSAttach)",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDetach()
    {
        super.onDetach();
       // Toast.makeText(getView().getContext(),"BF's onDetach()",Toast.LENGTH_SHORT).show();
    }
}
