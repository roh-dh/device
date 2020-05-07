package oop.constructor2;

public class Member {
	String id;
	String pw;
	String power;
	int point;

	Member(String id, String pw){
		this(id, pw, "일반", 100);
	}
	
	Member(String id, String pw, String power, int point) {
		this.id = id;
		this.pw = pw;
		this.power = power;
		if (point >= 0) {
			this.point = point;
		}

	}
	void output() {
		System.out.println("아이디 : "+id);
		System.out.println("패스워드 : "+pw);
		System.out.println("권한 : "+power);
		System.out.println("포인트 : "+point);
		System.out.println();
		
		
		
	}

}
