package oop.inherit6;

public class GalaxyNote10 extends Galaxy{
	public void memo() {
		System.out.println("GalaxyNote10의 메모 기능을 실행합니다.");
	}
	
	@Override
	public void call() {
		System.out.println("갤럭시 노트10의 전화 기능을 실행합니다.");
		
//		super.call();
	}
	@Override
	public void sms() {
		System.out.println("갤럭시 노트10의 문자 기능을 실행합니다.");
//		super.sms();
	}
}
