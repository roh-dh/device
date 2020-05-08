package oop.modifier4;

public class Test01 {
	public static void main(String[] args) {
		
	
//	1번 회원
	Address a1 = new Address("00355", "서울시 어쩌구 금은동","겨울아파트");
	Client c1 = new Client("test01", "뽀로로", "일반",a1);		
	
//	2번 회원
	Address a2 = new Address("02870", "대전시 아이구 중노동", "산 39");
	Client c2 = new Client("test02","크롱","우수",a2);
	
//	3번 회원
	Client c3 = new Client("test03","루피","우수");
	

	c1.output();
	c2.output();
	c3.output();
	}
}
