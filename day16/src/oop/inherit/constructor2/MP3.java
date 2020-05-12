package oop.inherit.constructor2;

public final class MP3 extends File{
	//추가되는 필드
	private int duration;
	
	public MP3(String name) {
		super(name);
//		super(name, 0L);
//		this(name, 0L, 0);
	}
	public MP3(String name, long filesize, int duration) {
		super(name, filesize);
//		super(name);
//		super.filesize = filesize;
		this.duration = duration;
	}
	
	@Override
	public void execute() {
		System.out.println("음악 재생 시작 : 총 "+this.duration+"초");
	}
}