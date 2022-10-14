package com.webnmobapps.yamaha.utility;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.webnmobapps.yamaha.R;

public class WebviewActivity extends AppCompatActivity {


    WebView web;
    ProgressDialog prDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        web = findViewById(R.id.webview);

        String url = getIntent().getStringExtra("url");
        Log.e("url",url+"ok");



      /*  web.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                //Also you can show the progress percentage using integer value 'progress'

                    prDialog = ProgressDialog.show(WebviewActivity.this, null, "loading, please wait...");


                if (progress == 100&&prDialog.isShowing()) {
                    prDialog.dismiss();
                }
            }
        });*/

        // Webview....

        web.setWebViewClient(new WebViewClient());
        web.getSettings().setLoadsImagesAutomatically(true);
        web.getSettings().setJavaScriptEnabled(true);
        //web.getSettings().setBuiltInZoomControls(true);
        //   web.getSettings().setSupportZoom(true);
        web.getSettings().setLoadWithOverviewMode(true);
        web.getSettings().setUseWideViewPort(true);
        web.getSettings().setAllowContentAccess(true);
        web.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        web.loadUrl(url);
        web.setWebViewClient(new WebViewClient());


    }

   /* private class MyWebViewClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            prDialog = new ProgressDialog(WebviewActivity.this);
            prDialog.setMessage("Please wait...");
            prDialog.show();
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            if (prDialog != null) {
                prDialog.dismiss();
            }
        }
    }*/
}