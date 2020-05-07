package oop.method3;

public class Arcade {

//	멤버필드(데이터저장)
	String name;
	int price;
	int income;

	
//	설정메소드	
	void setting(String name, int price) {
		this.name = name;
		this.price = price;
//		this.income = 0;
		this.setting(name, price, 0); //아래로 몰아주기(오버로딩 중복코드 방지)
		
	}
	void setting(String name, int price, int income) {
		this.name = name;
		this.price = price;
		this.income = 0;
	}
	

// 출력메소드
	void output() {
		System.out.println("[오락기 정보]");
		System.out.println("이름 : "+this.name);
		System.out.println("가격 : "+this.price+"원");
		System.out.println("누적수입 : " +this.income+"원");
	}
		
	
//	누적금액
	/*
	  메소드 오버로딩(method overloading)
	 = 같은이름의 메소드가 여러개 만드는 행위
	  - 다양한 경우를 가정하여 이용 방법에 차이를 두도록 구성
	  - 아무때나 되는 것은 아니고 다음 조건에 맞아야 함
	  - 이름은 같아야 함.
	  - 매개변수가 달라야 함.()괄호안에 쓰는것
	    1. 개수가 다르거나   () <- 0개 (int pan) <- 1개
	    2. 자료형이 다르거나
	    3. 순서가 다르거나
	 */
	
	
	
	void play() {
//		this.income += this.price;
		this.play(1); //오버로딩 중복코드 방지 밑으로 몰아줌.
	}
			
	void play(int pan) {
		this.income += this.price * pan;
	}				
}
