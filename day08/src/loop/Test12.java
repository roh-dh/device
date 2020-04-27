package loop;

import java.util.Random;

public class Test12 {

	public static void main(String[] args) {

//		어떤 게임에서 시작지점부터 종료지점까지 50칸이 있다.

//		주사위를 던져서 종료지점에 가려면 몇 번 던져야 하는지 구하여 출력

		// 주사위를 30번던졌을때 나오는 값

//		[1] 주사위를 무한으로 던지는 코드
//		[2] 1번 코드에서 주사위 값의 합계를 구한다.
//		[3] 2번에서 구한 합계가 50이 넘어가면 반복을 종료한다.
//		[4] 3번에서 주사위 던진 개수를 카운트한다.

//		[1]번
		Random r = new Random();
		int total = 0;
		int count = 0;
		
		while (true) {
			int dice = r.nextInt(6) + 1;
//			System.out.println("주사위 나온 값 : " + dice);

			total += dice;
//			System.out.println("합계 : " + total);
			count++;
			if (total >= 50) {
				break;
			}
			
		}
System.out.println("count : "+count);
	}

}
