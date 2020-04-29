package loop2;

import java.lang.*;

public class Test09_2 {
	public static void main(String[] args) {

//    [1] 숫자가 하나 주어졌을때 이 숫자를 1부터 자기자신까지 나누기해서 출력
		for(int j=1; j<=1000; j++) {
				
		int n = j;
		/*
		 * System.out.println("5%1 =0"); System.out.println("5%2 =1");
		 * System.out.println("5%3 =2"); System.out.println("5%4 =1");
		 * System.out.println("5%5 =0"); // 여기서 5는 리터럴 로 도구
		 * 
		 * System.out.println("?%? = ?");
		 */
		int count = 0;
//for(int i=1; i<=5; i++) {
		for (int i = 1; i <= n; i++) {
//			System.out.println("? % ? = ?");
//			System.out.println(n + " % ? = ?");
//			System.out.println(n + "%+ " + i + "=" + (n % i)); // n%i로 0의 갯수를 구한다.
			if (n % i == 0) {
				count++;
			}
		}
		System.out.println(count);
		String str;
		if (count == 2) {
			str = "소수입니다.";
//		} else {
//			str = "합성수입니다.";
		}
//		System.out.println("판정결과 : " + str);
		}
	}
}
