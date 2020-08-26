package com.example.chetan.readfromandwritetofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    public static EditText entertext ;
    public static TextView displayText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void read(View view)
    {
        displayText = (TextView)findViewById(R.id.textView);
        displayText.setText("");
        try {
            FileInputStream fis = openFileInput("suhag.text");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuffer strBff = new StringBuffer();
            String lines = new String();

            while ((lines= br.readLine() )!=null)
            {
            strBff.append(lines+"\n");
            // displayText.append(lines+"\n");
            }
            displayText.setText(strBff);
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void write(View view)
    {
        entertext = (EditText)findViewById(R.id.editText);

        String s1 = entertext.getText().toString();

        try {
            FileOutputStream fos = openFileOutput("suhag.text",MODE_PRIVATE);;
            fos.write(s1.getBytes());
            fos.close();
            Toast.makeText(getApplicationContext(),"SAVED YAA",Toast.LENGTH_SHORT).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        entertext.setText("");

    }
}
