package oop.inherit2;

public class Test01 {
	public static void main(String[] args) {
//	하위 클래스(Galaxy, IPhone, Xiaomi)들의 객체를 생성 후 기능 사용
//	- 그 때 과연 직접 다 만든것과 구조가 같은가?	
		
	Galaxy a = new Galaxy();
	a.version ="S20";
	a.number = "010-1212-3434";
	a.call();
	a.camera();
	a.sms();
	
		
	IPhone b = new IPhone();
	b.version = "XS";
	b.number = "010-3434-5656";
	b.call();
	b.camera();
	b.sms();
	
	
	}
}
