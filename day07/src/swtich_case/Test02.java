package swtich_case;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {

//	사용자에게 월을 정수로 입력받아서 해당하는 월의 날짜수를 화면에 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요.");
		int month = sc.nextInt();
		sc.close();
		
//계산 : 만약에 2월이라면 30일까지 있습니다. 

		int day;
		switch (month) {
		case 2: 
			day = 28; 
			break;
			
		case 1: case 4: case 6: case 9: case 11:
			day = 30; 
			break;
			
		default :
		day = 31; 
			break;
		
		
		}
		System.out.println(month+"월은 "+day+"일까지 있습니다.");

	}

}
