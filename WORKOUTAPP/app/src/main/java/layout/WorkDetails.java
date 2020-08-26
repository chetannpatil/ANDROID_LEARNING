package layout;


import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.example.chetan.workoutapp.R;
import com.example.chetan.workoutapp.WorkOut;


public class WorkDetails extends Fragment
{
    private long workId;
    TextView tvTitle, tvDesc;
   // EditText etWDetails;


    @Override
    public void onCreate(Bundle bd)
    {
        super.onCreate(bd);


    //    Toast.makeText(getContext(), "in WrkDetlsFrag onstart", Toast.LENGTH_SHORT).show();
        /*if ( bd != null )
        {
            workId = bd.getLong("wId");
        }*/
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle bd)
    {
        View v =  inflater.inflate(R.layout.fragment_work_details, container, false);
               // etWDetails = (EditText) v.findViewById(R.id.etOfNsFrag);//.f
        ///getFragmentManager().findFragmentById(R.id.fragmentWork);
        // Inflate the layout for this fragment
        if ( bd != null )
        {
            workId = bd.getLong("wId");
           /* if (etWDetails != null )
            {
                etWDetails.setText(bd.getString("s"));
            }*/

        }
       else
        {
            FragmentTransaction ft = getChildFragmentManager().beginTransaction();
            NestedFragment nsFrag = new NestedFragment();
            ft.replace(R.id.nestedFragFramLayout,nsFrag);
            ft.addToBackStack(null);
            ft.commit();
       }


        return v;


    }

    public void setWorkId(long workId) {
        this.workId = workId;
    }

    public long getWorkId()
    {
        return this.workId;
    }

    @Override
    public void onStart()
    {
        super.onStart();

        View v = getView();
       // Toast.makeText(v.getContext(), "in WrkDetlsFrag onstart", Toast.LENGTH_SHORT).show();
        if (v != null)
        {
            tvTitle = (TextView) v.findViewById(R.id.tvTitle);
            tvDesc = (TextView) v.findViewById(R.id.tvDesc);
           // Toast.makeText(v.getContext(), "in WrkDetlsFrag onstart-> v!=null wrk id = "+workId, Toast.LENGTH_SHORT).show();
            //create work poj 's obj
            //WorkOut wObj = new WorkOut("Sindhu","36-24-36");

            WorkOut workOutObj = WorkOut.modelsWorkArray[(int) workId];

            tvTitle.setText(workOutObj.getNameStr());
            tvDesc.setText(workOutObj.getDescriptionStr());
            //Toast.makeText(v.getContext(), "in WrkDetlsFrag onstart -> name= "+workOutObj.getNameStr(), Toast.LENGTH_SHORT).show();
            //Toast.makeText(v.getContext(), "in WrkDetlsFrag onstart -> descr= "+workOutObj.getDescriptionStr(), Toast.LENGTH_SHORT).show();
            // tvDesc.setText(wObj.getDescriptionStr());
            // tvTitle.setText(wObj.getNameStr());
            //

        }
    }

 /*   @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        View v = getView();
        if (v != null)
        {
            tvTitle = (TextView) v.findViewById(R.id.tvTitle);
            tvDesc = (TextView) v.findViewById(R.id.tvDesc);

            //create work poj 's obj
            //WorkOut wObj = new WorkOut("Sindhu","36-24-36");

            WorkOut workOutObj = WorkOut.modelsWorkArray[(int) workId];

            tvTitle.setText(workOutObj.getNameStr());
            tvDesc.setText(workOutObj.getDescriptionStr());

        }
    }
    */

//    @Override
//    public void onResume()
//    {
//        super.onResume();
//      //TextView tv = new TextView(v.getapp)
//
//        View v = getView();
//
//       // View v2 = new View(this,new TextView());
//        if (v != null)
//        {
//            tvTitle = (TextView) v.findViewById(R.id.tvTitle);
//            tvDesc = (TextView) v.findViewById(R.id.tvDesc);
//
//            //create work poj 's obj
//            //WorkOut wObj = new WorkOut("Sindhu","36-24-36");
//
//            WorkOut workOutObj = WorkOut.modelsWorkArray[(int) workId];
//
//            tvTitle.setText(workOutObj.getNameStr());
//            tvDesc.setText(workOutObj.getDescriptionStr());
//
//          //  FragmentTransaction ft = getFragmentManager().beginTransaction();
//            FragmentTransaction ft = getChildFragmentManager().beginTransaction();
//            NestedFragment nsFrag = new NestedFragment();
//           // nsFrag.sOfEt =
//            ft.replace(R.id.nestedFragFramLayout,nsFrag);
//
//            ft.addToBackStack(null);
//            ft.commit();
//        }
//    }

    /*@Override
    public void onSaveInstanceState(Bundle b)
    {
        b.putLong("wId",workId);
        String s ="";
        if (etWDetails != null)
        {
          s =  etWDetails.getText().toString();

        }
        b.putString("s",s);

    }*/

   /* public void show(View v)
    {
        Toast.makeText(v.getContext(),"MESSGAE fROM FL ",Toast.LENGTH_LONG).show();
    }*/

}