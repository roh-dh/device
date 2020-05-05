package array;

import java.util.Scanner;

import java.util.*;
public class Test09 {
	public static void main(String[] args) {

		/*		시험 점수 관리 프로그램

		우리반 학생들의 시험 성적이 다음과 같습니다.

		[ 70, 85, 92, 66, 72, 88, 92, 70, 81, 93 ]

		우리반 학생들의 시험성적 평균출력

		90점을 맞은 학생의 예상 등수를 구하여 출력(사용자가 입력해도 좋습니다)*/
	
		
		int[] score = new int[] { 70, 85, 92, 66, 72, 88, 92, 70, 81, 93 };
		int total = 0;
		int count = 0; // 나보다 점수높은사람 숫자를 셀거임.
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int myscore = sc.nextInt(); 
		
		for(int i=0; i<score.length; i++) {
			total += score[i];
			if(score[i]>myscore) {
				count++;
			}
//				sc.close();
		}
		double avg = (double)total/score.length;
//		System.out.println("나보다 시험잘본 숫자"+count); 
		int rank = count+1;
		System.out.println("평균 : " + avg+"점");
		System.out.println("순위 : " + rank+"등");
		
		
		
		
		
/*		int[] score = new int[]{70, 85, 92, 66, 72, 88, 92, 70, 81, 93};
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int total = 0;
		double avg = 0;
		int count =0; //나보다 잘난놈 카운트
		
		for(int i=0; i<score.length; i++) {
			total = total+score[i];
			avg = (double)total/score.length;
			if(score[i]>input) {
				count++;
			}
		}
		System.out.println("합계"+total);
		System.out.println("평균"+avg);
		int rank = count+1;
		System.out.println("등수 = "+(rank)+"등");
*/	
		
	}
}
