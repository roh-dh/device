package loop;

import java.lang.*;

import java.util.*;

public class Test05 {

	public static void main(String[] args) {

//	주사위를 10번 던지는 코드

		
// while 누적합 계산		
		Random r = new Random();
		
		int total = 0; // 1. 합계를 구할 변수를 선언(0으로 초기화)
		int n = 0;
		
		while (n < 10) {
			int dice = r.nextInt(6) + 1;
			System.out.println("주사위 : " + dice);

			total += dice;	// 2.값을 계속 저하여 합계를 누적시킴
//			System.out.println("누적 : "+ total);

			n++;
		}
		System.out.println("합계 : "+total); //3. 반복 후 결과 출력
		
		
		
	}
}
