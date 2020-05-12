
package oop.inherit.constructor2;

public class File {
	//멤버 필드
	protected String filename;
	protected long filesize;
	
	//생성자..파일명(필수), 파일크기(선택)
	public File(String filename) {
		this(filename, 0L);
//		this.filename = filename;
//		this.filesize = 0L;
	}
	public File(String filename, long filesize) {
		this.filename = filename;
		this.filesize = filesize;
	}
	
//	공용 메소드 : 메소드는 만들어야 하는데 내용이 없다...
	public void execute() {
		System.out.println("아아아");
	}
}