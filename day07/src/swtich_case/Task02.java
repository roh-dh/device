package swtich_case;

import java.util.*;

public class Task02 {

	public static void main(String[] args) {
		/*
		 * 이벤트 경품 행사를 진행중입니다.
		 * 
		 * 총 1000명을 대상으로 추첨을 진행하며, 경품 내역은 다음과 같습니다.
		 * 
		 * 1등(1명) : 최고급 세단 2등(3명) : 최고급 컴퓨터 3등(10명) : 태블릿 나머지 : 다음 기회에!(꽝) 실행하면 1회 추첨
		 * 결과가 나오도록 프로그램을 구현하세요.
		 */

//준비
		Random r = new Random();

//계산 1 : 최고급세단, 234: 최고급 컴퓨터, 5~14: 테블릿, 1000이하 다음기회에!(꽝)
		int prizeLottery = r.nextInt(1000) + 1;
		String result;
		
		if(prizeLottery==1) { 
			result = "최고급세단!!!!!!!!!";
		} else if(prizeLottery<5) {
			result = "최고급 컴퓨터!!!";
		} else if(prizeLottery<15) {
			result = "테블릿입니다!!";
		} else {
			result = "다음기회에! ^^;;";
		}
		System.out.println("추첨결과는!!! ");
		
		System.out.println("두구두구두구");
		System.out.println("두구두구두구");
		System.out.println("두구두구두구");
		System.out.println("두구두구두구");
		System.out.println("두구두구두구");
		System.out.println("두구두구두구");
		System.out.println("두구두구두구");
		System.out.println("두구두구두구");
		System.out.println("두구두구두구");
		
		System.out.println(result);
	}

}
