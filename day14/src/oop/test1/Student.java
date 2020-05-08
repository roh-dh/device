package oop.test1;

public class Student {
	String name; // String 앞에 아무것도 안쓰면 패키지까지만 포함됨.
	int score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}


}
