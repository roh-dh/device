package loop;

import java.util.Random;
import java.util.Scanner;

public class Test09_3 {
	public static void main(String[] args) {

//		30번 추첨 당첨 확률
int b =0;
Random r = new Random();
int count = 0;

		while(b<30) {
		
		int a = r.nextInt(100) + 1;
		if (a <= 2) {
			count++;
			System.out.println("당첨");
		} else {
			System.out.println("꽝");
		}
		b++;
		
		}
		System.out.println(count);
		

	}

}
