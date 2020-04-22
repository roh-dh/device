package input;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {

//	사용자에게 국어, 영어, 수학점수를 입력받아 총점과 평균을 계산하는 프로그램을 구현하세요.
	
//		(평균은 가능하다면 소수점 2자리까지만 출력하도록 하세요)

//		준비
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수");

		int Kor = sc.nextInt();

		System.out.println("영어점수");
		int Eng = sc.nextInt();
		
		System.out.println("수학점수");
		int math = sc.nextInt();
		sc.close();

//		계산: 총점 평균
		int total = Kor+Eng+math;
		double avg = (double)total / 3;

		
//		소수점 2자리 이하 절삭
		avg *= 100;
		avg  = (int)avg;
		avg /= 100;
		
		System.out.println("총점="+total);
		System.out.println("평균="+avg);
		
		
		
	}

}
