package org.esiea.navaratnam_nirosan_ramrami_lamya.myapp;


import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class internetpromo extends Activity{

    private WebView webView;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internetpromo);

    webView=(WebView)findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://lastminute.com");

    }

}
