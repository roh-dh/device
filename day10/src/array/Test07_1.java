package array;

import java.util.*;

public class Test07_1 {
	public static void main(String[] args) {

// 주사위를 1000번 던질 계획	
// 각각의 값이 몇번 나오는지 알고 싶을때,
		Random r = new Random();

//		int[] count = new int[]	
		int[] count = new int[6];

//	count ----------->[ 0 ][ 0 ][ 0 ][ 0 ] [ 0][ 0 ]
//						   +0+1+2+3+4+5

		for (int i = 0; i < 10; i++) {
			int dice = r.nextInt(6) + 1;
			System.out.println("dice = " + dice);

			if (dice == 1) {
				count[0]++;
			} else if (dice == 2) {
				count[1]++;
			} else if (dice == 3) {
				count[2]++;
			} else if (dice == 4) {
				count[3]++;
			} else if (dice == 5) {
				count[4]++;
			} else if (dice == 6) {
				count[5]++;
			}
		}
		System.out.println("1 나온 횟수 : "+count[0]);
		System.out.println("2 나온 횟수 : "+count[1]);
		System.out.println("3 나온 횟수 : "+count[2]);
		System.out.println("4 나온 횟수 : "+count[3]);
		System.out.println("5 나온 횟수 : "+count[4]);
		System.out.println("6 나온 횟수 : "+count[5]);

		// [1]1000번 던져서 나온 숫자들을 나열

//		for(int i =0; i<10; i++) {
//			System.out.println("dice = " + data[i]);
//	}

	}
}
