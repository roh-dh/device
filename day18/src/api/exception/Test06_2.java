package api.exception;

import java.util.Scanner;

public class Test06_2 {
	public static void main(String[] args) {
//finally : 마지막에 무조건 실행할 코드 영역
			Scanner sc = new Scanner(System.in);
			
			try {
			System.out.println("짜장면 갯수를 입력하세요.");
			int a = sc.nextInt();
			
			System.out.println("짬뽕의 갯수를 입력하세요.");
			int b = sc.nextInt();
			
			if(a+b<= 0) {
				throw new Exception("최소 한 그릇은 주문하셔야 합니다.");
			}
			sc.close();
			
			
			
		} catch (Exception e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {// 예외 여부와 관계없이 무조건 마지막에 실행되는 구문
			sc.close();
		}
	}
}