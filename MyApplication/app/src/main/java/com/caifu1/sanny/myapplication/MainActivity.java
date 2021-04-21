package com.caifu1.sanny.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.webkit.WebView;

import android.os.Bundle;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    WebView WBview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WBview = findViewById(R.id.webView);
        WBview.getSettings().setJavaScriptEnabled(true);

        WBview.setWebViewClient(new WebViewClient());

        WBview.loadUrl("http://139.162.74.68:8080");

//        WBview.setWebViewClient(new WebViewClient() {
//            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
//
//                WBview.loadUrl("http://172.105.238.165:8080");
//                Toast toast = Toast.makeText(getApplicationContext(),
//                        "没有网络连接`",
//                        Toast.LENGTH_LONG);
//                toast.show();
//                toast.setGravity(Gravity.BOTTOM, 0, 0);
//
//            }
//        });
    }
    public void onBackPressed() {
        if (WBview.canGoBack()) {
            WBview.goBack();
        } else {
            super.onBackPressed();
        }
    }
//
}
