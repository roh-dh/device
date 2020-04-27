package loop;

import java.lang.*;
import java.util.Random;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {

// 영원히 실행되는 구구단 문제 풀기 프로그램을 구현

// 1. 랜덤으로 구구단 문제를 낸다		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("구구단을 문제를 푸세요.");

			int a = r.nextInt(9 - 2 + 1) + 2;
			int b = r.nextInt(9 - 1 + 1) + 1;
			System.out.print(a + "X" + b + "=");

			int answer = sc.nextInt();

			if (answer == a * b) {
				System.out.println("정답");
			} else {
				System.out.println("오답입니다. 정답은 : "+a * b);
			}

		}

	}
}
