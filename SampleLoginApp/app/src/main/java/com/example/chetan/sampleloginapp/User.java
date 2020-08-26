package com.example.chetan.sampleloginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class User extends AppCompatActivity {

    private static Button button_third;
    private static TextView welcome_note;

    private  static Button button_switch_image;
    private static ImageView imgView;
    private int current_image_index;
    int [] arrayOfimages = {R.mipmap.and,R.mipmap.ic_launcher} ;

    private static ListView list_view;
    private static String [] names = new String[] { "Chetan" ,"suma","savata","rani","Hema"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        //logOut();
      //  switchImage();
        listView();
        moveToThirdPage();
    }

    public void listView()
    {
        list_view = (ListView)findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.name_list,names);
        list_view.setAdapter(adapter);
        list_view.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                        String value =(String)list_view.getItemAtPosition(position);
                        Toast.makeText(User.this, "Values is "+ value+"PosITION IS " +position,Toast.LENGTH_LONG).show();

                    }
                }
        );
    }



    public void switchImage()
    {
        button_switch_image = (Button)findViewById(R.id.button_switc_image);
        imgView =(ImageView)findViewById(R.id.imageView);

        button_switch_image.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                        current_image_index ++;
                        current_image_index = current_image_index % arrayOfimages.length;
                        imgView.setImageResource(arrayOfimages[current_image_index]);
                    }
                }
        );
    }

    public void moveToThirdPage()
    {
        button_third = (Button)findViewById(R.id.button_switc_image);

        welcome_note = (TextView)findViewById(R.id.textView_welcome_note);
       // welcome_note.setText("Hi FOOL, trying to logout?, use back button at left bottom ");

        button_third.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                     //   welcome_note.setText("Hi FOOL, trying to logout?, use back button at left bottom ");

                     //   Toast.makeText(User.this,"U foOL,chet use back button at left bottom",Toast.LENGTH_SHORT).show();

                    //    Intent intent = new Intent("android.intent.action.MAIN");

                       Intent intent = new Intent("com.example.chetan.sampleloginapp.WebView");

                        startActivity(intent);
                    }
                }
        );
    }
/*
      public  void OnLogOutClick(View v)
    {
        welcome_note = (TextView)findViewById(R.id.textView_welcome_note);
        welcome_note.setText("Hi FOOL, trying to logout?, use back button at left bottom ");

       Toast.makeText(User.this,"LOGED OUT SUUCSFULLY",Toast.LENGTH_SHORT).show();

        Intent intent = new Intent("com.example.chetan.sampleloginapp.Login");

        startActivity(intent);

       Toast.makeText(Login.this, "COngratulations crrct usrname name & passrwd", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent("com.example.chetan.sampleloginapp.User");
        startActivity(intent);

    }
*/

}
