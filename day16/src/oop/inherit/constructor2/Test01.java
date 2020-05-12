package oop.inherit.constructor2;

public class Test01 {
	public static void main(String[] args) {
//		객체 생성
		MP3 mp3 = new MP3("song.mp3", 125L, 180);
		AVI avi = new AVI("test.avi", 100L, 1.5);
		PPT ppt = new PPT("발표.ppt", 1200L, 50);
		
		mp3.execute();
		avi.execute();
		ppt.execute();
	}
}