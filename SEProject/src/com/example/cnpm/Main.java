package com.example.cnpm;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {
	private Button thongTin, caiDat;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity);
		thongTin = (Button) findViewById(R.id.btAbout);
		caiDat = (Button) findViewById(R.id.btcaidat);
		thongTin.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent myIntent = new Intent(Main.this, About.class);
				startActivity(myIntent);
				finish();

			}

		});
	}
}