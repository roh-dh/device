package input;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
/*		윤년 계산 프로그램

		윤년은 2월이 29일까지 있는 해를 의미합니다.

		사용자에게 연도를 4자리 정수로 입력받아 윤년이면 true, 윤년이 아니면 false를 출력하는 프로그램을 구현하세요

		윤년을 판단하는 기준은 다음과 같습니다.

		1. 연도가 400의 배수이면 무조건 윤년입니다.
		2. 1번이 아닐 경우 연도가 100의 배수이면 윤년이 아닙니다.
		3. 1,2번이 아닐 경우 연도가 4의 배수이면 윤년입니다.
		
		2000년은 1번에 해당하므로 윤년입니다.
		2100년은 2번에 해당하므로 윤년이 아닙니다.
		2020년은 3번에 해당하므로 윤년입니다.
*/
		//준비
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력하세요");
		int year = sc.nextInt();
		
		boolean isCorrect = (year%400)==0;
		boolean isCorrect2 = (year%100)==0;
		boolean isCorrect3 = (year%4)==0;

//		System.out.println(isCorrect);
//		System.out.println(isCorrect2);
//		System.out.println(isCorrect3);
										
		boolean isCorrect4 = (isCorrect == isCorrect2) && (year%4==0);
		System.out.println(isCorrect4);
		//		boolean isCorrect = (1000 <= year) && (year <= 9999);		//4자리 정수를 입력받습니까?
//		System.out.println(isCorrect);											
		sc.close();
		//계산

		//출력
//		System.out.println(true); //2000	윤년(leapYear)이면 true
//		System.out.println(false); //2100
//		System.out.println(true); //2020
	}

}
