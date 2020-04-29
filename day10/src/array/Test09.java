package array;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {

// 시험 점수 관리 프로그램

// 우리반 학생들의 시험 성적이 다음과 같습니다.

//	[70, 85, 92, 66, 72, 88, 92, 70, 81, 93]

//		1. 우리반 학생들의 시험성적 평균

//		

		int score[] = new int[] { 70, 85, 92, 66, 72, 88, 92, 70, 81, 93 };
//									 +0  +1  +2 +3 +4 +5 +6 +7 +9 +10

/*		int total = 0;
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
			total += score[i];
		}
		System.out.println("학생들의 시험성적 합계");
		System.out.println(total);
		System.out.println("학생들의 시험성적 평균");
		double avg = (double) total / score.length;
		System.out.println(avg); */

//	2. 90점을 맞은 학생의 예상 등수를 구하여 출력(사용자가 입력해도 좋습니다.) // 높은점수 count 0 


		
		int myScore = 90;//내점수		
		int count = 0;
		for(int i =0; i < score.length; i++) {
			System.out.println("내점수: " +myScore+ "점, 니점수 : "+score[i]);
/*			if(내점수 < 니점수) {
				count++; *
			}*/
			if(myScore < score[i]) {
				count++;
			}
		}
		System.out.println("count = " +count);
		int rank = 1 + count;
		//	출력
		System.out.println("90점은 4등입니다. ");
		
		
	}
}
