package condition;

import java.util.Scanner;

public class Test03 {
	public static void main(String[]args) {
//		우리반의 시험기준은 다음과 같습니다.

//		한 과목에 시험을 두 번 봅니다(서술형, 실습형)
//		두 과목의 평균이 60점 이상이면 통과
//		한 과목이라도 40점 미만이라면 재평가
//		두 과목의 평균이 60점 미만이어도 재평가
//		시험점수를 각각 입력받아 해당하는 사람의 과목 평가 결과를 출력		
		
	//시험점수를 각각 입력받아
		Scanner sc = new Scanner(System.in);
		System.out.println("서술형 점수를 입력하세요.");
		int score = sc.nextInt();
		System.out.println("실습형 점수를 입력하세요.");
		int score2 = sc.nextInt();
		sc.close();
	//해당하는 평가 과목 평가 결과

		double avg = (double) (score+score2) / 2; //평균
		boolean isPass = avg>=60 && (score >=40 && score2 >=40);
	
	if(isPass) {
		System.out.println("통과하셨습니다.");
	} else {
		System.out.println("재평가 대상입니다.");
	}
	}	

}
