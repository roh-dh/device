package oop.inherit.abstract2;

public class GalaxyS20 extends Phone{

	@Override
	public void call() {
		System.out.println("갤럭시S20 전화기능 사용!");
	}

	@Override
	public void sms() {
		System.out.println("갤럭시S20 문자기능 사용!");
	}

	@Override
	public void internet() {
		System.out.println("갤럭시S20 인터넷 기능 사용!");
	}

}