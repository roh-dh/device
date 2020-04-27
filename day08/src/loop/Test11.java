package loop;

import java.util.*;

public class Test11 {
	public static void main(String[] args) {

// 주사위를 5가 나올 때까지 던지는 코드

		Random r = new Random();
		int count = 0;
		while (true) {
			int dice = r.nextInt(6) + 1;
			System.out.println("주사위 : " + dice);
			count++; //던지고 나서 카운트를 증가
			if (dice ==5) {
				break; //if를 제외한 가장 가까운 지역{}를 탈출하는 명령
			}
			try { Thread.sleep(500); } catch(Exception e) {}		//느리게 출력
		}
System.out.println(count +"번 던져서 나왔다..");
	}
}
