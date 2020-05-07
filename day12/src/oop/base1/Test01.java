package oop.base1;

public class Test01 {
	public static void main(String[] args) {
// Message를 생성(객체 생성 코드)
		Message a = new Message();

//		설정		
		a.sender = "엄마";
		a.content = "오늘도 밤새냐?";
		a.when = "오후 11:30";
		a.remain = 1;
		
		
//		출력
		System.out.println(a);
		System.out.println(a.sender);
		System.out.println(a.content);
		System.out.println(a.when);
		System.out.println(a.remain);
		
	}
}
