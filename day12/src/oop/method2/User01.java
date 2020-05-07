package oop.method2;

public class User01 {

//	멤버필드(데이터 저장)
	String nickname;
	String job;
	int level;
	int money;
	
// 설정 메소드(setting)
	void setting(String nickname, String job, int level, int money) {
		this.nickname = nickname;  //닉네임을 내닉네임(this.nickname)에 넣겠다.
		this.job = job;
		this.level = level;
		this.money = money;
	}

// 출력 메소드(output)
	void output() {
		System.out.print(this.nickname + "\t");
		System.out.print(this.job + "\t");
		System.out.print(this.level + "\t");
		System.out.println(this.money + "\t");
	}


}
