package com.example.cnpm;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class About extends Activity {
	private Button nutabout,caidat;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity);
		nutabout = (Button) findViewById(R.id.btabout);
		caidat = (Button) findViewById(R.id.btcaidat);
		nutabout.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(About.this, About2.class);
				startActivity(myIntent);
				finish();
				
			}

		});
	}
}