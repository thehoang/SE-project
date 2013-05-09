package coltech.se.email2sms;

/**
 * Email class
 * 
 * @author dangmh
 * @see http://github.com
 */
public class Email 
{
	/**
	 * tiêu đề email
	 */
	private String subject;
	
	/**
	 * Nội dung email
	 */
	private String content;
	
	
	/**
	 * Hàm khởi tạo
	 * 
	 * @param subject tiêu đề thư
	 * @param content nội dung thư
	 */
	public Email ( String subject, String content )
	{
		this.subject = subject;
		this.content = content;
	}

	/**
	 * Lấy tiêu đề thư
	 * 
	 * @return tiêu đề thư
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * Thiết lập tiêu đề thư
	 * 
	 * @param subject tiêu đề
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * Lấy nội dung thư
	 * 
	 * @param subject nội dung thư
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Thiết lập nội dung thư
	 * 
	 * @param content nội dung
	 */
	public void setContent(String content) {
		this.content = content;
	}
}
