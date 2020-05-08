package oop.final2;

public class Member {
	
	
	private final String id;
	private String password;
	
//final 항목은 반드시 생성자에서 초기화가 되어야 한다.
	public Member(String id) {
		this.id= id;
	}
	
	public Member(String id, String password) {
		this.id= id;
		this.password = password;
		
	}
	
	
	
}
