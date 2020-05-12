package oop.inherit.abstract2;

//추상 클래스(abstract class)
// - 상속 관계에서 상위 역할을 수행하는 클래스
// - "추상 메소드"를 가질 수 있고 객체 생성이 불가능
// - 상속 관계에서 하위 클래스가 가질 요소들을 강제하는 능력이 있음
public abstract class Phone {
	protected String number;
	
//	추상 메소드 : 형태만 있고 내용이 없는 메소드
	public abstract void call();
	public abstract void sms();
	public abstract void internet();
}