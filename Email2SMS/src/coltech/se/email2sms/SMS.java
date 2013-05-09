package coltech.se.email2sms;

import java.util.ArrayList;

/**
 * SMS
 * 
 * @author dangmh
 * @see
 */
public class SMS 
{
	/**
	 * Danh sách các số điện thoại sẽ nhận sms
	 */
	private ArrayList<String> phoneNumbers;
	
	/**
	 * Nội dung tin nhắn
	 */
	private String content;
	
	
	/** 
	 * Hàm khởi tạo
	 * 
	 * @param phoneNumbersDanh sách các số điện thoại sẽ nhận sms
	 * @param content Nội dung tin nhắn
	 */
	public SMS (ArrayList<String> phoneNumbers, String content)
	{
		this.phoneNumbers = phoneNumbers;
		this.content = content;
	}
	
	/**
	 * Hàm khởi tạo
	 * 
	 * @param phoneNumber số điện thoại sẽ nhận sms
	 * @param content Nội dung tin nhắn
	 */
	public SMS ( String phoneNumber, String content )
	{
		this.phoneNumbers = new ArrayList<String>();
		this.phoneNumbers.add(phoneNumber);

		this.content = content;
	}
}
