package api.exception;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
//	try ~with 구문 : 자동 close를 수행  (스트림 이용 시)

		try (Scanner sc = new Scanner(System.in);) {
			System.out.println("짜장면 갯수를 입력하세요.");
			int a = sc.nextInt();

			System.out.println("짬뽕의 갯수를 입력하세요.");
			int b = sc.nextInt();

			if (a + b <= 0) {
				throw new Exception("최소 한 그릇은 주문하셔야 합니다.");
			}
			sc.close();

		} catch (Exception e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}