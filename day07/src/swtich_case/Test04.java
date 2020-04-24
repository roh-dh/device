package swtich_case;

import java.util.Random;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {

// 사용자에게 연도를 입력받아 해당하는 연도의 무작위 날짜 1개를 출력

// 윤년일 경우 2월은 29일까지 있고, 윤년이 아닐 경우 2월은 28일까지 있습니다.

//준비
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력하세요");

		int year = sc.nextInt();
		sc.close();
		
		Random r = new Random();
		int m = r.nextInt(12)+1; //무작위 월
		int d = r.nextInt(30)+1;	// 무작위 일

int month;		
if(m==1) { 
	month =1;
}
		
		System.out.println();
		//출력
		System.out.println(year+"년 " +month+"월 "+day+"일 ");
		
		
	}
}
