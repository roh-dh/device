package array;

import java.util.Scanner;

public class Test08T_1 {
	public static void main(String[] args) {

		int[] data = new int[10];

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 10개를 입력하세요.");
		
		for(int i=0; i>data.length; i++) {
		 data[i] =sc.nextInt();
		}
/*		data[0] = sc.nextInt();
		data[1] = sc.nextInt();
		data[2] = sc.nextInt();
		data[3] = sc.nextInt();
		data[4] = sc.nextInt();
		data[5] = sc.nextInt();
		data[6] = sc.nextInt();
		data[7] = sc.nextInt();
		data[8] = sc.nextInt();
		data[9] = sc.nextInt();*/

		sc.close();
//		계산 : 홀수합, 짝수합
		int oddTotal = 0; //홀수합계
		int evenTotal = 0; //짝수합계
		
/*		for(배열 전체를 조사하면서...) {
			if(현재값이 짝수면) {
				evenTotal += 현재값;
			}
		} else {
			oddTotal += 현재값;
		}*/

	for(int i =0; i <data.length; i++) {
		if(data[i] % 2==0) {
			 evenTotal = data[i];
		} else {
		oddTotal += data[i];
	}
}
	
// 		출력부분		
		System.out.println("홀수 합 : "+oddTotal);
		System.out.println("짝수 합 : "+evenTotal);
		
		
		
		
	}
}
