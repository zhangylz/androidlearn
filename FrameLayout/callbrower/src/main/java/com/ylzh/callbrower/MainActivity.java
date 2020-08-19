package com.ylzh.callbrower;

import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        webView = (WebView)findViewById(R.id.webView);
//        WebSettings webSettings = webView.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//        //所需加载的网址
//
//        webView.loadUrl("http://www.baidu.com");
//
//        webView.setWebViewClient(new WebViewClient() {
//            // 复写shouldOverrideUrlLoading()方法，使得打开网页时不调用系统浏览器， 而是在本WebView中显示
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//                // view.loadUrl(url);
//                return super.shouldOverrideUrlLoading(view, url);
//            }
//
//            @Override
//            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
//                handler.proceed();
//            }
//
//            @Override
//            public void onReceivedError(WebView view, int errorCode,
//                                        String description, String failingUrl) {
//                // TODO Auto-generated method stub
//                super.onReceivedError(view, errorCode, description, failingUrl);
//            }
//        });
    }

    // 当每一个页面加载出来时的动作 可以获取当前页面的信息 如URL 如标题等});

//监控后退键，确保可后退至上一页面@Override
//
//    public boolean onKeyDown(int keyCode, KeyEvent event){
//        if ((keyCode == KeyEvent.KEYCODE_BACK))
//            if (webView.canGoBack()) {
//                webView.goBack();
//                return true;
//            }
//        return super.onKeyDown(keyCode,event);
//    }
//    //释放资源，防止溢出@Override
//    protected void onDestroy() {
//        super.onDestroy();
//        //释放资源
//        webView.destroy();
//        webView= null;
//    }
}
