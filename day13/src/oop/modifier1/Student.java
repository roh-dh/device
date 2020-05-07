package oop.modifier1;

public class Student {
//	private : 잠금
	private String name;
	private int score;

//	Student(){}//기본 생성자
	
//	우회 접근하도록 메소드 구축
//	- 이름 설정 메소드(setter)
//	- 점수 설정 메소드(setter)
	public void setName(String name) {
//		if(이름이 2글자 이상이라면) {
		if(name.length() >= 2) {
			this.name = name;
		}
	}
	public void setScore(int score) {
//		if(점수가 0 에서 100 사이라면) {
		if(score >= 0 && score <= 100) {
			this.score = score;
		}
	}
	
//	외부에서 데이터를 가져갈 수 있도록 하는 메소드
//	- getter method
//	- 이름을 반환하는 메소드
//	- 점수를 반환하는 메소드
	public String getName() {
		return this.name;
	}
	public int getScore() {
		return this.score;
	}
}

