package com.example.x5sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.x5sample.components.X5WebView;

public class MainActivity extends AppCompatActivity {

    private static final String url = "https://www.baidu.com";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        X5WebView x5WebView = findViewById(R.id.webview);
        x5WebView.loadUrl(url);
    }
}
