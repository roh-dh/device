package oop.modifier4;

public class Member {

	
//	setter
	private String id;
	private String nickname;
	private String grade;
	
	public void setId(String id) {
		this.id = id;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}

	
// getter	
	public String getId() {
		return id;
	}
	public String getNickname() {
		return nickname;
	}
	public String getGrade() {
		return grade;
	}
	
//	생성자
	public Member (String id, String nickname, String grade) {
		this.setId(id);
		this.setNickname(nickname);
		this.setGrade(grade);
		// +배송지
	}
	
//	출력
	void output() {
		System.out.println("아이디 : "+this.id);
		System.out.println("닉네임 : "+this.nickname);		
//		System.out.println("등급 : "+this.grade);
		
		
	}
	
	
	
	
	
	
	
	
}
