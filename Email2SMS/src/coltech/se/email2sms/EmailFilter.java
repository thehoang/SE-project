package coltech.se.email2sms;

import java.util.ArrayList;

/**
 * Lọc các email để gứi sms
 * 
 * @author dangmh
 * @see
 */
public class EmailFilter 
{
	/**
	 * Danh sách tất cả các email
	 */
	private ArrayList<Email> allEmails;
	
	
	/**
	 * Hàm khởi tạo
	 */
	public EmailFilter ( ArrayList<Email> allEmails )
	{
		this.allEmails = allEmails;
	}
	
	public ArrayList<SMS> filter ()
	{
		ArrayList<SMS> allSms = new ArrayList<SMS>();
		
		// filter here ...
		
		return allSms;
	}
}
