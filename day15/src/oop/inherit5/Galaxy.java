package oop.inherit5;

public class Galaxy extends Phone{

	//출력 메소드
	public void output() {
		System.out.println("번호 : "+this.number);
		
	}
	
	// 상송받은 메소드가 마음에 안들면 하나 더만든다.
	// -단, 똑같은 형태로 만들어야 한다.
	// -메소드 오버라이드(override)
	public void info() {
		System.out.println("GalaxyS20");
	}
}
