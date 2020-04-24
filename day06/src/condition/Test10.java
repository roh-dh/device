package condition;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {

// 준비
		Scanner sc = new Scanner(System.in);
	
		int java = sc.nextInt();
		int python = sc.nextInt();

		sc.close();
		
//	계산 : 평균(점), 등급	
		int total = java + python;
		double average = (double) total / 2;
		
//		String grade = "A" or "B" or "C" or "D" or "F";
		String grade;
		if(average >= 90) {
			grade = "A";
		} else if (average >= 80) {
			grade = "B";
		} else if (average >= 70) {
			grade = "C";
		} else if (average >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
// 출력
		System.out.println("평균 : "+average+"72.5점");
		System.out.println("등급 : "+grade);
		
	}

}
