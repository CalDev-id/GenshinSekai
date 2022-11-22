package com.example.gensinsekai

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class mapgenshin : AppCompatActivity() {

    private lateinit var webView: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.genshinmap)

        webView = findViewById(R.id.interactivemap)
        webView.loadUrl("https://mapgenie.io/genshin-impact/maps/teyvat")

        webView.settings.javaScriptEnabled = true
    }
}