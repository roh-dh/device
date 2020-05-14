package api.exception;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("짜장면 갯수를 입력하세요.");
			int countJja = sc.nextInt();
			if(countJja<0) {
				throw new Exception("동환아 정신차리고 공부하자");
			}
			
			System.out.println("짬뽕의 갯수를 입력하세요.");
			int countJjam = sc.nextInt();
			
			
			sc.close();
			
			
			
		} catch (Exception e) {
//			System.out.println(e.getMessage());
			if (e.getMessage() == null) {
				System.err.println("오류발생");
			} else {
				System.out.println(e.getMessage()); // 원인메시지 출력
			}
		}
	}
}
