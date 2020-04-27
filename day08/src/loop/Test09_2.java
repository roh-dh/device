package loop;

import java.util.Random;

public class Test09_2 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int k = 0;
		int count = 0; // 카운트 측정 변수

		while (k < 30) {
			int n = r.nextInt(100) + 1;
//			System.out.println("n = " + n);

			if (n <= 2) {
//				System.out.println("당첨");
				count++;
				System.out.println(count);
//			} else {
//				System.out.println("꽝");
			}

			k++;
		}
		System.out.println("당첨 횟수 : " + count);
	}

}


