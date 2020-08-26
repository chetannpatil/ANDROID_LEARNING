package com.example.chetan.listviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by chetan on 8/10/16.
 */
public class ActorAdapter extends ArrayAdapter
{

    Context ctx;
    List<Actor> actors = new ArrayList<>();


    //Actor act;
  /*  public ActorAdapter(Context context, int resource) {
        super(context, resource);
    }
   */
    public ActorAdapter (Context ctx, int res, List<Actor> obj)
    {
        super(ctx,res,obj);
        this.actors=obj;
        this.ctx = ctx;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Actor actor = actors.get(position);

        ctx.getSystemService(getContext().LAYOUT_INFLATER_SERVICE);

       /// View v = LayoutInflater.i
        LayoutInflater inf  =(LayoutInflater) ctx.getSystemService(ctx.LAYOUT_INFLATER_SERVICE);
       View v = inf.inflate(R.layout.actor,null);     //parent,false);


        TextView tvName = (TextView) v.findViewById(R.id.tvActor);
       TextView tvAge = (TextView) v.findViewById(R.id.tvAge);

        tvName.setText(actor.getName());

        return v;

    }
}
