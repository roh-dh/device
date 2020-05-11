package oop.inherit5;


//공통부분만 정의하고 생성은 안하는게 좋다(애매하니까)
public class Phone {
	
//  private = 내 클래스안에서만
//  package = 패키지까지만
//	protected = 패키지 + 상속받는 클래스들에게까지 허용하고 싶을 때
//  Public = 클래스안팍 패키지 안팍 모두
	protected String number;
	
	public void info() {
		System.out.println("Samsung Galaxy S20");
		
	}
}
