package com.example.chetan.sampleloginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import android.widget.EditText;
import android.widget.TextView;

public class WebView extends AppCompatActivity {

    private static Button button_open_url;
    private static EditText text_url;
    private static android.webkit.WebView browser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        openUrl();
    }

    public void openUrl()
    {
        button_open_url = (Button)findViewById(R.id.button_open_url);
        text_url = (EditText) findViewById(R.id.editText_url);
        browser = (android.webkit.WebView)findViewById(R.id.webView_browser);

        button_open_url.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                      String url= text_url.getText().toString();
                        browser.getSettings().setLoadsImagesAutomatically(true);
                        browser.getSettings().setJavaScriptEnabled(true);
                        browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                        browser.loadUrl(url);
                    }
                }
        );
    }
}
