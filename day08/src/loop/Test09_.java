package loop;

import java.util.Random;

public class Test09_ {
	public static void main(String[] args) {

//		[1] 1번 추첨했을 때의 코드 작성		
//		[2] 1번 코드 반복 30번 처리
//		[3] 2번 코드에서 당첨된 횟수를 측정
//		[4] 3번 코드에서 횟수를 변수화
		
//		[1]
		Random r = new Random();
		int n = r.nextInt(100)+1;
		System.out.println("n = " + n);

		
if(n<=2) {
	System.out.println("당첨");
} else {
	System.out.println("꽝");
}
		
	}
}
