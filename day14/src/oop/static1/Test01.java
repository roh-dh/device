package oop.static1;

public class Test01 {
	public static void main(String[] args) {
//	Robot을 이용한 더하기 연산
		Robot rb = new Robot();
		
		rb.setA(10);
		rb.setB(20);
		rb.setC(rb.getA()+rb.getB());
		System.out.println(rb.getC());
		
		
		
	}
}
