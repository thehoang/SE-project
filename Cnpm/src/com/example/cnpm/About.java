package com.example.cnpm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

//Class About thuc hien hien thi man hinh thong tin san pham
public class About extends Activity {

	private Button troLai;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		
		troLai = (Button) findViewById(R.id.btOK);
		
		troLai.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent myIntent = new Intent(About.this, Main.class);
				startActivity(myIntent);
				finish();
			}
		});

	}
}