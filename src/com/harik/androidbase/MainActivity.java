package com.harik.androidbase;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends Activity {
WebView wb;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		wb=(WebView) findViewById(R.id.webView1);
	
		wb.loadUrl("http://www.eurosport.fr/");
	wb.getSettings().setJavaScriptEnabled(true);
	wb.getSettings().setDomStorageEnabled(true);
	}
}
