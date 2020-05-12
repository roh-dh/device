package oop.inherit6;

public class GalaxyS10 extends Galaxy{
	
	public void bixby() {
		System.out.println("GalaxyS10의 음성인식 기능을 실행합니다.");
	}
	
//	public void call() {
//		System.out.println("GalaxyS10의 전화기능을 실행합니다.");
//	}
	
	@Override //annotation(hashtag) ->역할(ROLE)부여
	public void call() {
//		super.call(); //원래 있던 SMS를 실행하라.
		System.out.println("갤럭시 s10의 전화 기능을 실행합니다.");
	}
	
	
	@Override //직접입력하면 안됨??
	public void sms() {
		System.out.println("GalaxyS10의 문자기능을 실행합니다.");
	}

	
}
