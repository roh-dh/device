package oop.inherit.constructor1;

//상위 클래스(추상적인..)
public class Phone {
	protected String number;
	protected String telecom;
	
	//생성자를 통해서 Phone의 필수 항목들을 초기화
	public Phone(String number, String telecom) {
		this.number = number;
		this.telecom = telecom;
	}
}