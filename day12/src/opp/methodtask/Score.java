package opp.methodtask;

public class Score {

//	[데이터 필드]
	String name;
	int kor;
	int eng;
	int mat;
	int total;
	double avg;
	
	
	void setting (String name,int kor) {
		this.setting(name, kor, 0,0);
	}

	void setting (String name,int kor,int Eng) {
		this.setting(name, kor, eng,0);
	}

	
	void setting(String name,int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;		
		this.total = total;
	}
	
		
	void total() {
		 this.total = (this.kor)+(this.eng)+(this.mat);
	}
	
	void avg() {
		this.avg = (double)total/3;
	}
	
	
	void output() {
		System.out.println("[학생 성적 정보]");
//		System.out.println("이름 : "+this.name);
//		System.out.println("국어점수 : "+this.kor);
//		System.out.println("영어점수 : "+this.eng);
//		System.out.println("수학점수 : "+this.mat);
		System.out.println("총점 : "+this.total);
		System.out.println("평균 : "+this.avg);
		
	 
		
		
		
	
		
		
	}	
}
