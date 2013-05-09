package coltech.se.email2sms;

import java.util.ArrayList;

/**
 * Gửi nội dung sms tới các số điện thoại
 * 
 * @author dangmh
 * @see
 */
public class SMSSender 
{
	/**
	 * Danh sách tất cả các sms
	 */
	private ArrayList<SMS> allSMS;
	
	
	/**
	 * Hàm khởi tạo
	 */
	public SMSSender ( ArrayList<SMS> allSMS )
	{
		this.allSMS = allSMS;
	}
	
	/**
	 * Gửi sms tới các số điện thoại
	 * 
	 * @return số sms đã gửi
	 */
	public int send ()
	{
		// send sms here...
		return 0;
	}
}
