package oop.inherit6;


//추상적인 클래스
public class Phone {

	protected String number;

	
	public void call() {
		System.out.println("??? 휴대폰의 전화걸기 기능을 사용합니다.");
	}
	
	public void output() {
		System.out.println("번호 : "+number);
	}
}
