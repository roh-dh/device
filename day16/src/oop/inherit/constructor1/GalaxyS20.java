package oop.inherit.constructor1;

public class GalaxyS20 extends Phone{

//	문제점 : 부모 클래스의 생성자를 맞춰주지 못했다
//	public GalaxyS20() {
//		super();
//	}
	
//	해결책 : 부모 클래스의 생성자를 맞춰준다
	private int sdCard;
	public GalaxyS20(String number, String telecom, int sdCard) {
		super(number, telecom);//부모 생성자 호출 코드(2개 데이터 전달)
		this.sdCard = sdCard;
	}
	
}