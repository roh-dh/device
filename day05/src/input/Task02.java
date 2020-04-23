package input;

import java.util.*;

public class Task02 {

	public static void main(String[] args) {
		/*		Test09.java
		PC방 충전 프로그램

		우리 PC방의 요금충전방식은 다음과 같습니다.

		1시간 요금은 1000원 입니다.
		시간을 충전하면 충전시간 1시간마다 10분을 더 줍니다.
		사용자에게 충전금액을 입력받고, 충전할 시간을 입력받은 뒤

		-실제 충전된 시간
		-거스름돈
		을 화면에 출력하세요(단, 돈을 부족하게 투입하는 경우는 없다고 가정합니다)
		*/

		//준비 1시간을 사용하고 // 5천원을 냈다고 가정을 해보자

//	준비
		Scanner sc = new Scanner(System.in);
		
		System.out.println("투입금액을 입력하세요");
		
		int money = 10000;
		System.out.println("이용시간을 설정하세요");
		int hour = 3;
		sc.close();

		int bonusPerHour = 10;
		int pricePerHour = 1000;
		
//	계산 =요금, 충전시간, 거스름돈
		int bonus= hour*bonusPerHour;
		int charge = hour*60;
		int total = charge+ bonus;
		
		int price = hour * pricePerHour;
		int change = money - price;
		
//	출력
		System.out.println("충전 시간 : "+hour+"시간 0분");
		System.out.println("보너스 시간 : "+bonus / 60 +"시간 " +bonus) ;
		System.out.println("총 충전 시간 : "+total / 60 + "시간"+ total%60 +"분");
		
		System.out.println("투입금액 : "+money+"원");
		System.out.println("이용요금 : "+price+"원");
		System.out.println("거스름돈 : "+change +"원");
		
	}

}
