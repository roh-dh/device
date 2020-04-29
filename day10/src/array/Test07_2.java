package array;

import java.util.*;

public class Test07_2 {
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

			count[dice-1]++;
/*			if (dice == 1) {
				count[dice-1]++;
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
			}*/
		}
		for(int i =0; i< count.length; i++) {
			System.out.println((i+1)+ "나온 횟수"+ count[i]);
		}

		// [1]1000번 던져서 나온 숫자들을 나열

//		for(int i =0; i<10; i++) {
//			System.out.println("dice = " + data[i]);
//	}

	}
}
