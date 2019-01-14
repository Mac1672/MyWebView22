package com.anurak.mywebview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewClient;
public class MainActivity extends AppCompatActivity {
    WebView mvebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView mwebview = (WebView)findViewById(R.id.webview);
        mwebview.getSettings().setJavaScriptEnabled(true);
        mvebview.loadUrl("https://www.lpru.ac.th");
    }
    private class webviewClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view. loadUrl(url);
            return true;

        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && mvebview.canGoBack()) {
            mvebview.goBack();
            return  true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
