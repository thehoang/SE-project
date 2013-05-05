package com.example.cnpm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class About2 extends Activity {

	private Button  troLai;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		troLai = (Button) findViewById(R.id.btok);
		troLai.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Intent myIntent = new Intent(About2.this, About.class);
				startActivity(myIntent);
				finish();
			}
		});
				 
	}
}
