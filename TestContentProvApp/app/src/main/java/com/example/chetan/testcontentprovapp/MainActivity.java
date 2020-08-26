package com.example.chetan.testcontentprovapp;

import android.app.Activity;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    public static EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.editText);
    }

    public  void add(View v)
    {

    }

    public  void lis(View v)
    {

    }

    public void listContacts(View v)
    {

        Cursor c = getContentResolver().query(ContactsContract.Contacts.CONTENT_URI,null,null,null,null);

       // Uri = ContactsContract.Contacts.CONTENT_URI;

        if(c.getCount()>0)
        {
            c.moveToFirst();

            do {

                String name = c.getString(c.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
                Toast.makeText(MainActivity.this, "name = " + name, Toast.LENGTH_LONG).show();
              // String data = c.getString(0);
                //et.setText(data);
            }
            while (c.moveToNext());
        }else{
            Toast.makeText(MainActivity.this, "No contacts`", Toast.LENGTH_LONG).show();
        }

    }

}
