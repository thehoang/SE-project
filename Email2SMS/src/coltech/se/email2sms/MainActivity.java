package coltech.se.email2sms;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// đọc tất cả các email
		EmailReader reader = new EmailReader();
		ArrayList<Email> allEmails = reader.getAll();
		
		// lọc lấy những email có tiêu đề thỏa mãn để gửi sms
		EmailFilter filter = new EmailFilter(allEmails);
		ArrayList<SMS> allSms = filter.filter();
		
		// gửi sms
		SMSSender sender = new SMSSender(allSms);
		int result = sender.send();
		
		// hiện thị kết quả
		TextView tv = (TextView) findViewById(R.id.tvResult);
		tv.setText("Số SMS đã gửi: " + result);
	}
	
}
