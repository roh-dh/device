package api.lang.string;

import java.util.Scanner;

public class Test04_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		필요 데이터 : 제시어
		String given = "바나나";
		
		while(true) {
			System.out.println("제시어 : "+given);
			String input = sc.next();
			
			if(input.length() != 3) {//3글자가 아니면
				break;//게임오버
			}
//			char last = given.charAt(2);
			char last = given.charAt(given.length() - 1);
			if(input.startsWith(""+last) == false) {
				break;
			}
			
			//제시어 교체
			given = input;
		}
		
		sc.close();
		System.out.println("게임 오버!");
	}
}