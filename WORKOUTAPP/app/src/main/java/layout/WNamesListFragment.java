package layout;
import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.chetan.workoutapp.WInterface;
import com.example.chetan.workoutapp.WorkOut;


public class WNamesListFragment extends ListFragment
{

    // has a
   // private InnerWorkListFrag wlInterface ;

    private WInterface wlInterface ;
    private  String [] namesOfBabes = new String[WorkOut.modelsWorkArray.length];
   // WorkDetails fragWork ;


    //inner interface
   public static interface InnerWorkListFrag
    {
        void clickItem(long id);
    }
    public WNamesListFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inf, ViewGroup container,
                             Bundle b)
    {
        // Inflate the layout for this fragment
       // ListView lv = getListView();
        Toast.makeText(inf.getContext(),"in WlistFrag onCreateView",Toast.LENGTH_SHORT).show();
        int i = 0;
        for (WorkOut wobj: WorkOut.modelsWorkArray)
        {
            namesOfBabes[i++] = wobj.getNameStr();
        }
        ArrayAdapter<String>  nameArrayAdapter = new ArrayAdapter<String>(inf.getContext(), android.support.v7.appcompat.R.layout.support_simple_spinner_dropdown_item,namesOfBabes);

       // lv.setAdapter(nameArrayAdapter);
        setListAdapter(nameArrayAdapter);
       // return inflater.inflate(R.layout.fragment_wnames_list, container, false);
        return super.onCreateView(inf, container,b);
    }

  /*  @Override
    public void onStart()
    {
        super.onStart();
        int i = 0;
        for (WorkOut wobj: WorkOut.modelsWorkArray)
        {
            namesOfBabes[i++] = wobj.getNameStr();
        }
        //View v = getView() ;
        ListView lv = getListView() ;
        ArrayAdapter<String> nameAA = new ArrayAdapter<String>(lv.getContext(), android.support.v7.appcompat.R.layout.support_simple_spinner_dropdown_item,namesOfBabes);

        setListAdapter(nameAA);
       // lv.setAdapter(nameAA);


    }
    */

    @Override
    public void onListItemClick(ListView l, View v, int position, long id)
    {
        super.onListItemClick(l, v, position, id);
      //  Toast.makeText(l.getContext(),"in WlistFrag onListItemClick ",Toast.LENGTH_SHORT).show();
       // WorkDetails workDetailsObj = new WorkDetails();

       // fragWork = (WorkDetails)getFragmentManager().findFragmentById(R.id.fragmentWork);
       // workDetailsObj.setWorkId(position);
       // fragWork.setWorkId(position);

      /*  Intent inMA = new Intent(l.getContext(), MainActivity.class);
        inMA.putExtra("intVar",position);
        startActivity(inMA);
        */

        if ( wlInterface != null )
        {
          //  Toast.makeText(l.getContext(),"in WlistFrag onListItemClick wintrf != null ",Toast.LENGTH_SHORT).show();
            //wlInterface.clickItem(position);
           // wlInterface.onItemClick(id);
          //  Toast.makeText(l.getContext(),"WListFrag -> calling onItemClick() of MA with pos= "+position,Toast.LENGTH_SHORT).show();
            wlInterface.onItemClick(position);
        }

    }

   @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);
        //this.wlInterface = (InnerWorkListFrag) context;
        this.wlInterface = (WInterface) context ;
    }


/*    @Override
    public void onAttachFragment(Fragment childFragment)
    {
        super.onAttachFragment(childFragment);
        this.wlInterface = (InnerWorkListFrag) childFragment;
       // Toast.makeText(l.getContext(),"in WlistFrag onListItemClick ",Toast.LENGTH_SHORT).show();

    }

*/

  /*  @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);

       // this.wlInterface = (InnerWorkListFrag)activity;
        this.wlInterface = (WInterface) activity ;
    }
    */


}
