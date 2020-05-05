package array;

import java.util.*;

public class Test07 {
	public static void main(String[] args) {

		// 주사위를 1000번 던질계획입니다.
//		 각각의 값이 몇번 나오는지 알고 싶을 때 이를 구하여 출력하세요.

			Random r = new Random();
			
			int[] repeat = new int[1000];
			int[] count = new int[6];
			
			for (int i = 0; i < repeat.length; i++) {
				int dice = r.nextInt(6) + 1;
			count[dice-1]++;	
//			if(dice==1){
//			count[0]++;
//			}
			}
			
			for(int i =0; i < count.length; i++) {
				System.out.println(i+" 나온 횟수 = "+count[i]);			
			}
	}
}

