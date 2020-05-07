package oop.constructor1;

public class Student {
	
	String name;		//멤버변수(필드)		
	int score;			//=인스턴트변수
	//생성자(constructor)
	// -이 클래스의 생성 방법을 정의하는 구문
	// -생성자는 메소드의 특수화 형태
	// -객체 생성 시 1회만 호출
	// -객체의 데이터를 생성시 초기화하는 역할 수행
	// -이름은 클래스와 같아야 하며, 원한다면 오버로딩이 가능
	
	Student(/*매개변수*/String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	void output() {
		System.out.println(/*this.*/name);
		System.out.println(/*this.*/score);
	}
}
