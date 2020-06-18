package home.beans.dto;

public class ReplyDto {
	private int reply_no, reply_origin;
	private String reply_writer, reply_content, reply_date;

	public ReplyDto() {
		super();
	}

	public int getReply_no() {
		return reply_no;
	}

	public void setReply_no(int reply_no) {
		this.reply_no = reply_no;
	}

	public int getReply_origin() {
		return reply_origin;
	}

	public void setReply_origin(int reply_origin) {
		this.reply_origin = reply_origin;
	}

	public String getReply_writer() {
		return reply_writer;
	}

	public void setReply_writer(String reply_writer) {
		this.reply_writer = reply_writer;
	}

	public String getReply_content() {
		return reply_content;
	}

	public void setReply_content(String reply_content) {
		this.reply_content = reply_content;
	}

	public String getReply_date() {
		return reply_date;
	}

	public void setReply_date(String reply_date) {
		this.reply_date = reply_date;
	}

	
	
}
