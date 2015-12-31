package org.esiea.navaratnam_nirosan_ramrami_lamya.myapp;


import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class internethelpx extends Activity{

    private WebView webView;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internethelpx);

        webView=(WebView)findViewById(R.id.webView2);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.helpx.net/");

    }
}
