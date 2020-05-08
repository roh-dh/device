package oop.static2;

public class Test01 {
	public static void main(String[] args) {
// robot을 이용하여 10+ 20을 계산
//	-robot 안에 정적 메소드로 plus를 만들어 놨다. ex) 손님이 한명 열명이오건 커피 100잔 만들어 놓고 시작.
		
		int v = Robot.plus(10,20);
		System.out.println("v = " +v);
		
		
	}
}
