package opp.methodtask;

public class ScoreTeacher {

//	멤버 필드(변수)-데이터 저장
	String name;
	int korean;
	int english;
	int math;
	int total;
	double average;
	
//	멤버 메소드 - 코드 저장
	
//	옵션1 : 전체를 설정하는 setting 메소드
	void setting(String name, int korean, int english, int math) {
		this.name =name;
		this.korean =korean;
		this.english =english;
		this.math =math;
		this.total =this.korean + this.english + this.math;
		this.average =this.total / 3.0;
	}	
//	옵션2 : 점수를 1개만 받아서 국어점수로 설정하는 setting 메소드
		void setting(String name, int korean) {
			this.setting(name, korean, 0, 0);
		}
//	옵션3 : 점수를 2개 받아서 국어, 영어점수로 설정하는 setting 메소드
		void setting(String name, int korean, int english) {
			this.setting(name, korean, english, 0);
		}
		
	void output() {
		System.out.println("[학생 정보]");
		System.out.println("이름 : "+this.name);
		System.out.println("총점 : "+this.total+"?점");
		System.out.println("평균 : "+this.average+"?점");
		System.out.println();
	}
		
		
	}


	
		
			

