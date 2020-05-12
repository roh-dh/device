package oop.inherit.abstract2;

public class IPhone11 extends Phone{

	@Override
	public void call() {
		System.out.println("아이폰11의 전화 기능 사용!");
	}

	@Override
	public void sms() {
		System.out.println("아이폰11의 문자 기능 사용!");
	}

	@Override
	public void internet() {
		System.out.println("아이폰11의 인터넷 기능 사용!");
	}

}