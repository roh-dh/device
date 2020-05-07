package oop.modifier1;

public class Test01 {
	public static void main(String[] args) {
//		Student 생성 및 설정, 출력
		
		Student s = new Student();
		
//		s.name = "홍길동";
//		s.setName = "홍길동";
		s.setName("홍길동");
//		s.score = -5000;
		s.setScore(-5000);
		
//		System.out.println(s.name);
		System.out.println(s.getName());
//		System.out.println(s.score);
		System.out.println(s.getScore());
	}
}

