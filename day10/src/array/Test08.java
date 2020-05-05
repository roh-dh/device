package array;

import java.util.*;

public class Test08 {
	public static void main(String[] args) {

// 			사용자에게 10개의 숫자를 입력받아서 . "짝수"와 "홀수"로 구분하여 출력

//				 짝수합, 홀수합도 각각 따로 구해서 출력.

		int[] data = new int[10];

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 10개를 입력하세요.");

		int evenTotal = 0;
		int oddTotal = 0;
		for (int i = 0; i < data.length; i++) {
			data[i] = sc.nextInt();
			if (data[i] % 2 == 0) {
				System.out.println("짝수");
				evenTotal += data[i];
			} else {
				System.out.println("홀수");
				oddTotal += data[i];
			}

		}
		System.out.println("짝수 합 : " + evenTotal);
		System.out.println("홀수 합 : " + oddTotal);
	}
}