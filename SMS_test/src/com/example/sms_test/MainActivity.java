package com.example.sms_test;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		//Send message
		Intent smsIntent = new Intent(Intent.ACTION_SENDTO,
				Uri.parse("sms:0123456789"));
		smsIntent.putExtra("sms_body", "SMS test!");
		startActivity(smsIntent);
		return true;
	}

}
