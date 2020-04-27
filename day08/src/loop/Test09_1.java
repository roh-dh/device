package loop;

import java.util.Random;

public class Test09_1 {
	public static void main(String[] args) {

		int k = 0;
		while (k < 30) {
			Random r = new Random();
			int n = r.nextInt(100) + 1;
			System.out.println("n = " + n);

			if (n <= 2) {
				System.out.println("당첨");
			} else {
				System.out.println("꽝");
			}

			k++;
		}

	}
}
